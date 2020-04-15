package temp.register.modulesRelated.processor;

import temp.register.exceptions.DepartmentNotFoundException;
import temp.register.exceptions.NumberTooBigException;
import temp.register.exceptions.QualificationNotFoundException;
import temp.register.modulesRelated.ModulesRelated;

public class ModulesRelatedProcessor {

    private ModulesRelated processor = new ModulesRelated();

    public String modulesProcessor
            (
                    String isTrueDepartmentExist,
                    String doesQualificationExists,
                    String module,
                    int year

            ) throws
            DepartmentNotFoundException,
            QualificationNotFoundException,
            NumberTooBigException
    {
        boolean isTrueExists = processor.isTrueDepartmentExist(isTrueDepartmentExist);

        if (isTrueExists) {

            isTrueExists = processor.doesQualificationExists(doesQualificationExists);

            if (isTrueExists) {

                if (year >7) throw new NumberTooBigException("try help. number too big for a module year");

                String modules = processor.moduleAndYear(module, year);

                if (modules != null) {

                    return modules;

                } else {

                    throw new NullPointerException("you're are trying to retrieve from an empty Object");
                }

            } else {

                throw new QualificationNotFoundException("try help. Qualification does not exist");
            }

        } else {

            throw new DepartmentNotFoundException("try help. Department does not exist");
        }
    }
}
