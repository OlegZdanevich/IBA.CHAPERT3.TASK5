package com.company.Run;

import com.company.Logic.ComlpexNumber.ComplexNumber;
import com.company.Logic.ComlpexNumber.ComplexNumbers;
import com.company.Exceptions.Exceptions;
import com.company.Logic.Fraction.Fraction;


import java.util.Scanner;

public class Main {
    private static ComplexNumber[] arrOfComplexNumbers = null;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Enter number of complex numbers:");
            int numberOfComplexNumbers = Integer.parseInt(input.next());

            if (numberOfComplexNumbers <= 0)
                throw new IllegalArgumentException("Number of complex numbers should be greater then zero");

            arrOfComplexNumbers = new ComplexNumber[numberOfComplexNumbers];

            for (int i = 0; i < numberOfComplexNumbers; i++) {
                System.out.println((i+1)+")");
                arrOfComplexNumbers[i] = createComplexNumber();
            }

            System.out.println("Complex numbers:");

            for (int i = 0; i < numberOfComplexNumbers; i++) {
                System.out.println((i + 1) + ") " + arrOfComplexNumbers[i]);
            }

            System.out.println("Result of the sum:");

            System.out.println(ComplexNumbers.sumOfDots(arrOfComplexNumbers));

            System.out.println("Result of the multiplication:");

            System.out.println(ComplexNumbers.multiplicationOfDots(arrOfComplexNumbers));
        }
        catch (NumberFormatException exception) {
            Exceptions.notNumberException(exception);
        }
        catch (NullPointerException exception) {
            Exceptions.notInitializedException(exception);
        }
        catch (IllegalArgumentException exception) {
            Exceptions.notCorrectNumbersException(exception);
        }


    }

    private static ComplexNumber createComplexNumber() throws NumberFormatException {
        Scanner input = new Scanner(System.in);


        System.out.print("numerator of real part:");
        int numeratorRealPart = Integer.parseInt(input.next());

        System.out.print("denominator of real part:");
        int denominatorRealPart = Integer.parseInt(input.next());

        System.out.print("numerator of imaginary part:");
        int numeratorImaginaryPart = Integer.parseInt(input.next());

        System.out.print("denominator of imaginary part:");
        int denominatorImaginaryPart = Integer.parseInt(input.next());


        Fraction realPart=new Fraction(numeratorRealPart,denominatorRealPart);
        Fraction imaginaryPart=new Fraction(numeratorImaginaryPart,denominatorImaginaryPart);

        return new ComplexNumber(realPart,imaginaryPart);
    }
}
