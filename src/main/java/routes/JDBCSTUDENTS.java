package routes;

import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static spark.Spark.get;
import static spark.Spark.post;

public class JDBCSTUDENTS {


    List<String> list_of_students_names = new ArrayList<>();
    List<String> list_of_students_surnames = new ArrayList<>();
    List<String> list_of_students_middle_names = new ArrayList<>();
    List<Integer> list_of_students_numbers = new ArrayList<>();
    List<String> list_of_students_titles = new ArrayList<>();
    List<String> list_of_students_gender = new ArrayList<>();
    List<Integer> list_of_students_cellphone_number = new ArrayList<>();
    List<String> list_of_students_emails = new ArrayList<>();

    // parent spouse guardian
    List<Integer> list_of_parent_numbers = new ArrayList<>();
    List<String> list_of_parents_email_address = new ArrayList<>();

    private static final String SQL_INSERT = "INSERT INTO STUDENT (STUDENT_NUMBER, STUDENT_NAME, SECOND_NAME," +
            "SURNAME, CONTACT, EMAIL, GENDER, TITLE,PARENT_CONTACT,PARENT_EMAIL) VALUES (?,?,?,?,?,?,?,?,?,?)";
    //    private static final String SQL_UPDATE = "UPDATE STUDENT SET SALARY=? WHERE NAME=?";
//    String sql = "SELECT STUDENT_NUMBER ,STUDENT_NAME, SURNAME FROM STUDENT";


    private static final String SQL_TABLE_CREATE = new StringBuilder()
            .append("CREATE TABLE STUDENT")
            .append("(")
            .append("STUDENT_NUMBER integer not null primary key,")
            .append("STUDENT_NAME VARCHAR(25),")
            .append("SECOND_NAME VARCHAR(25),")
            .append("SURNAME VARCHAR(25),")
            .append("CONTACT integer,")
            .append("EMAIL VARCHAR(25),")
            .append("GENDER VARCHAR(7),")
            .append("TITLE VARCHAR(5),")
            .append("PARENT_CONTACT integer,")
            .append("PARENT_EMAIL VARCHAR(25)")
            .append(")")
            .toString();

    private static final String SQL_TABLE_DROP = "DROP TABLE STUDENT";


    public void runJDBCStudent() {

        get("/addstudent", (req, res) -> {
            Map<String, Object> school_form_map = new HashMap<>();
            return new HandlebarsTemplateEngine().render(new ModelAndView(school_form_map, "addstudent.handlebars"));
        });

        post("/addstudent", (req, res) -> {

            Map<String, Object> school_form_map = new HashMap<>();


            // initializing variables with inputs fields
            String add_student_surname = req.queryParams("element_3_1");
            String add_student_name = /*"name(s)" +*/req.queryParams("element_3_2");
            String add_student_middle_name = req.queryParams("element_14_1");
            String add_student_number = req.queryParams("element_14_1_1");
            String add_student_title = req.queryParams("element_17");
            String add_student_gender = req.queryParams("element_15");
            String add_student_email = req.queryParams("element_14_10");
            String add_student_cellphone_number = req.queryParams("element_10_1");
            add_student_cellphone_number += req.queryParams("element_10_2");
            add_student_cellphone_number += req.queryParams("element_10_3");

            String add_parents_email_address = req.queryParams("element_14_120");
            String add_parent_number = req.queryParams("element_10_01");
            add_parent_number += req.queryParams("element_10_02");
            add_parent_number += req.queryParams("element_10_03");


            int s_number = Integer.parseInt(add_student_cellphone_number);
            int s_student_number = Integer.parseInt(add_student_number);
            int p_number = Integer.parseInt(add_parent_number);


            // adding data from the input
            school_form_map.put("add_student_surname", add_student_surname);
            school_form_map.put("add_student_name", add_student_name);
            school_form_map.put("add_student_middle_name", add_student_middle_name);
            school_form_map.put("add_student_number", s_student_number);
            school_form_map.put("add_student_title", add_student_title);
            school_form_map.put("add_student_gender", add_student_gender);
            school_form_map.put("add_student_cellphone_number", s_number);
            school_form_map.put("add_student_email", add_student_email);

            //parent
            school_form_map.put("add_parents_email_address", add_parents_email_address);
            school_form_map.put("add_parent_number", p_number);


            // adding names to the list from html inputs fields
            list_of_students_surnames.add(add_student_surname);
            list_of_students_names.add(add_student_name);
            list_of_students_middle_names.add(add_student_middle_name);
            list_of_students_numbers.add(s_student_number);
            list_of_students_titles.add(add_student_title);
            list_of_students_gender.add(add_student_gender);
            list_of_students_cellphone_number.add(s_number);
            list_of_students_emails.add(add_student_email);

            //parent
            list_of_parent_numbers.add(p_number);
            list_of_parents_email_address.add(add_parents_email_address);

            // adding names from the list to the Map
            school_form_map.put("list_of_students_surnames", list_of_students_surnames);
            school_form_map.put("list_of_students_names", list_of_students_names);
            school_form_map.put("list_of_students_middle_names", list_of_students_middle_names);
            school_form_map.put("list_of_students_numbers", list_of_students_numbers);
            school_form_map.put("list_of_students_titles", list_of_students_titles);
            school_form_map.put("list_of_students_gender", list_of_students_gender);
            school_form_map.put("list_of_students_cellphone_number", list_of_students_cellphone_number);
            school_form_map.put("list_of_students_emails", list_of_students_emails);

            //parent
            school_form_map.put("list_of_parent_numbers", list_of_parent_numbers);
            school_form_map.put("list_of_parents_email_address", list_of_parents_email_address);


            try (Connection conn = DriverManager.getConnection(
                    "jdbc:postgresql://127.0.0.1:5432/onlineRegister", "coder", "pg123");
                 Statement statement = conn.createStatement(); PreparedStatement psinsert = conn.prepareStatement(SQL_INSERT);
                 PreparedStatement psupdate = conn.prepareStatement("SQL_UPDATE")) {

                if (conn != null) {
                    System.out.println("Connected to the database!");
                } else {
                    System.out.println("Failed to make connection!");
                }


//                statement.execute(SQL_TABLE_DROP); //JUST TO CLEAN THE DATABASE
//                statement.execute(SQL_TABLE_CREATE);


                psinsert.setInt(1, s_student_number);
                psinsert.setString(2, add_student_name);
                psinsert.setString(3, add_student_middle_name);
                psinsert.setString(4, add_student_surname);
                psinsert.setInt(5, s_number);
                psinsert.setString(6, add_student_email);
                psinsert.setString(7, add_student_title);
                psinsert.setString(8, add_student_gender);
                psinsert.setInt(9, p_number);
                psinsert.setString(10, add_parents_email_address);
                psinsert.execute();


            } catch (SQLException e) {
                System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }

            return new HandlebarsTemplateEngine().render(new ModelAndView(school_form_map, "addstudent.handlebars"));
        });
    }


}
