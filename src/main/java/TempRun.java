import temp.register.Mapping;
import temp.register.RecordForm;
import temp.register.modulesRelated.exceptions.DepartmentNotFoundException;
import temp.register.modulesRelated.exceptions.NumberTooBigException;
import temp.register.modulesRelated.exceptions.QualificationNotFoundException;
import temp.register.modulesRelated.processor.ModulesRelatedProcessor;

public class TempRun {

    public static void main(String[] args) throws NumberTooBigException, QualificationNotFoundException, DepartmentNotFoundException {
        RecordForm recordForm = new RecordForm();
        Mapping mapping = new Mapping();
        ModulesRelatedProcessor modules = new ModulesRelatedProcessor();

//        recordForm.addingStudentNames("thabiso", "lungelo", "dlamini");
//        recordForm.addingDateOfBirth(97_03_20_7654_084L, "itaLiaN");
//        recordForm.addCellPhoneNumber("0847683982", "united state of america");


        modules.modulesProcessor
                (
                        "EB",
                        "Diploma in Economic Business",
                        "DEB",
                        1
                );


        System.out.println(mapping.getRecordsList());

    }
}
