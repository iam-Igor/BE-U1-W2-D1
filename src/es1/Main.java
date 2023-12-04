package es1;

import exceptions.NumberLessthanOne;
import exceptions.PositionOutofBounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;
import java.util.Scanner;

public class Main {
    private static Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        int[] numbers = new int[5];
        fillArray(numbers);
        chooseNumber(numbers);

    }


    public static void fillArray(int[] array) {

        for (int i = 0; i < 5; i++) {
            Random rand = new Random();
            int randomNumber = rand.nextInt(10) + 1;
            System.out.println(array[i] = randomNumber);

        }
    }


    public static void chooseNumber(int[] array) {

        try {
            Scanner userInput = new Scanner(System.in);
            System.out.println("scegli un numero da inserire");
            int num1 = userInput.nextInt();
            System.out.println("In quale posizione vuoi metterlo? da 0 a 4");
            int position = userInput.nextInt();

            if (num1 < 1) {
                log.error("Numero minore di uno.");
                throw new NumberLessthanOne(num1);
            } else if (position < 0 || position > 4) {
                log.error("Posizione non valida!");
                throw new PositionOutofBounds(position);
            } else {
                array[position] = num1;
                log.info("Operazione andata a buon fine!");
            }
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }
}