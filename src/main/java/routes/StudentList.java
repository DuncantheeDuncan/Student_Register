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

public class StudentList  extends AddStudents{

//    List <AddStudents> list = new ArrayList<>();
//
//    String GET_STUDENTS = "select STUDENT_NUMBER, STUDENT_NAME, SECOND_NAME," +
//            "SURNAME, " +
////            "CONTACT, EMAIL," +
////            " GENDER, TITLE,PARENT_CONTACT,PARENT_EMAIL" +
//            " from student";


    public void listStudents(){


       get("/studentlist",(req, res) ->{
//           Map<String, Object> map = new HashMap<>();
           Map<String, Object> school_form_map = new HashMap<>();

           List<String> student_names = new ArrayList<String>();
           List<String> student_surnames = new ArrayList<String>();
           List<Integer> studentnumbers = new ArrayList<Integer>();

           // populate students from the database

           try (Connection conn = DriverManager.getConnection(
                   "jdbc:postgresql://127.0.0.1:5432/onlineRegister", "coder", "pg123"); Statement statement = conn.createStatement()) {

               if (conn == null)
                   System.out.println("Failed to make connection to the DATABASE!");


               String sql = "SELECT STUDENT_NUMBER ,STUDENT_NAME, SURNAME FROM STUDENT";
               ResultSet resultSet = statement.executeQuery(sql);
               while (resultSet.next()) {
                   int student_number = resultSet.getInt("STUDENT_NUMBER");
                   String student_name = resultSet.getString("STUDENT_NAME");
                   String surname = resultSet.getString("SURNAME");


                   student_names.add(student_name);
                   student_surnames.add(surname);
                   studentnumbers.add(student_number);

               }

           } catch (SQLException e) {
               System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
               e.printStackTrace();
           } catch (Exception e) {
               e.printStackTrace();
           }





           school_form_map.put("student_names", student_names);
           school_form_map.put("student_surnames",student_surnames);
           school_form_map.put("studentnumbers",studentnumbers);


           return new HandlebarsTemplateEngine().render(new ModelAndView(school_form_map, "studentlist.handlebars"));
       });

       post("/studentlist", (req, response)-> {
           Map<String, Object> school_form_map = new HashMap<>();
           List<String> student_names = new ArrayList<String>();
           List<String> student_surnames = new ArrayList<String>();
           List<Integer> studentnumbers = new ArrayList<Integer>();


           // populate students from the database

           try (Connection conn = DriverManager.getConnection(
                   "jdbc:postgresql://127.0.0.1:5432/onlineRegister", "coder", "pg123"); Statement statement = conn.createStatement()) {

               if (conn == null)
                   System.out.println("Failed to make connection to the DATABASE!");


               String sql = "SELECT STUDENT_NUMBER ,STUDENT_NAME, SURNAME FROM STUDENT";
               ResultSet resultSet = statement.executeQuery(sql);
               while (resultSet.next()) {
                   int student_number = resultSet.getInt("STUDENT_NUMBER");
                   String student_name = resultSet.getString("STUDENT_NAME");
                   String surname = resultSet.getString("SURNAME");


                   student_names.add(student_name);
                   student_surnames.add(surname);
                   studentnumbers.add(student_number);


               }

           } catch (SQLException e) {
               System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
               e.printStackTrace();
           } catch (Exception e) {
               e.printStackTrace();
           }

           school_form_map.put("student_names", student_names);
           school_form_map.put("student_surnames",student_surnames);
           school_form_map.put("studentnumbers",studentnumbers);

           return new HandlebarsTemplateEngine().render(new ModelAndView(school_form_map, "studentlist.handlebars"));
       });
   }

}
