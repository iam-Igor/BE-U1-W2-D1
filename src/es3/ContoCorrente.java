package es3;

import exceptions.BancaException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ContoCorrente {

    private static Logger log = LoggerFactory.getLogger(ContoCorrente.class);

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
                log.error("Errore nel prelievo (Logger)");
                throw new BancaException("Il conto è in rosso!");

            }

        } catch (BancaException e) {
            System.err.println(e.message);
        } finally {
            nMovimenti++;
            log.info("prelievo ok");
        }

    }

    double restituisciSaldo() {
        return saldo;
    }
}

