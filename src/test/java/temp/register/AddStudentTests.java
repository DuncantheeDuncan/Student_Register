package temp.register;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

public class AddStudentTests {

    @Test
    public void shouldBeAbleToPrintInputFromTheMethod(){

        AddStudent shouldPrint = new AddStudent();

        assertEquals(shouldPrint.addStudent("Phumlani","Duncan","Mthembu",119489L,9404207854084L,1),"Name Phumlani Middle Name Duncan Surname Mthembu Student Number 119489 ID Number 9404207854084 Year 1");
    }

    @Test
    public  void shouldBeAbleToAdd(){

        AddStudent add = new AddStudent();

        add.addStudent("Phumlani","Duncan","Mthembu",119489L,9404207854084L,1);
        add.addStudent("Sthembiso","Bandile","Jaca",119889L,9104205454084L,1);

        assertEquals(add.mapOfStudents.toString(),"{119489=Phumlani Duncan Mthembu 119489 9404207854084 1, 119889=Sthembiso Bandile Jaca 119889 9104205454084 1}");
    }

    @Test
    public void shouldBeAbleToCategoriseStudentsAccordingToTheirGrade(){

        AddStudent categorize = new AddStudent();
        categorize.addStudent("Phumlani","Duncan","Mthembu",119489L,9404207854084L,1);
        categorize.addStudent("Muzi","Duncan","Mthembu",119489L,9404207854084L,4);
        categorize.addStudent("Jane","Duncan","Mthembu",119489L,9404207854084L,1);
        categorize.addStudent("Lime","Duncan","Mthembu",119489L,9404207854084L,3);


        assertEquals(categorize.getAllStudentsWhoAreDoingSpecifYear(1),"Phumlani Jane");
    }
}
