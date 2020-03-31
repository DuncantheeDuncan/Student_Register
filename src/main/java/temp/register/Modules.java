package temp.register;

public enum Modules {

    DIT1("Software Development 511",1),
    DIT2("Information System 511",2),
    DIT3("Programming 511",3),
    DIT4("Web Technology 511",4);

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







