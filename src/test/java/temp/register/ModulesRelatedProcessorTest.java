package temp.register;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import temp.Exceptions.DepartmentNotFoundException;
import temp.Exceptions.ModulesException;
import temp.Exceptions.QualificationNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class ModulesRelatedProcessorTest {
    private String expectedMessage;
    private String actualMessage;

    private ModulesRelatedProcessor modulesRelatedProcessor = new ModulesRelatedProcessor();

    @Test
    @DisplayName("NB i am only testing for the first parameter")
    void shouldThrowDepartmentNotFoundException() {

        // should throw
        ModulesException exception = assertThrows(DepartmentNotFoundException.class, () -> {

            modulesRelatedProcessor.modulesProcessor(
                    "ITT",
                    ""
            );

            modulesRelatedProcessor.modulesProcessor(
                    "XXX",
                    ""
            );

        });

        expectedMessage = "try help. Department does not exist";
        actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
        assertEquals(expectedMessage, exception.getMessage());

    }

    @Test
    @DisplayName("NB i am only testing the second parameter, all arguments before that are correctly placed")
    void shouldThrowQualificationNotFoundException() {

        // should throw
        ModulesException exception = assertThrows(QualificationNotFoundException.class, () -> {

            modulesRelatedProcessor.modulesProcessor(
                    "IT",
                    "ThisIsNotAModule"
            );


        });

        actualMessage = exception.getMessage();
        expectedMessage = "try help. Qualification does not exist";

        assertTrue(expectedMessage.contains(actualMessage));
        assertEquals(expectedMessage, exception.getMessage());

    }
}