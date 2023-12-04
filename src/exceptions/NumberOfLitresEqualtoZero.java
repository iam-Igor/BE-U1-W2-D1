package exceptions;

public class NumberOfLitresEqualtoZero extends RuntimeException {
    public NumberOfLitresEqualtoZero() {
        super("You inserted a number of litres equal to zero, which is not allowed.");
    }
}
