package temp.register;

public enum Departments {

    IT(
            "Bachelor of Science in Information Technology",
            "Diploma in Information Technology",
            "Diploma in Computer Appliance"
    ),
    HIJ(
            "D",
            "E",
            "F"),
    BAMCSQ(
            "A",
            "B",
            "C"
    );

    private String[] department;

    Departments(String... department) {
        this.department = department;
    }

    public String[] getDepartment() {

        return department;
    }
}
