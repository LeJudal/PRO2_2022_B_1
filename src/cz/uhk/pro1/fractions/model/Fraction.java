package cz.uhk.pro1.fractions.model;

import java.util.Objects;

public class Fraction { // public class Fraction extends Object {

    private int numerator; // čitatel
    private int denominator; // jmenovatel

    public Fraction() {
        this.denominator = 1; // aby nebyla nula ve jmenovateli; this by zde nemuselo být
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        setDenominator(denominator); // aby nebyla nula ve jmenovateli, zároveň zajistí zkrácení
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
        reduce(); // zlomek bude vždy ve zkráceném tvaru
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        if (denominator == 0) { // aby nebyla nula ve jmenovateli
            throw new IllegalArgumentException("Jmenovatel nemůže být nulový");
        } else {
            this.denominator = denominator;
            reduce(); // zlomek bude vždy ve zkráceném tvaru
        }
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fraction fraction = (Fraction) o;
        // nyní lze již otestovat pouze rovnost čitatele a jmenovatele, neboť zlomky jsou vždy ve zkráceném tvaru
        return numerator == fraction.numerator && denominator == fraction.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

    public Fraction multiply(Fraction f) {
        int newNumerator = numerator * f.numerator;
        int newDenominator = denominator * f.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction add(Fraction f) {
        int newNumerator = numerator * f.denominator + f.numerator * denominator;
        int newDenominator = denominator * f.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    private void reduce() {
        int gcd = computeGCD(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
    }

    private int computeGCD(int x, int y) {
        while (y != 0) {
            int tmp = y;
            y = x % y;
            x = tmp;
        }
        return x;
    }

}
