package temp.register;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecordFormTest {
    @Test
    void addingStudentNames() {
    }

    @Test
    void getRecordsList() {
    }

    @Test
    void addingDateOfBirth() {
    }

    @Test
    void addModules() {
    }

    @Test
    void addCellPhoneNumber() {
    }

    @Test
    void recodingNationality() {
    }

    @Test
    void fixingTheCountryString() {
    }

    @Test
    void listAllModulesAndCountryCodes() {
    }


    @Test
    void shouldBeABleToAddNames() {
        RecordForm recordForm = new RecordForm();

        assertEquals("{surname=Mthembu, name=Phumlani, middlename=Duncan}", recordForm.addingStudentNames("Phumlani", "Duncan", "Mthembu"));
        assertEquals("{surname=Mthembu, name=Ayabonga, middlename=Payaya}", recordForm.addingStudentNames("Ayabonga", "Payaya", "Mthembu"));

    }

    @Test
    void shouldBeAbleToGetDateOfBirth() {
        RecordForm recordForm = new RecordForm();

        assertEquals("20 September 97 South African", recordForm.addingDateOfBirth(97_09_20_8754_084L, "south african"));
//        assertEquals("20 September 97",recordForm.addingDateOfBirth(00_12_20_8754_084L));//TODO: need to fix for 2000
        assertEquals("16 December 87 American", recordForm.addingDateOfBirth(87_12_16_6598_084L, "aMerican"));
        assertEquals("31 June 90 Zimbabwan", recordForm.addingDateOfBirth(90_06_31_4965_084L, "zimBABwan"));
        assertEquals("10 January 98 Italian", recordForm.addingDateOfBirth(98_01_10_2984_084L, "italIAN"));
    }

    @Test
    void shouldBeAbleToAddModules() {
        RecordForm recordForm = new RecordForm();

        recordForm.addModules("DIT2");
        recordForm.addModules("DIT3");
        recordForm.addModules("DIT4");

        assertEquals("[Information System 511, Programming 511, Web Technology 511, Software Development 511]", recordForm.addModules("DIT1"));
    }

    @Test
    void ShouldBeAbleToReturnPhoneNumberWithALocalCode() {
        RecordForm recordForm = new RecordForm();

        assertEquals("+27 712558303", recordForm.addCellPhoneNumber("0712558303", "south africa"));
        assertEquals("+67 736574839", recordForm.addCellPhoneNumber("0736574839", "zimbAbwe"));

    }

    @Test
    void shouldBeAbleToRemoveSpacesInACountryName() {
        RecordForm recordForm = new RecordForm();
        assertEquals("SouthAfrica", recordForm.fixingTheCountryString("south africa"));
        assertEquals("UnitedStateOfAmerica", recordForm.fixingTheCountryString("uniTed StatE of America"));
        assertEquals("United-State-Of-America", recordForm.fixingTheCountryString("uniTed- StatE - of - America"));
        assertEquals("---------", recordForm.fixingTheCountryString("--- --- ---"));
    }

    @Test
    void shouldRecodingNationality() {
        RecordForm recordForm = new RecordForm();

        recordForm.listAllModulesAndCountryCodes();


//        assertEquals("South African",recordForm.RecodingNationality("south african"));

    }


    @Test
    void selectDepartmentAndACurrentYearToEasilyAddModules() {
        RecordForm recordForm = new RecordForm();

        recordForm.selectDepartmentAndACurrentYearToEasilyAddModules();

    }

//    @Test
//    void shouldGetSpecifModules() {
//        RecordForm recordForm = new RecordForm();
//
//
//        recordForm.getSpecifModules("");
//    }




}