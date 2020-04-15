package temp.register;

public class TempRun {

    public static void main(String[] args) {
        RecordForm recordForm = new RecordForm();

        recordForm.addingStudentNames("thabiso", "lungelo", "dlamini");
        recordForm.addingDateOfBirth(97_03_20_7654_084L, "itaLiaN");
        recordForm.addCellPhoneNumber("0847683982", "united state of america");
//        recordForm.selectDepartmentAndACurrentYearToEasilyAddModules();
//        recordForm.addModules("DIT1");
//        recordForm.addModules("DIT2");
//        recordForm.addModules("DIT3");
//        System.out.println(recordForm.getRecordsList());
//        recordForm.addingStudentNames("Jabu","Mjey","Jobe");
//        recordForm.addingDateOfBirth(90_05_32_7654_084L,"Ghanian");
//        recordForm.addModules();
        System.out.println(recordForm.getRecordsList());

    }
}
