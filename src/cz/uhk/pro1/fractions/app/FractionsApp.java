package cz.uhk.pro1.fractions.app;

import cz.uhk.pro1.fractions.model.Fraction;

import javax.swing.*;

public class FractionsApp {

/*    public static void main(String[] args) {

        Fraction f = new Fraction();
        f.setNumerator(2);
        f.setDenominator(3);
        System.out.println(f.getNumerator());
        System.out.println(f.getDenominator());
        System.out.println("---------------------");

        Fraction f2 = new Fraction(4, 5);
        System.out.println(f2); // System.out.println(f2.toString());
        System.out.println("---------------------");

        String fString = JOptionPane.showInputDialog("Zadejte zlomek ve tvaru x/y");
        String[] fParts = fString.split("/");
        // pokud zlomek není zadán v požadovaném tvaru, vyhodí výjimku
        Fraction f3 = new Fraction(Integer.parseInt(fParts[0]), Integer.parseInt(fParts[1]));
        System.out.println(f3);

    }*/

    public static void main(String[] args) {

        Fraction f1 = new Fraction(15, 18);
        System.out.println(f1);
        System.out.println("---------------------");

        Fraction f2 = new Fraction(2, 3);
        Fraction f3 = new Fraction(3, 4);
        Fraction f23 = f2.multiply(f3);
        System.out.println(f23);
        System.out.println("---------------------");

        Fraction f123 = f1.multiply(f2).multiply(f3);
        System.out.println(f123);
        System.out.println("---------------------");

        Fraction f4 = new Fraction(1, 2);
        Fraction f5 = new Fraction(1, 4);
        Fraction f45 = f4.add(f5);
        System.out.println(f45);
        System.out.println("---------------------");

    }

}
