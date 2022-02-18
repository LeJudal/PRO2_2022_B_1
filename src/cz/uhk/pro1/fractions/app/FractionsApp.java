package cz.uhk.pro1.fractions.app;

import cz.uhk.pro1.fractions.model.Fraction;

import javax.swing.*;

public class FractionsApp {

    public static void main(String[] args) {

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

    }

}
