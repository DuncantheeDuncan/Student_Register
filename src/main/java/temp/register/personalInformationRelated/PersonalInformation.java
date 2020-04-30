package temp.register.personalInformationRelated;

import org.jetbrains.annotations.NotNull;
import temp.register.Mapping;

public class PersonalInformation {

    String addingNames(@NotNull String name, String middleName, @NotNull String surname) {
//FIXME change this method to take one input.
//        meaning there must be three separated methods.
        System.out.println(name+ " "+ middleName + " "+surname);
        if (!name.isEmpty() & !surname.isEmpty()){

            Mapping.studentRecord.put("name", name);
            Mapping.studentRecord.put("surname", surname);
        }



        if (middleName.isEmpty()) {

        }


        Mapping.studentRecord.put("middlename", middleName);

        return String.valueOf(Mapping.studentRecord);
    }
}
