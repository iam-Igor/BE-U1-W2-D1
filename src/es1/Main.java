package es1;

import exceptions.NumberLessthanOne;
import exceptions.PositionOutofBounds;

import java.util.Random;
import java.util.Scanner;

public class Main {
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
                throw new NumberLessthanOne(num1);
            } else if (position < 0 || position > 4) {
                throw new PositionOutofBounds(position);
            } else {
                array[position] = num1;
            }
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }
}