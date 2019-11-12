
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static spark.Spark.*;

public class App {

    public static void main(String[] args) {
        port(8080);// Spark will run on port 8080
//        initExceptionHandler((e) -> System.out.println("Uh-oh"));
        // root is 'src/main/resources', so put files in 'src/main/resources/public'
        //      res.redirect("/hello"); // redirect a page!!!


//TODO: static files

        staticFiles.location("/public");
        staticFiles.location("/templates");
        staticFiles.location("/templates");
        staticFiles.location("/templates/js");





//TODO:  HASH-MAPS  / LIST
        List <String> names = new ArrayList<>();
        List <String> list_of_students_names_names = new ArrayList<>();
        List <String> list_of_students_surnames = new ArrayList<>();
        List <String> list_of_students_middle_names = new ArrayList<>();
        List <Integer> list_of_students_numbers = new ArrayList<>();
        List <String> list_of_students_titles = new ArrayList<>();
        List <String> list_of_students_gender = new ArrayList<>();
        List <Integer> list_of_students_cellphone_number = new ArrayList<>();
        List <String> list_of_students_emails = new ArrayList<>();
        List <String> list_of_street_address_for_students = new ArrayList<>();
        List <String> list_of_suburb_address_for_students = new ArrayList<>();
        List <String> list_of_city_address_for_students = new ArrayList<>();
        List <String> list_of_provinc_address_for_student =new ArrayList<>();
        List <Integer> list_of_zip_codes_for_students = new ArrayList<>();
        List <String> list_of_countries_address_for_students = new ArrayList<>();


        // parent spouse guardian
        List <Integer> list_of_parent_numbers = new ArrayList<>();
        List <String> list_of_parents_email_address = new ArrayList<>();
        List <String> list_of_parents_street_address =new ArrayList<>();
        List <String> list_of_parents_suburb_address = new ArrayList<>();
        List <String> list_of_parents_city_address = new ArrayList<>();
        List <String> list_of_parents_province_address = new ArrayList<>();
        List <Integer> list_of_parents_zip_code_address = new ArrayList<>();
        List <String> list_of_parents_country_address = new ArrayList<>();




        get("/greet", (req, res) -> "<h1>Hello World</h1>");// if a keyword is specified in the url
        post("/greet", ((request, response) -> "hello, Duncan"));// testing if only a link is typed


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
            String add_student_cellphone_number = req.queryParams("element_10_1");
            /*String*/ add_student_cellphone_number += req.queryParams("element_10_2");
            /*String*/ add_student_cellphone_number += req.queryParams("element_10_3");
            String add_student_email = req.queryParams("element_14_10");
            String add_student_street_address = req.queryParams("element_5_1");
            String add_student_suburb_address = req.queryParams("element_5_2");
            String add_student_city_address = req.queryParams("element_5_3");
            String add_student_province_address = req.queryParams("element_5_4");
            String add_student_zip_code = req.queryParams("element_5_5");
            String add_student_country_address = req.queryParams("element_5_6");


            // parent spouse guardian
            String add_parent_number =req.queryParams("element_10_01");
            /*String*/ add_parent_number +=req.queryParams("element_10_02");
            /*String*/ add_parent_number +=req.queryParams("element_10_03");
            String add_parents_email_address = req.queryParams("element_14_120");
            String add_parents_street_address = req.queryParams("element_5_01");
            String add_parents_suburb_address = req.queryParams("element_5_02");
            String add_parents_city_address = req.queryParams("element_5_03");
            String add_parents_province_address = req.queryParams("element_5_04");
            String add_parents_zip_code_address = req.queryParams("element_5_05");
            String add_parents_country_address = req.queryParams("element_5_06");






            // adding data from the input
            school_form_map.put("add_student_surname", add_student_surname);
            school_form_map.put("add_student_name", add_student_name);
            school_form_map.put("add_student_middle_name", add_student_middle_name);
            school_form_map.put("add_student_number",add_student_number);
            school_form_map.put("add_student_title",add_student_title);
            school_form_map.put("add_student_gender",add_student_gender);
            school_form_map.put("add_student_cellphone_number",add_student_cellphone_number);
            school_form_map.put("add_student_email",add_student_email);
            school_form_map.put("add_student_street_address",add_student_street_address);
            school_form_map.put("add_student_suburb_address",add_student_suburb_address);
            school_form_map.put("add_student_city_address",add_student_city_address);
            school_form_map.put("add_student_province_address",add_student_province_address);
            school_form_map.put("add_student_zip_code",add_student_zip_code);
            school_form_map.put("add_student_country_address",add_student_country_address);

            // parent spouse guardian
            school_form_map.put("add_parent_number",add_parent_number);
            school_form_map.put("add_parents_email_address",add_parents_email_address);
            school_form_map.put("add_parents_street_address",add_parents_street_address);
            school_form_map.put("add_parents_suburb_address",add_parents_suburb_address);
            school_form_map.put("add_parents_city_address",add_parents_city_address);
            school_form_map.put("add_parents_province_address",add_parents_province_address);
            school_form_map.put("add_parents_zip_code_address",add_parents_zip_code_address);
            school_form_map.put("add_parents_country_address",add_parents_country_address);






            // adding names to the list from html inputs fields
            list_of_students_surnames.add(add_student_surname);
            list_of_students_names_names.add(add_student_name);
            list_of_students_middle_names.add(add_student_middle_name);
            list_of_students_numbers.add(Integer.parseInt(add_student_number));
            list_of_students_titles.add(add_student_title);
            list_of_students_gender.add(add_student_gender);
            list_of_students_cellphone_number.add(Integer.parseInt(add_student_cellphone_number));
            list_of_students_emails.add(add_student_email);
            list_of_street_address_for_students.add(add_student_street_address);
            list_of_suburb_address_for_students.add(add_student_suburb_address);
            list_of_city_address_for_students.add(add_student_city_address);
            list_of_provinc_address_for_student.add(add_student_province_address);
            list_of_zip_codes_for_students.add(Integer.parseInt(add_student_zip_code));
            list_of_countries_address_for_students.add(add_student_country_address);

            // parent spouse guardian
            list_of_parent_numbers.add(Integer.parseInt(add_parent_number));
            list_of_parents_email_address.add(add_parents_email_address);
            list_of_parents_street_address.add(add_parents_street_address);
            list_of_parents_suburb_address.add(add_parents_suburb_address);
            list_of_parents_city_address.add(add_parents_city_address);
            list_of_parents_province_address.add(add_parents_province_address);
            list_of_parents_zip_code_address.add(Integer.parseInt(add_parents_zip_code_address));
            list_of_parents_country_address.add(add_parents_country_address);







            // adding names from the list to the Map
            school_form_map.put("list_of_students_surnames",list_of_students_surnames);
            school_form_map.put("list_of_students_names_names",list_of_students_names_names);
            school_form_map.put("list_of_students_middle_names",list_of_students_middle_names);
            school_form_map.put("list_of_students_numbers",list_of_students_numbers);
            school_form_map.put("list_of_students_titles",list_of_students_titles);
            school_form_map.put("list_of_students_gender",list_of_students_gender);
            school_form_map.put("list_of_students_cellphone_number",list_of_students_cellphone_number);
            school_form_map.put("list_of_students_emails",list_of_students_emails);
            school_form_map.put("list_of_street_address_for_students",list_of_street_address_for_students);
            school_form_map.put("list_of_suburb_address_for_students",list_of_suburb_address_for_students);
            school_form_map.put("list_of_city_address_for_students",list_of_city_address_for_students);
            school_form_map.put("list_of_provinc_address_for_student",list_of_provinc_address_for_student);
            school_form_map.put("list_of_zip_codes_for_students",list_of_zip_codes_for_students);
            school_form_map.put("list_of_countries_address_for_students",list_of_countries_address_for_students);



            // parent spouse guardian
            school_form_map.put("list_of_parent_numbers",list_of_parent_numbers);
            school_form_map.put("list_of_parents_email_address",list_of_parents_email_address);
            school_form_map.put("list_of_parents_street_address",list_of_parents_street_address);
            school_form_map.put("list_of_parents_suburb_address",list_of_parents_suburb_address);
            school_form_map.put("list_of_parents_city_address",list_of_parents_city_address);
            school_form_map.put("list_of_parents_province_address",list_of_parents_province_address);
            school_form_map.put("list_of_parents_zip_code_address",list_of_parents_zip_code_address);
            school_form_map.put("list_of_parents_country_address",list_of_parents_country_address);






            System.out.println(list_of_students_names_names.toString()+ " these are the names");
            System.out.println(list_of_students_surnames.toString()+ " these are surnames");
            System.out.println(list_of_students_middle_names.toString()+ " these are the middle names");
            System.out.println(list_of_students_numbers.toString()+ " Student number");
            System.out.println(list_of_students_titles.toString()+ "  student title");
            System.out.println(list_of_students_gender.toString() + " gender");
            System.out.println(list_of_students_cellphone_number.toString() + " student number");
            System.out.println(list_of_students_emails + " email");
            System.out.println(list_of_street_address_for_students.toString() + " street address");
            System.out.println(list_of_suburb_address_for_students.toString() + " suburb");
            System.out.println(list_of_city_address_for_students.toString() + " city");
            System.out.println(list_of_provinc_address_for_student.toString() + " province");
            System.out.println(list_of_zip_codes_for_students.toString() + "zip code");
            System.out.println(list_of_countries_address_for_students.toString() + " country");

            System.out.println(list_of_parent_numbers.toString() + "parents number");
            System.out.println(list_of_parents_email_address.toString() + " parents email");
            System.out.println(list_of_parents_street_address.toString() + " STREET ADDRESS");
            System.out.println(list_of_parents_suburb_address.toString() + " SUBURB");
            System.out.println(list_of_parents_city_address.toString()+ " city");
            System.out.println(list_of_parents_province_address.toString() + " province");
            System.out.println(list_of_parents_zip_code_address.toString() + " zip codes");
            System.out.println(list_of_parents_country_address.toString() + " country");



            return new HandlebarsTemplateEngine().render(new ModelAndView(school_form_map, "addstudent.handlebars"));
        });// testing if only a link is typed






        get("/hello",(req, res) ->{
            Map<String, Object> map = new HashMap<>();
            return new HandlebarsTemplateEngine().render(new ModelAndView(map, "hello.handlebars"));
        });

        post("/hello", (req, response)-> {
            Map<String, Object> map = new HashMap<>();
            // create the greeting message
            String greeting = /*"Hello, " +*/ req.queryParams("username");
            // put it in the map which is passed to the template - the value will be merged into the template
            map.put("greeting", greeting); // adding
            names.add(greeting);
            map.put("names",names);
            System.out.println(names.toString()+ " these are the names");
            return new HandlebarsTemplateEngine().render(new ModelAndView(map, "hello.handlebars"));
        });


//
//
//
//        get("/greet", (req, res) -> "<h1>Hello World</h1>");
//
//        post("/greet", ((request, response) -> "hello, Duncan"));
//
//
//
//        get("/confirm", (req, res) -> {
//            Map<String, Object> map = new HashMap<>();

//            return new HandlebarsTemplateEngine().render(new ModelAndView(map, "confirm.handlebars"));
//        });// if a keyword is specified in the url
//        post("/confirm", ((request, response) -> {
//            Map<String, Object> map = new HashMap<>();
//
//            map.put("names",names);
//            System.out.println(names.toString()+ " these are the names");
//
//            return new HandlebarsTemplateEngine().render(new ModelAndView(map, "confirm.handlebars"));
//        }));// testing if only a link is typed
//
//


    }


}
