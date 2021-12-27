import temp.register.Mapping;
import temp.register.RecordForm;
import temp.register.modulesRelated.exceptions.DepartmentNotFoundException;
import temp.register.modulesRelated.exceptions.NumberTooBigException;
import temp.register.modulesRelated.exceptions.QualificationNotFoundException;
import temp.register.modulesRelated.processor.ModulesRelatedProcessor;
import temp.register.personalInformationRelated.PersonalInformation;

public class TempRun {

    public static void main(String[] args) throws NumberTooBigException, QualificationNotFoundException, DepartmentNotFoundException {
        RecordForm recordForm = new RecordForm();
        Mapping mapping = new Mapping();
        ModulesRelatedProcessor modules = new ModulesRelatedProcessor();
        PersonalInformation personalInformation = new PersonalInformation();



// to change and run from the processor
        personalInformation.nationalIdentification
                (
                        10_06_02_5239_084L,
                        true
                );

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
