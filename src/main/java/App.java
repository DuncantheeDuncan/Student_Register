
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
        initExceptionHandler((e) -> System.out.println("Uh-oh"));
        // root is 'src/main/resources', so put files in 'src/main/resources/public'

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
        List <String> list_of_students_numbers = new ArrayList<>();
        List <String> list_of_students_titles = new ArrayList<>();
        List <String> list_of_students_gender = new ArrayList<>();
        List <String> list_of_students_cellphone_number = new ArrayList<>();


        get("/greet", (req, res) -> "<h1>Hello World</h1>");// if a keyword is specified in the url
        post("/greet", ((request, response) -> "hello, Duncan"));// testing if only a link is typed


//        res.redirect("/hello"); // redirect a page!!!



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
            /*String*/ add_student_cellphone_number += "-"+req.queryParams("element_10_2");
            /*String*/ add_student_cellphone_number += "-"+req.queryParams("element_10_3");


            // adding data from the input
            school_form_map.put("add_student_surname", add_student_surname);
            school_form_map.put("add_student_name", add_student_name);
            school_form_map.put("add_student_middle_name", add_student_middle_name);
            school_form_map.put("add_student_number",add_student_number);
            school_form_map.put("add_student_title",add_student_title);
            school_form_map.put("add_student_gender",add_student_gender);
            school_form_map.put("add_student_cellphone_number",add_student_cellphone_number);


            // adding names to the list
            list_of_students_surnames.add(add_student_surname);
            list_of_students_names_names.add(add_student_name);
            list_of_students_middle_names.add(add_student_middle_name);
            list_of_students_numbers.add(add_student_number);
            list_of_students_titles.add(add_student_title);
            list_of_students_gender.add(add_student_gender);
            list_of_students_cellphone_number.add(add_student_cellphone_number);



            // adding names from the list
            school_form_map.put("list_of_students_surnames",list_of_students_surnames);
            school_form_map.put("list_of_students_names_names",list_of_students_names_names);
            school_form_map.put("list_of_students_middle_names",list_of_students_middle_names);
            school_form_map.put("list_of_students_numbers",list_of_students_numbers);
            school_form_map.put("list_of_students_titles",list_of_students_titles);
            school_form_map.put("list_of_students_gender",list_of_students_gender);
            school_form_map.put("list_of_students_cellphone_number",list_of_students_cellphone_number);


            System.out.println(list_of_students_names_names.toString()+ " these are the names");
            System.out.println(list_of_students_surnames.toString()+ " these are surnames");
            System.out.println(list_of_students_middle_names.toString()+ " these are the middle names");
            System.out.println(list_of_students_numbers.toString()+ " Student number");
            System.out.println(list_of_students_titles.toString()+ "  student title");
            System.out.println(list_of_students_gender.toString() + " gender");
            System.out.println(list_of_students_cellphone_number.toString() + " student number");

            return new HandlebarsTemplateEngine().render(new ModelAndView(school_form_map, "addstudent.handlebars"));
        });// testing if only a link is typed





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
//
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
