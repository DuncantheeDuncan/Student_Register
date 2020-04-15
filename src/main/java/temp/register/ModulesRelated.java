package temp.register;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

 class ModulesRelated {


    boolean doesQualificationExists(String qualification) {

        String stringShorten = stringShorten(qualification);

        Qualifications[] qualifications = Qualifications.values();

        for (Qualifications Q : qualifications)
            if (Q.toString().equals(stringShorten)) return true;

        return false;
    }

    boolean isTrueDepartmentExist(String department) {
        Departments[] departments = Departments.values();

        for (Departments D : departments) if (department.toUpperCase().equals(D.toString())) return true;

        return false;
    }

    String moduleAndYear(String module, int year) {
        List<String> ADDINGMODULES = new ArrayList<>();
        String listOfModules;
        Modules[] modules = Modules.values();

        for (Modules M : modules) {
            listOfModules = M.toString();

            if (listOfModules.contains(module)) {
                int getYear = Modules.valueOf(listOfModules).getYear();
                if (getYear == year) {
                    String addingModules = Modules.valueOf(listOfModules).getModule() + " year " +getYear ;
                    ADDINGMODULES.add(addingModules);
                }
            }
        }
        return Arrays.toString(ADDINGMODULES.toArray());
    }

    String stringShorten(String shorten) {
        String[] stringSplitter = shorten.split(" ");
        StringBuilder firstsLetters = new StringBuilder();
        for (String S : stringSplitter) {

            if ("in".equals(S) | "of".equals(S)) continue;

            firstsLetters.append(S.substring(0, 1).toUpperCase());
        }
        return firstsLetters.toString();
    }


}
