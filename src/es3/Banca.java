package es3;

import exceptions.BancaException;

public class Banca {
    public static void main(String args[]) throws BancaException {
        ContoCorrente conto1 = new ContoCorrente("Grossi Mario", 4000.0);
        conto1.preleva(4000);
        System.out.println(conto1.restituisciSaldo());


        ContoOnLine conto2 = new ContoOnLine("Rossi Luigi", 50350.0, 1500);
        conto2.stampaSaldo();
        conto2.preleva(2500);
        
    }
}

