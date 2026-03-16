package net.aelouadi.pres;

import net.aelouadi.dao.IDao;
import net.aelouadi.metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Pres2 {

    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Scanner scanner = new Scanner(new File("config.txt"));
        String daoClassName = scanner.nextLine();
        String metierClassName = scanner.nextLine();
        System.out.println("dao = " + daoClassName + " metier = " + metierClassName);
        Class<?> cDao = Class.forName(daoClassName);
        Class<?> cMetier = Class.forName(metierClassName);
        IDao dao = (IDao) cDao.newInstance();

        IMetier metier =(IMetier) cMetier.getConstructor(IDao.class).newInstance(dao);

        System.out.println("RES = " + metier.calacul());
    }
}
