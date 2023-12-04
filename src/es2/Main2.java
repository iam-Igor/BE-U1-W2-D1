package es2;

import exceptions.NumberOfLitresEqualtoZero;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Inserisci il numero di Km percorsi:");
        double kilom = Double.parseDouble(userInput.nextLine());
        System.out.println("Quanti litri hai consumato?");
        double litri = Double.parseDouble(userInput.nextLine());
        calcConsumptions(kilom, litri);


    }


    public static void calcConsumptions(double kilom, double litri) {
        try {

            double kilPerLitr = kilom / litri;
            if (litri == 0) {
                throw new NumberOfLitresEqualtoZero();
            }
            System.out.println("Il tuo consumo è di: " + kilPerLitr + "Km/l");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
