package org.fonis.bmi_kalkulator;

import java.text.*;

/**
 *
 * @author Laza
 */
public class BMIKalkulator {

    private double tezina;
    private double visina;
    private double rezultat;
    private String debljina;

    public double getTezina() {
        return tezina;
    }

    public void setTezina(double tezina) {
        this.tezina = tezina;
    }

    public double getVisina() {
        return visina;
    }

    public void setVisina(double visina) {
        this.visina = visina;
    }

    public double getRezultat() {
        return rezultat;
    }

    public void setRezultat() {
        double t = getTezina();
        double v = getVisina();
        rezultat = t / (v * v);
    }

    public String getDebljina() {
        return debljina;
    }

    public void setDebljina() {
        double r = getRezultat();
        if (r < 18.5) {
            debljina = "Težina ispod normale!";
        }
        if (18.5 <= r && r <= 24.9) {
            debljina = "Normalna težina!";
        }
        if (25 <= r && r <= 29.9) {
            debljina = "Težina iznad normale!";
        }
        if (r >= 30) {
            debljina = "Gojaznost!";
        }
    }
}
