package temp.register.modulesRelated.processor;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import temp.register.modulesRelated.exceptions.DepartmentNotFoundException;
import temp.register.modulesRelated.exceptions.NumberTooBigException;
import temp.register.modulesRelated.exceptions.QualificationNotFoundException;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

class ModulesRelatedProcessorTest {
    private String expectedMessage;
    private String actualMessage;

    private ModulesRelatedProcessor modulesRelatedProcessor = new ModulesRelatedProcessor();

    @Test
    @DisplayName("department: IT, qualification: Diploma in Information Technology, module: DIT, year: 1")
    void shouldReturnDITModules() {
        expectedMessage = "{module 1of1=Information System 511 year 2}";
        try {
            actualMessage = modulesRelatedProcessor.modulesProcessor
                    (
                            "IT",
                            "Diploma in Information Technology",
                            "DIT",
                            2
                    );

            assertEquals(expectedMessage, actualMessage);
            assertTrue(expectedMessage.contains(actualMessage));

        } catch (DepartmentNotFoundException | QualificationNotFoundException | NumberTooBigException e) {
            e.printStackTrace();
        }
    }

    @Test
    @DisplayName("department: EB, qualification: Diploma in Economic Business, module: DEB, year: 1")
    void shouldReturnDIEBModules() {
        expectedMessage = "{module 1of2=Web Technology 511 year 1, module 1of3=Web Technology 511 year 1, module 1of1=Web Technology 511 year 1}";
        try {
            actualMessage = modulesRelatedProcessor.modulesProcessor
                    (
                            "EB",
                            "Diploma in Economic Business",
                            "DEB",
                            1
                    );

            assertEquals(expectedMessage, actualMessage);
            assertTrue(expectedMessage.contains(actualMessage));

        } catch (DepartmentNotFoundException | QualificationNotFoundException | NumberTooBigException e) {
            e.printStackTrace();
        }
    }
}