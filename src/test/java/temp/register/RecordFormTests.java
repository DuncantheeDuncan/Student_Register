package temp.register;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecordFormTests {

    @Test
    public void shouldBeAbleToPrintInputFromTheMethod(){

        RecordForm shouldPrint = new RecordForm();

//        assertEquals(shouldPrint.addStudent("Phumlani","Duncan","Mthembu",119489L,9404207854084L,1),"Name Phumlani Middle Name Duncan Surname Mthembu Student Number 119489 ID Number 9404207854084 Year 1");
    }

    @Test
    public  void shouldBeAbleToAdd(){

        RecordForm add = new RecordForm();

//        add.addStudent("Phumlani","Duncan","Mthembu",119489L,9404207854084L,1);
//        add.addStudent("Sthembiso","Bandile","Jaca",119889L,9104205454084L,1);

//        assertEquals(add.mapOfStudents.toString(),"{119489=Phumlani Duncan Mthembu 119489 9404207854084 1, 119889=Sthembiso Bandile Jaca 119889 9104205454084 1}");
    }

    @Test
    public void shouldBeAbleToCategoriseStudentsAccordingToTheirGrade(){

        RecordForm categorize = new RecordForm();
//        categorize.addStudent("Phumlani","Duncan","Mthembu",119489L,9404207854084L,1);
//        categorize.addStudent("Muzi","Duncan","Mthembu",119489L,9404207854084L,4);
//        categorize.addStudent("Jane","Duncan","Mthembu",119489L,9404207854084L,1);
//        categorize.addStudent("Lime","Duncan","Mthembu",119489L,9404207854084L,3);


//        assertEquals(categorize.getAllStudentsWhoAreDoingSpecifYear(1),"Phumlani Jane");
    }

    @Test
    void shouldBeABleToAddNames() {
        RecordForm recordForm = new RecordForm();

//        assertEquals("{surname=Mthembu, name=Phumlani, middlename=Duncan}", recordForm.addingStudentNames("Phumlani", "Duncan", "Mthembu"));
//        assertEquals("{surname=Mthembu, name=Ayabonga, middlename=Payaya}", recordForm.addingStudentNames("Ayabonga", "Payaya", "Mthembu"));

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

//    @Test
//    void shouldBeAbleToAddModules() {
//        RecordForm recordForm = new RecordForm();

//        recordForm.addModules("DIT2");
//        recordForm.addModules("DIT3");
//        recordForm.addModules("DIT4");

//        assertEquals("[Information System 511, Programming 511, Web Technology 511, Software Development 511]", recordForm.addModules("DIT1"));
//    }

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

//    @Test
//    void shouldRecodingNationality() {
//        RecordForm recordForm = new RecordForm();
//
//        recordForm.listAllModulesAndCountryCodes();


//        assertEquals("South African",recordForm.RecodingNationality("south african"));

//    }


}
