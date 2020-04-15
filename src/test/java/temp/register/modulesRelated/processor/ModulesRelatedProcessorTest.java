package temp.register.modulesRelated.processor;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import temp.register.exceptions.DepartmentNotFoundException;
import temp.register.exceptions.NumberTooBigException;
import temp.register.exceptions.QualificationNotFoundException;

class ModulesRelatedProcessorTest {
    private String expectedMessage;
    private String actualMessage;

    private ModulesRelatedProcessor modulesRelatedProcessor = new ModulesRelatedProcessor();

    @Test
    @DisplayName("to remove ")
    void k() {

        try {
           String module = modulesRelatedProcessor.modulesProcessor
                    (
                            "IT",
                            "Diploma in Information Technology",
                            "DIEB",
                            1
                    );
        } catch (DepartmentNotFoundException | QualificationNotFoundException | NumberTooBigException e) {
            e.printStackTrace();
        }
    }
}