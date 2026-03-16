package net.aelouadi.metier;

import net.aelouadi.dao.IDao;

public class MetierImpl implements IMetier{

    private IDao dao;

    public MetierImpl() {
    }
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calacul() {
        double t = dao.getData();
        return t * 2;
    }


    /*
        pour injecter une implementation de l'interface IDao
     */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
