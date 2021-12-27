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

        expectedMessage = null;
        actualMessage = personalInformation.firstName("phuml9ani");

        assertEquals(expectedMessage, actualMessage);

        expectedMessage = "Sithabile";
        actualMessage = personalInformation.firstName("siThAbIlE");

        assertEquals(expectedMessage, actualMessage);
        assertTrue(expectedMessage.contains(actualMessage));

        expectedMessage = "Jacob";
        actualMessage = personalInformation.secondName("jAcOb");

        assertEquals(expectedMessage, actualMessage);
        assertTrue(expectedMessage.contains(actualMessage));

        expectedMessage = "Plenis";
        actualMessage = personalInformation.surName("pLENis");

        assertEquals(expectedMessage, actualMessage);
        assertTrue(expectedMessage.contains(actualMessage));
    }

    @Test
    @DisplayName("adding and validating the South African Id number")
    void shouldAddID() {
        PersonalInformation personalInformation = new PersonalInformation();
        String nextline = "\n";

        StringBuilder stringBuilder;

        stringBuilder = new StringBuilder();

        long id = 8001015009087L;

        stringBuilder
                .append("date of birth: 1980/01/01")
                .append(nextline)
                .append("Age: 40")
                .append(nextline)
                .append("Gender: Male")
                .append(nextline)
                .append("Citizenship: SA Citizen")
                .append(nextline)
                .append("Id status: valid");

        expectedMessage = stringBuilder.toString();
        actualMessage = personalInformation.nationalIdentification(id, true);

        assertEquals(expectedMessage, actualMessage);
        assertTrue(expectedMessage.contains(actualMessage));

        stringBuilder = new StringBuilder();

        stringBuilder.append("national id 14 is > 13 valid digits");

        id = 90082453510888L;

        expectedMessage = stringBuilder.toString();
        actualMessage = personalInformation.nationalIdentification(id, true);

        assertEquals(expectedMessage, actualMessage);
        assertTrue(expectedMessage.contains(actualMessage));


        stringBuilder = new StringBuilder();

        stringBuilder.append("Id status: Invalid");

        id = 1959876547856L;

        expectedMessage = stringBuilder.toString();
        actualMessage = personalInformation.nationalIdentification(id, true);

        assertEquals(expectedMessage, actualMessage);
        assertTrue(expectedMessage.contains(actualMessage));


        stringBuilder = new StringBuilder();

        id = 8001015009087L;

        stringBuilder.append("Id status: valid");

        expectedMessage = stringBuilder.toString();
        actualMessage = personalInformation.nationalIdentification(id, false);

        assertEquals(expectedMessage, actualMessage);
        assertTrue(expectedMessage.contains(actualMessage));

    }
}
