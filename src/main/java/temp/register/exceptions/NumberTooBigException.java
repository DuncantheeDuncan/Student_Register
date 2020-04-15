package temp.register.exceptions;

public class NumberTooBigException extends ModulesException {

    private String exceptionMessage;
    public NumberTooBigException(String exceptionMessage){
        super(exceptionMessage);
        this.exceptionMessage = exceptionMessage;

    }

    @Override
    public String getMessage() {
        return exceptionMessage;
    }
}
