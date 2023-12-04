package es2;

import exceptions.NumberOfLitresEqualtoZero;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Main2 {
    private static Logger log = LoggerFactory.getLogger(Main2.class);

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
                log.error("Errore aritmetico, inserisci un valore diverso da 0 per i litri.");
                throw new NumberOfLitresEqualtoZero();
            }
            log.info("Operazione andata a buon fine.");
            System.out.println("Il tuo consumo è di: " + kilPerLitr + "Km/l");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
