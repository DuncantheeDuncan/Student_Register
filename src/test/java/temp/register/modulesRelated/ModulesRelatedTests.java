package temp.register.modulesRelated;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ModulesRelatedTests {

    @Test
    @DisplayName("this test check if the department exists from ENUM keys")
    void shouldCheckIfDepartmentExist() {
        ModulesRelated modulesRelated = new ModulesRelated();

        assertTrue(modulesRelated.isTrueDepartmentExist("cs"));
        assertTrue(modulesRelated.isTrueDepartmentExist("EB"), "must pass even if input string is lower cases bamcsq");
        assertTrue(modulesRelated.isTrueDepartmentExist("SJ"), "should pass cases are made capital letters");

        assertFalse(modulesRelated.isTrueDepartmentExist("LLB"), "must fail since we don't have LLB");
        assertFalse(modulesRelated.isTrueDepartmentExist("llb"), "must fail since we don't have llb");

    }

    @Test
    void shouldCheckIfQualificationExists() {
        ModulesRelated modulesRelated = new ModulesRelated();

        assertTrue(modulesRelated.doesQualificationExists("Bachelor of Science in Information Technology"));
        assertTrue(modulesRelated.doesQualificationExists("Diploma in Information Technology"));
        assertFalse(modulesRelated.doesQualificationExists("Advanced Diploma in Information Technology"), "this must fail 'coz the qualification does not exist");

    }

    @Test
    void shouldShortenAString() {
        ModulesRelated modulesRelated = new ModulesRelated();

        assertEquals("CIGAA", modulesRelated.stringShorten("can I get an Amen"));
        assertEquals("must ignore 'of'", modulesRelated.stringShorten("can I get an of Amen"), "CIGAA");
        assertEquals("must ignore 'of' and 'in", modulesRelated.stringShorten("Bachelor of Science in Information Technology"), "BSIT");
        assertEquals("must ignore  and 'in and capitalise first letters", modulesRelated.stringShorten("diploma in computer appliance"), "DCA");
        assertEquals("D", modulesRelated.stringShorten("diploma"));

    }

    @Test
    void shouldGetModuleAndYear() {
        ModulesRelated modulesRelated = new ModulesRelated();

        assertEquals("{module 1of2=Web Technology 511 year 1, module 1of3=Web Technology 511 year 1, module 1of1=Web Technology 511 year 1}", modulesRelated.moduleAndYear("DEB", 1));
        assertEquals("{module 1of1=Software Development 511 year 1}", modulesRelated.moduleAndYear("DIT", 1));
        assertEquals("{module 1of1=Programming 511 year 3}", modulesRelated.moduleAndYear("DIT", 3));

    }
}
