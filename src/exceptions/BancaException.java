package exceptions;

public class BancaException extends Exception {

    public String message;

    public BancaException(String message) {
        this.message = message;
    }
}
