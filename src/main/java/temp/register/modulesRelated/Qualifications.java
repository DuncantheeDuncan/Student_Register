package temp.register.modulesRelated;

public enum Qualifications {


    BSIT("Bachelor of Science in Information Technology"),
    DIT("Diploma in Information Technology"),
    DEB("Diploma in Economic Business"),
    BCS("Bachelor in Computer science"),
    BSJ("Bachelor of Science in Journalism"),
    DCS("Diploma in Computer Appliance");

    private String qualification;

    Qualifications(String qualification){
        this.qualification = qualification;
    }

    public String getQualification() {
        return qualification;
    }
}
