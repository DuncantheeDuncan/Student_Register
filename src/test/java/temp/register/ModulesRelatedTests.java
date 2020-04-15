package temp.register;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class ModulesRelatedTests {

    @Test
    void shouldCheckIfDepartmentExist() {
       ModulesRelated modulesRelated = new ModulesRelated();

        assertTrue(modulesRelated.isTrueDepartmentExist("HIJ"), "must pass since IT exists");
        assertTrue(modulesRelated.isTrueDepartmentExist("bamcsq"), "must pass even if input string is lower cases bamcsq");
        assertTrue(modulesRelated.isTrueDepartmentExist("bAmcSq"), "should pass cases are made capital letters");

        assertFalse(modulesRelated.isTrueDepartmentExist("LLB"), "must fail since we don't have LLB");
        assertFalse(modulesRelated.isTrueDepartmentExist("llb"), "must fail since we don't have llb");

    }

    @Test
    void shouldCheckIfQualificationExists() {
        ModulesRelated modulesRelated = new ModulesRelated();

        assertTrue(modulesRelated.doesQualificationExists("Bachelor of Science in Information Technology"));
        assertTrue(modulesRelated.doesQualificationExists("Diploma in Information Technology"));
        assertFalse(modulesRelated.doesQualificationExists("Advanced Diploma in Information Technology"),"this must fail 'coz the qualification does not exist");


    }
    @Test
    void shouldShortenAString(){
        ModulesRelated modulesRelated = new ModulesRelated();

        assertEquals("CIGAA",modulesRelated.stringShorten("can I get an Amen"));
        assertEquals("CIGAA",modulesRelated.stringShorten("can I get an of Amen"),"must ignore 'of'");
        assertEquals("BSIT",modulesRelated.stringShorten("Bachelor of Science in Information Technology"),"must ignore 'of' and 'in");
        assertEquals("DCA",modulesRelated.stringShorten("diploma in computer appliance"),"must ignore  and 'in and capitalise first letters");
        assertEquals("D",modulesRelated.stringShorten("diploma"));

    }
    @Test
    void shouldGetModuleAndYear(){
        ModulesRelated modulesRelated = new ModulesRelated();
//TODO i still have to fix my assertions to test arrays or list
        assertEquals("[Web Technology 511 year 1, Web Technology 511 year 1, Web Technology 511 year 1]",modulesRelated.moduleAndYear("DIEB",1));
        assertEquals("[Software Development 511 year 1]",modulesRelated.moduleAndYear("DIT",1));
        assertEquals("[Programming 511 year 3]",modulesRelated.moduleAndYear("DIT",3));

    }
}
