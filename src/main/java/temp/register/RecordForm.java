package temp.register;

import temp.register.modulesRelated.Modules;

import java.util.ArrayList;
import java.util.List;

public class RecordForm {


    Mapping mapping = new Mapping();

    public String addingStudentNames(String name, String middleName, String surname) {


        mapping.studentRecord.put("name", name);
        mapping.studentRecord.put("surname", surname);
        mapping.studentRecord.put("middlename", middleName);

        return String.valueOf(mapping.studentRecord);
    }


    public String addingDateOfBirth(long dateOfBirth, String nationality) {

        String national = RecodingNationality(nationality);

        //TODO must be able to get age
        String convertID = String.valueOf(dateOfBirth);
        int year = Integer.parseInt(convertID.substring(0, 2));//TODO: must be able to add century /1997/ or 2000
        int month = Integer.parseInt(convertID.substring(2, 4));
        int day = Integer.parseInt(convertID.substring(4, 6));//TODO: make sure day is not > 31

//        LocalDate date =  LocalDate.now();// to calculate age
//        System.out.println(date.getYear());// to get a year
        String months = "";

//                TODO: to be able to determine witch century are we in so i can get i.e 1997, 2010, 1899
        switch (month) {
            case 1:
                months = "January";
                break;
            case 2:
                months = "February";
                break;
            case 3:
                months = "March";
                break;
            case 4:
                months = "April";
                break;
            case 5:
                months = "May";
                break;
            case 6:
                months = "June";
                break;
            case 7:
                months = "July";
                break;
            case 8:
                months = "August";
                break;
            case 9:
                months = "September";
                break;
            case 10:
                months = "October";
                break;
            case 11:
                months = "November";
                break;
            case 12:
                months = "December";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + month);
        }

        mapping.studentRecord.put("ID", convertID);
        mapping.studentRecord.put("Date of birth", day + " " + months.toUpperCase() + " " + year);
        mapping.studentRecord.put("Nationality", national);


        return day + " " + months + " " + year + " " + national;
    }

    List<String> StoringModules = new ArrayList<>();

    public String addModules(String module) {//TODO: fix this method
        StoringModules.add(Modules.valueOf(module).getModule());

        mapping.studentRecord.put("modules", String.valueOf(StoringModules));

        return String.valueOf(StoringModules);
    }

    public String addCellPhoneNumber(String cellNumber, String country) {

        country = fixingTheCountryString(country);

        try {
            long verifyInput = Long.parseLong(cellNumber);
        } catch (NumberFormatException e) {
            return "A number cannot contain letter(s) or a special characters";
        }

        if (cellNumber.length() > 10 | cellNumber.length() < 10)
            throw new IllegalStateException("Cell number is less or greater than 10 digits: " + cellNumber);

        String cellPhoneNumber = CountryCodes.valueOf(country).getCountryCode() + cellNumber.substring(1, 10);

        mapping.studentRecord.put("cell phone number", cellPhoneNumber);
        return cellPhoneNumber;
    }


    public String RecodingNationality(String nationality) {
        String countryHome = "";
        String[] arrNational = nationality.split(" ");

        for (String national : arrNational)
            countryHome += " " + national.substring(0, 1).toUpperCase() + national.substring(1).toLowerCase();

//        studentRecord.put("nationality", countryHome.trim()); added somewhere

        return countryHome.trim();
    }

    public String fixingTheCountryString(String fixCountry) {

        String countryCode = "";
        mapping.studentRecord.put("Country of residence", fixCountry);

        String[] arrString = fixCountry.split(" ");

        for (int i = 0; i < arrString.length; i++)
            countryCode += arrString[i].substring(0, 1).toUpperCase() + arrString[i].substring(1).toLowerCase();

        return countryCode;
    }

    public  void listAllModulesAndCountryCodes() { // TODO fix this method later
        Modules[] modules1 = Modules.values();

        for (Modules xx : modules1) {
            System.out.println("Module name " + xx + " Module " + xx.getModule());
        }
        CountryCodes[] country = CountryCodes.values();

        for (CountryCodes countryCodes : country) {

            System.out.println("country name " + countryCodes + " counry code " + countryCodes.getCountryCode());
        }

    }

}