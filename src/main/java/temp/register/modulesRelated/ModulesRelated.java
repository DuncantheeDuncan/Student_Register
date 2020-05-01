package temp.register.modulesRelated;

import temp.register.methodToolbox.ToolBox;

import java.util.HashMap;
import java.util.Map;

public class ModulesRelated {
    ToolBox toolBox = new ToolBox();

    public boolean doesQualificationExists(String qualification) {

        String stringShorten = toolBox.stringShorten(qualification);

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

        Map<String, String> ADDINGMODULES = new HashMap<>();

        Modules[] modules = Modules.values();
        int x = 0;
        for (Modules M : modules) {

            String listOfModules = M.toString();

            if (listOfModules.contains(module)) {

                int getYear = Modules.valueOf(listOfModules).getYear();

                if (getYear == year) {

                    x++;
                    String addingModules = Modules.valueOf(listOfModules).getModule() + " year " + getYear;

                    ADDINGMODULES.put("module 1of" + x, addingModules);
                }
            }
        }

        if (ADDINGMODULES.isEmpty()) return null;

        return String.valueOf(ADDINGMODULES);
    }

}
