package temp.register;

import org.junit.jupiter.api.Test;

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
}
