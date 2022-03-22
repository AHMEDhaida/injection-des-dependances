package dao;

public class IDaoImpl2 implements  IDao{
    @Override
    public double getData() {
        /*
        * version fichier
        * */
        System.out.println("version fichier ");
        double temp = 50;
        return temp;
    }
}
