package calculator;
public class RumenException extends Exception{
    public RumenException() {
    }

    public RumenException(String message) {
        super(message);
    }

    public RumenException(String message, Throwable cause) {
        super(message, cause);
    }

    public RumenException(Throwable cause) {
        super(cause);
    }

    public RumenException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
