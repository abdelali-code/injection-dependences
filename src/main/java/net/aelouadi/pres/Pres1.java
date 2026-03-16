package net.aelouadi.pres;

import net.aelouadi.dao.DaoImpl;
import net.aelouadi.dao.IDao;
import net.aelouadi.extension.DaoImplV2;
import net.aelouadi.metier.IMetier;
import net.aelouadi.metier.MetierImpl;

public class Pres1 {

    public static void main(String[] args) {
        IDao dao = new DaoImplV2();
        MetierImpl metier = new MetierImpl();
        metier.setDao(dao);
        System.out.println("RES = " + metier.calacul());
    }
}
