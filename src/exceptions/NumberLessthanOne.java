package exceptions;

public class NumberLessthanOne extends RuntimeException {
    public NumberLessthanOne(int number) {
        super("The chosen number " + number + " is less than 1, insert a valid number.");

    }
}
