package net.aelouadi.dao;

public class DaoImpl implements IDao{

    @Override
    public double getData() {
        System.out.println("Vesrion base de données");
        return 34;
    }
}
