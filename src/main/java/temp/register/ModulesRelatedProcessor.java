package temp.register;

import temp.Exceptions.DepartmentNotFoundException;
import temp.Exceptions.QualificationNotFoundException;

public class ModulesRelatedProcessor {
    //    TODO to create a method that will run methods from modules related class
    private ModulesRelated processor = new ModulesRelated();

    String modulesProcessor(String isTrueDepartmentExist, String doesQualificationExists) throws DepartmentNotFoundException, QualificationNotFoundException {
        boolean isTrueExists = processor.isTrueDepartmentExist(isTrueDepartmentExist);

        if (isTrueExists) {
            isTrueExists = processor.doesQualificationExists(doesQualificationExists);

            if (isTrueExists) {
                System.out.println("true");
                // last stop get all diploma modules
                // TODO moduleAndYear(String module, int year)

            } else {
                throw new QualificationNotFoundException("try help. Qualification does not exist");
            }


        } else {
            throw new DepartmentNotFoundException("try help. Department does not exist");
        }

        return " ";
    }
}
