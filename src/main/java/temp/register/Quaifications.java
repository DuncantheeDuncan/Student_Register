package temp.register;

enum Qualifications {


    BachelorOfScienceInInformationTechnology("Bachelor of Science in Information Technology"),
    DiplomaInInformationTechnology("Diploma in Information Technology"),
    DiplomaINComputerScience("Diploma in Computer Appliance");

    private String qualification;
    Qualifications(String qualification){

        this.qualification = qualification;
    }

    public String getQualification() {
        return qualification;
    }
}
