package net.aelouadi.metier;

import net.aelouadi.dao.IDao;

public class MetierImplV2 implements IMetier{

    private IDao dao;

    public MetierImplV2(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calacul() {
        return dao.getData() * 10;
    }
}
