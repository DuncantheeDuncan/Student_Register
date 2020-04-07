package temp.register;

public enum Departments {

    IT(" A"),
    HIJ(" B"),
    BAMCSQ(" C");

    private String department;

    Departments(String department) {
        this.department = department;

    }

    public String getDepartment() {

        return department;
    }
}
