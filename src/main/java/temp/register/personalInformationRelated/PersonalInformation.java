package temp.register.personalInformationRelated;

import org.jetbrains.annotations.NotNull;
import temp.register.Mapping;
import temp.register.methodToolbox.ToolBox;

public class PersonalInformation {

    ToolBox toolBox= new ToolBox();

    String firstName(@NotNull String name) {

        String fixName = toolBox.capitaliseFirstLetter(name);

        return fixName;
    }

    String addingNames(@NotNull String name, String middleName, @NotNull String surname) {
//FIXME change this method to take one input.
//        meaning there must be three separated methods.
        System.out.println(name + " " + middleName + " " + surname);
        if (!name.isEmpty() & !surname.isEmpty()) {

            Mapping.studentRecord.put("name", name);
            Mapping.studentRecord.put("surname", surname);
        }

        Mapping.studentRecord.put("middlename", middleName);

        return String.valueOf(Mapping.studentRecord);
    }
}
