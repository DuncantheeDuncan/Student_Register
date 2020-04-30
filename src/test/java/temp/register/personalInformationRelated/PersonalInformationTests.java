package temp.register.personalInformationRelated;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PersonalInformationTests {

    @Test
    @DisplayName("adding names")
    void shouldAddNames(){
        PersonalInformation personalInformation = new PersonalInformation();

        String x = " ";
        personalInformation.addingNames(x,"mthoko","Zulu");

    }
    @Test
    void g(){
        PersonalInformation personalInformation = new PersonalInformation();
        personalInformation.addingNames("x","mthoko","Zulu");

    }
}
