package net.aelouadi.pres;

import net.aelouadi.metier.IMetier;
import net.aelouadi.metier.MetierImpl;

public class Pres1 {

    public static void main(String[] args) {
        IMetier metier = new MetierImpl();

        System.out.println("RES = " + metier.calacul());
    }
}
