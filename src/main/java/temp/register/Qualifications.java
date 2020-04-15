package temp.register;

public enum Qualifications {


    BSIT("Bachelor of Science in Information Technology"),
    DIT("Diploma in Information Technology"),
    DCS("Diploma in Computer Appliance");

    private String qualification;

    Qualifications(String qualification){
        this.qualification = qualification;
    }

    public String getQualification() {
        return qualification;
    }
}
