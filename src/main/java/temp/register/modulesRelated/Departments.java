package temp.register.modulesRelated;

public enum Departments {

    IT(" Information Technology"),
    BS(" Business Economics "),
    SJ(" Science Journalism");

    private String department;

    Departments(String department) {
        this.department = department;

    }

    public String getDepartment() {

        return department;
    }
}
