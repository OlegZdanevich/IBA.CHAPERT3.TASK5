package com.company.Fraction;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import static org.junit.Assert.*;

public class FractionToolsTest {
    Fraction fraction1=null;
    Fraction fraction2=null;
    Fraction fraction3=null;

    public static void main(String[] args) {
        JUnitCore runner = new JUnitCore();
        Result result = runner.run(FractionToolsTest.class);
        System.out.println("run tests: " + result.getRunCount());
        System.out.println("failed tests: " + result.getFailureCount());
        System.out.println("ignored tests: " + result.getIgnoreCount());
        System.out.println("success: " + result.wasSuccessful());
    }

    @Before
    public void setUp() {
        fraction1=new Fraction(1,1);

        fraction2=new Fraction(1,2);

        fraction3=new Fraction(2,8);
    }

    @After
    public void tearDown() {
        fraction1=null;
        fraction2=null;
        fraction3=null;
    }

    @Test
    public void sum() {
        assertEquals("3/2",FractionTools.sum(fraction1,fraction2).toString());
        assertEquals("10/8",FractionTools.sum(fraction1,fraction3).toString());
        assertEquals("12/16",FractionTools.sum(fraction2,fraction3).toString());
    }

    @Test
    public void difference() {
        assertEquals("1/2",FractionTools.difference(fraction1,fraction2).toString());
        assertEquals("6/8",FractionTools.difference(fraction1,fraction3).toString());
        assertEquals("4/16",FractionTools.difference(fraction2,fraction3).toString());
    }

    @Test
    public void multiplication(){
        assertEquals("1/2",FractionTools.multiplication(fraction1,fraction2).toString());
        assertEquals("2/8",FractionTools.multiplication(fraction1,fraction3).toString());
        assertEquals("2/16",FractionTools.multiplication(fraction2,fraction3).toString());
    }

}