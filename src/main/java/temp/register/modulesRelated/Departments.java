package temp.register.modulesRelated;

public enum Departments {

    IT(" Information Technology"),
    EB(" Economic Business"),
    CS("Computer Science"),
    SJ(" Science Journalism");

    private String department;

    Departments(String department) {
        this.department = department;

    }

    public String getDepartment() {

        return department;
    }
}
