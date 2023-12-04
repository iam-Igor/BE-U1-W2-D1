package entities;

import exceptions.BancaException;

public class Banca {
    public static void main(String args[]) throws BancaException {
        ContoCorrente conto1 = new ContoCorrente("Grossi Mario", 2000.0);
        conto1.preleva(2002);
        System.out.println(conto1.restituisciSaldo());

//        try {
//            conto1.preleva(150.5);
//
//            System.out.println("Saldo conto: " + conto1.restituisciSaldo());
//            throw new BancaException("Non puoi prelevare!");
//        } catch (BancaException e) {
//            System.out.println("Errore durante il prelievo: " + e);
//            e.printStackTrace();
//        }


//        ContoOnLine conto2 = new ContoOnLine("Rossi Luigi", 50350.0, 1500);
//
//        conto2.stampaSaldo();
//
//        conto2.preleva(1000);
//
//        conto2.stampaSaldo();

    }
}

