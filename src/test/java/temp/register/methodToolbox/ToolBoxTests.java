package temp.register.methodToolbox;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ToolBoxTests {

    private String expectedMessage;
    private String actualMessage;

    @Test
    @DisplayName("should capitalise first letters of a word")
    void capitaliseFirstLetter() {
        ToolBox toolBox = new ToolBox();

        expectedMessage = "Maverics";
        actualMessage = toolBox.capitaliseFirstLetter("maverics");

        assertEquals(expectedMessage, actualMessage);
        assertTrue(expectedMessage.contains(actualMessage));

        expectedMessage = "Jacobs";
        actualMessage = toolBox.capitaliseFirstLetter("jacobs");

        assertEquals(expectedMessage, actualMessage);
        assertTrue(expectedMessage.contains(actualMessage));

        expectedMessage = "Steven Joseph";
        actualMessage = toolBox.capitaliseFirstLetter("steven joseph");

        assertEquals(expectedMessage, actualMessage);
        assertTrue(expectedMessage.contains(actualMessage));

        expectedMessage = "Steven Joseph Mavundla";
        actualMessage = toolBox.capitaliseFirstLetter("steven joseph mavundla");

        assertEquals(expectedMessage, actualMessage);
        assertTrue(expectedMessage.contains(actualMessage));

    }

    @Test
    @DisplayName("should check if a name contains any number")
    void shouldCheckIfNameHasNumberOrNot() {
        ToolBox toolBox = new ToolBox();

        expectedMessage = "true";
        boolean actualMessage;
        actualMessage = toolBox.hasNumber("J7");

        assertEquals(Boolean.valueOf(expectedMessage), actualMessage);
        assertTrue(expectedMessage.contains(String.valueOf(actualMessage)));


        expectedMessage = "True".toLowerCase();
        actualMessage = toolBox.hasNumber("sghjYGuJHgshgfsjhytvsgjhghvshg7");

        assertEquals(Boolean.valueOf(expectedMessage), actualMessage);
        assertTrue(expectedMessage.contains(String.valueOf(actualMessage)));

        expectedMessage = "true";
        actualMessage = toolBox.hasNumber("5677r5e");

        assertEquals(Boolean.valueOf(expectedMessage), actualMessage);
        assertTrue(expectedMessage.contains(String.valueOf(actualMessage)));

        expectedMessage = "False";
        actualMessage = toolBox.hasNumber("BBBBB");

        assertEquals(Boolean.valueOf(expectedMessage), actualMessage);
        Assert.assertFalse(expectedMessage.contains(String.valueOf(actualMessage)));

        expectedMessage = "False";
        actualMessage = toolBox.hasNumber("HyKjdhB");

        assertEquals(Boolean.valueOf(expectedMessage), actualMessage);
        Assert.assertFalse(expectedMessage.contains(String.valueOf(actualMessage)));
    }

    @Test
    @DisplayName("should shorten the Strings")
    void shouldShortenAString() {
        ToolBox toolBox = new ToolBox();

        expectedMessage = "CIGAA";
        actualMessage = toolBox.stringShorten("can I get an Amen");
        assertEquals(expectedMessage, actualMessage);
        assertTrue(expectedMessage.contains(actualMessage));

        expectedMessage = "CIGAA";
        actualMessage = toolBox.stringShorten("can I get an of Amen");
        assertEquals(expectedMessage, actualMessage);
        assertTrue(expectedMessage.contains(actualMessage));

        expectedMessage = "BSIT";
        actualMessage = toolBox.stringShorten("Bachelor of Science in Information Technology");
        assertEquals(expectedMessage, actualMessage);
        assertTrue(expectedMessage.contains(actualMessage));

        expectedMessage = "DCA";
        actualMessage = toolBox.stringShorten("diploma in computer appliance");
        assertEquals(expectedMessage, actualMessage);
        assertTrue(expectedMessage.contains(actualMessage));


        expectedMessage = "D";
        actualMessage = toolBox.stringShorten("diploma");
        assertEquals(expectedMessage, actualMessage);
        assertTrue(expectedMessage.contains(actualMessage));

    }

}
