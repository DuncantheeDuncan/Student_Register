package temp.register.modulesRelated;

import temp.register.Mapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ModulesRelated {

    Mapping mapping =new Mapping();
    public boolean doesQualificationExists(String qualification) {

        String stringShorten = stringShorten(qualification);

        Qualifications[] qualifications = Qualifications.values();

        for (Qualifications Q : qualifications)
            if (Q.toString().equals(stringShorten)) return true;

        return false;
    }

    public boolean isTrueDepartmentExist(String department) {

        Departments[] departments = Departments.values();

        for (Departments D : departments) if (department.toUpperCase().equals(D.toString())) return true;

        return false;
    }

    public String moduleAndYear(String module, int year) {
        //FIXME
        // - fix my assertion to test for arrayLists
        // - fix my method to return a string
        // - or an array list

        List<String> ADDINGMODULES = new ArrayList<>();

        String listOfModules;

        Modules[] modules = Modules.values();

        for (Modules M : modules) {

            listOfModules = M.toString();

            if (listOfModules.contains(module)) {

                int getYear = Modules.valueOf(listOfModules).getYear();

                if (getYear == year) {

                    String addingModules = Modules.valueOf(listOfModules).getModule() + " year " + getYear;

//                    mapping.recordsList.add(ADDINGMODULES);
                    ADDINGMODULES.add(addingModules);
                }
            }
        }
        if (ADDINGMODULES.isEmpty()) return null;

        return Arrays.toString(ADDINGMODULES.toArray());
    }

    public String stringShorten(String shorten) {

        String[] stringSplitter = shorten.split(" ");

        StringBuilder firstsLetters = new StringBuilder();

        for (String S : stringSplitter) {

            if ("in".equals(S) | "of".equals(S)) continue;

            firstsLetters.append(S.substring(0, 1).toUpperCase());
        }

        return firstsLetters.toString();
    }
}
