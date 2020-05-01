package temp.register.personalInformationRelated;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PersonalInformationTests {

    private String expectedMessage;
    private String actualMessage;




    @Test
    @DisplayName("add a name")
    void shouldAddAName() {
        PersonalInformation personalInformation = new PersonalInformation();

        expectedMessage = "Phumlani";
        actualMessage = personalInformation.firstName("phumlani");

        assertEquals(expectedMessage, actualMessage);
        assertTrue(expectedMessage.contains(actualMessage));

        expectedMessage = "Sithabile";
        actualMessage = personalInformation.firstName("siThAbIlE");

        assertEquals(expectedMessage, actualMessage);
        assertTrue(expectedMessage.contains(actualMessage));
    }
}
