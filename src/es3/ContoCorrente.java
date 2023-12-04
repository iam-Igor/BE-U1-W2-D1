package es3;

import exceptions.BancaException;

public class ContoCorrente {
    final int maxMovimenti = 50;
    String titolare;
    int nMovimenti;
    double saldo;

    ContoCorrente(String titolare, double saldo) {
        this.titolare = titolare;
        this.saldo = saldo;
        nMovimenti = 0;
    }

    void preleva(double x) {
        try {
            if (nMovimenti < maxMovimenti)
                saldo = saldo - x - 0.50;
            if (saldo < 0) {
                throw new BancaException("Il conto è in rosso!");
            }

        } catch (BancaException e) {
            System.err.println(e.message);
        } finally {
            nMovimenti++;
        }

    }

    double restituisciSaldo() {
        return saldo;
    }
}

