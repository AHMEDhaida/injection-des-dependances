package metier;

import dao.IDao;


public class IMetierImpl implements IMetier {
    private IDao dao;

    @Override
    public double calcul() {
        double temp = dao.getData();
        double res = temp*540;
        return res;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
