package routes;

import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static spark.Spark.*;

public class AddLectures{
    public  void runLecture(){

//        port(8080);// Spark will run on port 8080


//TODO: static files

//        staticFiles.location("/public");
//        staticFiles.location("/templates");



//TODO:  HASH-MAPS  / LIST
        List <String> list_of_lectures_names = new ArrayList<>();
        List <String> list_of_lectures_surnames = new ArrayList<>();
        List <String> list_of_lectures_middle_names = new ArrayList<>();
        List <Integer> list_of_lectures_numbers = new ArrayList<>();
        List <String> list_of_lectures_titles = new ArrayList<>();
        List <String> list_of_lectures_gender = new ArrayList<>();
        List <Integer> list_of_lectures_cellphone_number = new ArrayList<>();
        List <String> list_of_lectures_emails = new ArrayList<>();
        List <String> list_of_street_address_for_lectures = new ArrayList<>();
        List <String> list_of_suburb_address_for_lectures = new ArrayList<>();
        List <String> list_of_city_address_for_lectures = new ArrayList<>();
        List <String> list_of_provinc_address_for_lecture =new ArrayList<>();
        List <Integer> list_of_zip_codes_for_lectures = new ArrayList<>();
        List <String> list_of_countries_address_for_lectures = new ArrayList<>();



        get("/addlecture", (req, res) -> {
            Map<String, Object> school_form_map = new HashMap<>();
            return new HandlebarsTemplateEngine().render(new ModelAndView(school_form_map, "addlecturer.handlebars"));
        });

        post("/addlecture", (req, res) -> {

            Map<String, Object> school_form_map = new HashMap<>();

            // initializing variables with inputs fields
            String add_lecture_surname = req.queryParams("element_3_1");
            String add_lecture_name = /*"name(s)" +*/req.queryParams("element_3_2");
            String add_lecture_middle_name = req.queryParams("element_14_1");
            String add_lecture_number = req.queryParams("element_14_1_1");
            String add_lecture_title = req.queryParams("element_17");
            String add_lecture_gender = req.queryParams("element_15");
            String add_lecture_cellphone_number = req.queryParams("element_10_1");
            /*String*/ add_lecture_cellphone_number += req.queryParams("element_10_2");
            /*String*/ add_lecture_cellphone_number += req.queryParams("element_10_3");
            String add_lecture_email = req.queryParams("element_14_10");
            String add_lecture_street_address = req.queryParams("element_5_1");
            String add_lecture_suburb_address = req.queryParams("element_5_2");
            String add_lecture_city_address = req.queryParams("element_5_3");
            String add_lecture_province_address = req.queryParams("element_5_4");
            String add_lecture_zip_code = req.queryParams("element_5_5");
            String add_lecture_country_address = req.queryParams("element_5_6");


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
            school_form_map.put("add_lecture_surname", add_lecture_surname);
            school_form_map.put("add_lecture_name", add_lecture_name);
            school_form_map.put("add_lecture_middle_name", add_lecture_middle_name);
            school_form_map.put("add_lecture_number",add_lecture_number);
            school_form_map.put("add_lecture_title",add_lecture_title);
            school_form_map.put("add_lecture_gender",add_lecture_gender);
            school_form_map.put("add_lecture_cellphone_number",add_lecture_cellphone_number);
            school_form_map.put("add_lecture_email",add_lecture_email);
            school_form_map.put("add_lecture_street_address",add_lecture_street_address);
            school_form_map.put("add_lecture_suburb_address",add_lecture_suburb_address);
            school_form_map.put("add_lecture_city_address",add_lecture_city_address);
            school_form_map.put("add_lecture_province_address",add_lecture_province_address);
            school_form_map.put("add_lecture_zip_code",add_lecture_zip_code);
            school_form_map.put("add_lecture_country_address",add_lecture_country_address);

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
            list_of_lectures_surnames.add(add_lecture_surname);
            list_of_lectures_names.add(add_lecture_name);
            list_of_lectures_middle_names.add(add_lecture_middle_name);
            list_of_lectures_numbers.add(Integer.parseInt(add_lecture_number));
            list_of_lectures_titles.add(add_lecture_title);
            list_of_lectures_gender.add(add_lecture_gender);
            list_of_lectures_cellphone_number.add(Integer.parseInt(add_lecture_cellphone_number));
            list_of_lectures_emails.add(add_lecture_email);
            list_of_street_address_for_lectures.add(add_lecture_street_address);
            list_of_suburb_address_for_lectures.add(add_lecture_suburb_address);
            list_of_city_address_for_lectures.add(add_lecture_city_address);
            list_of_provinc_address_for_lecture.add(add_lecture_province_address);
            list_of_zip_codes_for_lectures.add(Integer.parseInt(add_lecture_zip_code));
            list_of_countries_address_for_lectures.add(add_lecture_country_address);



            // adding names from the list to the Map
            school_form_map.put("list_of_lectures_surnames",list_of_lectures_surnames);
            school_form_map.put("list_of_lectures_names",list_of_lectures_names);
            school_form_map.put("list_of_lectures_middle_names",list_of_lectures_middle_names);
            school_form_map.put("list_of_lectures_numbers",list_of_lectures_numbers);
            school_form_map.put("list_of_lectures_titles",list_of_lectures_titles);
            school_form_map.put("list_of_lectures_gender",list_of_lectures_gender);
            school_form_map.put("list_of_lectures_cellphone_number",list_of_lectures_cellphone_number);
            school_form_map.put("list_of_lectures_emails",list_of_lectures_emails);
            school_form_map.put("list_of_street_address_for_lectures",list_of_street_address_for_lectures);
            school_form_map.put("list_of_suburb_address_for_lectures",list_of_suburb_address_for_lectures);
            school_form_map.put("list_of_city_address_for_lectures",list_of_city_address_for_lectures);
            school_form_map.put("list_of_provinc_address_for_lecture",list_of_provinc_address_for_lecture);
            school_form_map.put("list_of_zip_codes_for_lectures",list_of_zip_codes_for_lectures);
            school_form_map.put("list_of_countries_address_for_lectures",list_of_countries_address_for_lectures);



            System.out.println(list_of_lectures_names.toString()+ " these are the names");
            System.out.println(list_of_lectures_surnames.toString()+ " these are surnames");
            System.out.println(list_of_lectures_middle_names.toString()+ " these are the middle names");
            System.out.println(list_of_lectures_numbers.toString()+ " lecture number");
            System.out.println(list_of_lectures_titles.toString()+ "  lecture title");
            System.out.println(list_of_lectures_gender.toString() + " gender");
            System.out.println(list_of_lectures_cellphone_number.toString() + " lecture number");
            System.out.println(list_of_lectures_emails + " email");
            System.out.println(list_of_street_address_for_lectures.toString() + " street address");
            System.out.println(list_of_suburb_address_for_lectures.toString() + " suburb");
            System.out.println(list_of_city_address_for_lectures.toString() + " city");
            System.out.println(list_of_provinc_address_for_lecture.toString() + " province");
            System.out.println(list_of_zip_codes_for_lectures.toString() + "zip code");
            System.out.println(list_of_countries_address_for_lectures.toString() + " country");



            return new HandlebarsTemplateEngine().render(new ModelAndView(school_form_map, "addlecturer.handlebars"));
        });// testing if only a link is typed


    }
//	public static void main(String[] args) {
//
//        routes.AddLectures run = new routes.AddLectures();
//
//        run.runLecture();
//	}
}