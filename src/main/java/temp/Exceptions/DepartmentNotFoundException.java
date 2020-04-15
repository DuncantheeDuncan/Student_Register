package temp.Exceptions;

public class DepartmentNotFoundException extends ModulesException{

    private String exceptionMessage;

    public DepartmentNotFoundException(String exceptionMessage) {
        super(exceptionMessage);
        this.exceptionMessage = exceptionMessage;
    }

    @Override
    public String getMessage() {
        return exceptionMessage;
    }
}
