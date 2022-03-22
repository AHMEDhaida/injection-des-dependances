package dao;

public class IDaoImpl implements IDao {
    @Override
    public double getData() {
        /*
        * connecter a  la BD
        * */
        System.out.println("version bd");
        double temp = 40;
        return temp;
    }
}
