package temp.register.exceptions;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import temp.register.modulesRelated.processor.ModulesRelatedProcessor;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ModulesRelatedProcessorExceptionTest {

    private String expectedMessage;
    private String actualMessage;

    private ModulesRelatedProcessor modulesRelatedProcessor = new ModulesRelatedProcessor();

    @Test
    @DisplayName("NB i am only testing for the first parameter")
    void shouldThrowDepartmentNotFoundException() {
        // should throw
        ModulesException exception = assertThrows(DepartmentNotFoundException.class, () -> {

            modulesRelatedProcessor.modulesProcessor
                    (
                            "ITT",
                            "",
                            "",
                            0
                    );

            modulesRelatedProcessor.modulesProcessor
                    (
                            "XXX",
                            "",
                            "",
                            0
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

            modulesRelatedProcessor.modulesProcessor
                    (
                            "IT",
                            "ThisIsNotAModule",
                            "",
                            0
                    );
        });

        actualMessage = exception.getMessage();
        expectedMessage = "try help. Qualification does not exist";

        assertTrue(expectedMessage.contains(actualMessage));
        assertEquals(expectedMessage, exception.getMessage());

    }

    @Test
    @DisplayName("NB i am only testing  the third parameter, all arguments before that are correctly placed")
    void shouldThrowNullPointerException() {
        // should throw
        RuntimeException exception = assertThrows(NullPointerException.class, () -> {

            modulesRelatedProcessor.modulesProcessor
                    (
                            "IT",
                            "Diploma in Information Technology",
                            "DIEBx",
                            0
                    );

        });
        expectedMessage = "you're are trying to retrieve from an empty Object";
        actualMessage = exception.getMessage();

        assertEquals(expectedMessage, actualMessage);
        assertTrue(expectedMessage.contains(actualMessage));
    }


    @Test
    @DisplayName("NB i am only testing  the fourth parameter, all arguments before that are correctly placed")
    void shouldThrowNumberTooBigException() {
        Exception exception = assertThrows(NumberTooBigException.class, () -> {

            modulesRelatedProcessor.modulesProcessor
                    (
                            "IT",
                            "Diploma in Information Technology",
                            "DIEB",
                            8
                    );
        });
        expectedMessage = "try help. number too big for a module year";
        actualMessage = exception.getMessage();

        assertEquals(expectedMessage, actualMessage);
        assertTrue(expectedMessage.contains(actualMessage));
    }

}
