package com.company.ComlpexNumber;

import com.company.Logic.ComlpexNumber.ComplexNumber;
import com.company.Logic.ComlpexNumber.ComplexNumbers;
import com.company.Logic.Fraction.Fraction;
import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ComplexNumbersTest {
    private Fraction realPart1 = null;
    private Fraction realPart2 = null;
    private Fraction realPart3 = null;

    private Fraction imaginaryPart1 = null;
    private Fraction imaginaryPart2 = null;
    private Fraction imaginaryPart3 = null;

    private ComplexNumber complex1 = null;
    private ComplexNumber complex2 = null;
    private ComplexNumber complex3 = null;

    public static void main(String[] args) {
        JUnitCore runner = new JUnitCore();
        Result result = runner.run(ComplexNumbersTest.class);
        System.out.println("run tests: " + result.getRunCount());
        System.out.println("failed tests: " + result.getFailureCount());
        System.out.println("ignored tests: " + result.getIgnoreCount());
        System.out.println("success: " + result.wasSuccessful());
    }

    @Before
    public void setUp() {
        realPart1 = new Fraction(1, 2);
        realPart2 = new Fraction(1, 4);
        realPart3 = new Fraction(1, 6);

        imaginaryPart1 = new Fraction(2, 2);
        imaginaryPart2 = new Fraction(2, 4);
        imaginaryPart3 = new Fraction(2, 6);

        complex1 = new ComplexNumber(realPart1, imaginaryPart1);
        complex2 = new ComplexNumber(realPart2, imaginaryPart2);
        complex3 = new ComplexNumber(realPart3, imaginaryPart3);
    }

    @After
    public void tearDown() {
        realPart1 = null;
        realPart2 = null;
        realPart3 = null;

        imaginaryPart1 = null;
        imaginaryPart2 = null;
        imaginaryPart3 = null;

        complex1 = null;
        complex2 = null;
        complex3 = null;
    }


    @Test
    public void sumOfDots() {
        ComplexNumber zero = new ComplexNumber(new Fraction(0, 1), new Fraction(0, 1));
        assertEquals(zero, ComplexNumbers.sumOfDots());

        ComplexNumber answerOfSum = new ComplexNumber(new Fraction(44, 48), new Fraction(88, 48));
        assertEquals(answerOfSum, ComplexNumbers.sumOfDots(complex1, complex2, complex3));


        answerOfSum = new ComplexNumber(new Fraction(6, 8), new Fraction(12, 8));
        assertEquals(answerOfSum, ComplexNumbers.sumOfDots(complex1, complex2));


        answerOfSum = new ComplexNumber(new Fraction(1, 2), new Fraction(2, 2));
        assertEquals(answerOfSum, ComplexNumbers.sumOfDots(complex1));
    }


    @Test
    public void multiplicationOfDots() {
        ComplexNumber zero = new ComplexNumber(new Fraction(0, 1), new Fraction(0, 1));
        assertEquals(zero, ComplexNumbers.multiplicationOfDots());


        ComplexNumber answerOfMultiplication = new ComplexNumber(new Fraction(-9216, 147456), new Fraction(-18432, 147456));
        assertEquals(answerOfMultiplication, ComplexNumbers.multiplicationOfDots(complex1, complex2, complex3));


        answerOfMultiplication = new ComplexNumber(new Fraction(-24, 64), new Fraction(0, 64));
        assertEquals(answerOfMultiplication, ComplexNumbers.multiplicationOfDots(complex1, complex2));

        answerOfMultiplication = new ComplexNumber(new Fraction(1,2),new Fraction(2,2));
        assertEquals(answerOfMultiplication, ComplexNumbers.multiplicationOfDots(complex1));

    }



}