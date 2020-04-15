package temp.register.exceptions;

public class QualificationNotFoundException extends ModulesException {

    private String exceptionMessage;
    public QualificationNotFoundException(String exceptionMessage) {
        super(exceptionMessage);
        this.exceptionMessage = exceptionMessage;
    }

    @Override
    public String getMessage() {
        return exceptionMessage;
    }
}
