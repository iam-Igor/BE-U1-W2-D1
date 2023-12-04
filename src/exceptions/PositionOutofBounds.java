package exceptions;

public class PositionOutofBounds extends RuntimeException {

    public PositionOutofBounds(int position) {
        if (position < 0) {
            System.out.println("Chosen position is < 0 choose a bigger number");
        } else if (position > 4) {
            System.out.println("Position out of range, choose a smaller number");
        }

    }
}
