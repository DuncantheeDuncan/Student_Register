package temp.register.personalInformationRelated;

import org.jetbrains.annotations.NotNull;
import temp.register.Mapping;
import temp.register.methodToolbox.ToolBox;

import java.util.Calendar;
import java.util.Objects;

public class PersonalInformation {

     ToolBox toolBox = new ToolBox();

    public String firstName(@NotNull String name) {
        return toolBox.hasNumber(Objects.requireNonNull(name)) ? null : toolBox.capitaliseFirstLetter(Objects.requireNonNull(name));
    }

    public String secondName(String secondName) {
        return toolBox.hasNumber(secondName) ? null : toolBox.capitaliseFirstLetter(secondName);
    }

//    @Nullable google
     public String surName( String surName) {
        return toolBox.hasNumber(Objects.requireNonNull(surName)) ? null : toolBox.capitaliseFirstLetter(Objects.requireNonNull(surName));
    }


public String nationalIdentification(@NotNull Long id, boolean returnIDInformation) {

        boolean validator = false;
        boolean errors = false;
        String birthMonth = "birth month";
        String date = "date";
        String gender = "gender";
        String citizenship = "citizenship";
        String idStatus = "Invalid";

        String[] convertIDToString = String.valueOf(id).split("");

        if (String.valueOf(id).length() == 13) {

            birthMonth = convertIDToString[2].concat(convertIDToString[3]);
            date = convertIDToString[4].concat(convertIDToString[5]);
            gender = Integer.parseInt(convertIDToString[6]) >= 5 ? "Male" : "Female";
            citizenship = Integer.parseInt(convertIDToString[10]) <= 0 ? "SA Citizen" : "Non SA Citizen";

            if (Integer.parseInt(date) < 1 || Integer.parseInt(date) > 31) errors = true;

            if (Integer.parseInt(birthMonth) < 1 || Integer.parseInt(birthMonth) > 12) errors = true;

            // validating SA id
            int checkSum = -1;

/**
 * add all digits in an odd position (2 step)
 * exclude check sum number (last position)
 * there are twelve numbers left now.
 * the odd numbers must then be 6 numbers
 **/

            int oddDigits = 0;
            for (int i = 0; i < 6; i++) oddDigits += Integer.parseInt(convertIDToString[2 * i]);
/**
 * for even numbers, we will not add but we will concatenate
 * the last six numbers remember we don'nt need the last digits
 * move even numbers and multiply them by two
 * 2 * n + 1 // gives a three step
 **/

            int evenNumbers = 0;
            for (int i = 0; i < 6; i++) evenNumbers = evenNumbers * 10 + Integer.parseInt(convertIDToString[2 * i + 1]);

            evenNumbers *= 2;

            int sum = 0;
            do {
                sum += evenNumbers % 10;
                evenNumbers = evenNumbers / 10;
            } while (evenNumbers > 0);

            sum += oddDigits;
            checkSum = 10 - (sum % 10);

            if (checkSum == 10) checkSum = 0;

            if (checkSum != Integer.parseInt(convertIDToString[12])) errors = true;

            idStatus = checkSum == Integer.parseInt(convertIDToString[12]) ? "valid" : "Invalid";

            if (!errors) validator = true;

        }

        if (validator) {
            if (!returnIDInformation) {
                return String.format("Id status: %s", idStatus);
            } else {

                String birthYear = convertIDToString[0].concat(convertIDToString[1]);
                int year = Calendar.getInstance().get(Calendar.YEAR);
                int month = Calendar.getInstance().get(Calendar.MONTH);

                String[] stringYear = String.valueOf(year).split("");

                String century = stringYear[2].concat(stringYear[3]);

                birthYear = Integer.parseInt(convertIDToString[0].concat(convertIDToString[1])) >= Integer.parseInt(century) ? "19".concat(birthYear) : "20".concat(birthYear);
                int age = year < Integer.parseInt(birthYear) ? (year - Integer.parseInt(birthYear)) + 100 : year - Integer.parseInt(birthYear);
                age = month < Integer.parseInt(birthMonth) ? age - 1 : age;

                Mapping.studentRecord.put("birthYear",birthYear);
                Mapping.studentRecord.put("birthMonth",birthMonth);
                Mapping.studentRecord.put("date",date);
                Mapping.studentRecord.put("age",String.valueOf(age));
                Mapping.studentRecord.put("gender",gender);
                Mapping.studentRecord.put("citizenship",citizenship);
                Mapping.studentRecord.put("idStatus",idStatus);
                return String.format("date of birth: %s/%s/%s\nAge: %s\nGender: %s\nCitizenship: %s\nId status: %s", birthYear, birthMonth, date, age, gender, citizenship, idStatus);
            }
        }

        if (convertIDToString.length > 13) {

            return String.format("national id %s is > 13 valid digits", convertIDToString.length);
        } else if (convertIDToString.length < 13) {
            return String.format("national id %s is < 13 valid digits", convertIDToString.length);
        }
        return String.format("Id status: %s", idStatus);
    }


}
