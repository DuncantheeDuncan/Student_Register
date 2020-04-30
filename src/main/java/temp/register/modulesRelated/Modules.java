package temp.register.modulesRelated;



public enum Modules {

    DIT1("Software Development 511",1),
    DIT2("Information System 511",2),
    DIT3("Programming 511",3),
    DIT4("Web Technology 511",4),

    DEB1("Web Technology 511",1),
    DEB4("Web Technology 511",1),
    DEB5("Web Technology 511",1),
    DEB2("Web Technology 511",2),
    DEB3("Web Technology 511",3);


    private String module;
    private int year;


    Modules(String module, int year) {
        this.module = module;
        this.year = year;

    }





    public String getModule() {
        return module;
    }

    public int getYear(){
        return year;
    }
}







