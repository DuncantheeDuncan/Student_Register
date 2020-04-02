package temp.Exceptions;

public class RecordFormException extends Exception {

    private String exceptionMessage;

    RecordFormException(String exceptionMessage) {

        this.exceptionMessage = exceptionMessage;
    }

    @Override
    public String getMessage() {
        return exceptionMessage;
    }
}
