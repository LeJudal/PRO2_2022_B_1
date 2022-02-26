package cz.uhk.pro1.fractions.tests;

import cz.uhk.pro1.fractions.model.Fraction;

import static org.junit.jupiter.api.Assertions.*;

public class FractionTest {

    @org.junit.jupiter.api.Test
    public void testReduce() {
        Fraction f = new Fraction(4, 6);
        assertEquals(new Fraction(2, 3), f);
    }

    @org.junit.jupiter.api.Test
    public void testMultiply() {
        Fraction f1 = new Fraction(3, 2);
        Fraction f2 = new Fraction(2, 5);
        assertEquals(new Fraction(3, 5), f1.multiply(f2));
    }

    @org.junit.jupiter.api.Test
    public void testAdd() {
        Fraction f1 = new Fraction(3, 2);
        Fraction f2 = new Fraction(2, 5);
        assertEquals(new Fraction(19, 10), f1.add(f2));
    }

    @org.junit.jupiter.api.Test
    public void testAdd2() {
        Fraction f1 = new Fraction(4, 6);
        Fraction f2 = new Fraction(0, 5);
        assertEquals(new Fraction(2, 3), f1.add(f2));
    }

}