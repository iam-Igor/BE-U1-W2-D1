package entities;

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
                throw new BancaException("il conto è in rosso");
            }

        } catch (Exception e) {
            e.getMessage();
        } finally {
            nMovimenti++;
        }

    }

    double restituisciSaldo() {
        return saldo;
    }
}

