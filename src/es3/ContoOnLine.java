package es3;

import exceptions.BancaException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ContoOnLine extends ContoCorrente {

    private static Logger log = LoggerFactory.getLogger(ContoOnLine.class);

    double maxPrelievo;

    ContoOnLine(String titolare, double saldo, double maxP) {
        super(titolare, saldo);
        this.maxPrelievo = maxP;
    }

    void stampaSaldo() {

        System.out.println("Titolare: " + titolare + " - Saldo: " + saldo + " - Num movimenti: " + nMovimenti
                + " - Massimo movimenti: " + maxMovimenti + " - Massimo prelievo possibile: " + maxPrelievo);
    }

    void preleva(double x) {
        try {
            if (x <= maxPrelievo) {
                super.preleva(x);
                log.info("prelievo ok");
            } else if (x > maxPrelievo) {
                log.error("Errore nel prelievo");
                throw new BancaException("Prelievo non disponibile.");
            }
        } catch (BancaException e) {
            System.err.println(e.message);
        }

    }
}
