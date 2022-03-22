package pres;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;


public class Presentation {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("config.txt"));

        String daoClass = scanner.nextLine();
        Class cDao = Class.forName(daoClass);
        IDao iDao = (IDao)cDao.newInstance();

        String MetierClass = scanner.nextLine();
        Class cMetier = Class.forName(MetierClass);
        IMetier iMetier = (IMetier) cMetier.newInstance();

        Method method = cMetier.getMethod("setDao",IDao.class);
        method.invoke(iMetier,iDao);

        System.out.println("Resultat = " + iMetier.calcul() );






    }
}
