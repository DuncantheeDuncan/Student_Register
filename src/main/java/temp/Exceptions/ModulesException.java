package temp.Exceptions;

public class ModulesException extends Exception {

    private String exceptionMessage;

    ModulesException(String exceptionMessage) {

        this.exceptionMessage = exceptionMessage;
    }

    @Override
    public String getMessage() {
        return exceptionMessage;
    }
}
