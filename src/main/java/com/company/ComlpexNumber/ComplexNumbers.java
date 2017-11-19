package com.company.ComlpexNumber;


import com.company.Exceptions.Exceptions;
import com.company.Fraction.Fraction;

public abstract class ComplexNumbers {

    public static ComplexNumber multiplicationOfDots(ComplexNumber... args) {
        if (isDataValid(args)) {

            if (args.length == 1) {
                return args[0];
            }

            ComplexNumber result = ComplexNumberTools.multiplication(args[0], args[1]);

            for (int i = 2; i < args.length; i++) {
                result = ComplexNumberTools.multiplication(result, args[i]);
            }

            return result;
        } else return new ComplexNumber(new Fraction(0, 1), new Fraction(0, 1));
    }

    public static ComplexNumber sumOfDots(ComplexNumber... args) {
        if (isDataValid(args)) {

            if (args.length == 1) {
                return args[0];
            }

            ComplexNumber result = ComplexNumberTools.sum(args[0], args[1]);

            for (int i = 2; i < args.length; i++) {
                result = ComplexNumberTools.sum(result, args[i]);
            }

            return result;
        }
        else return new ComplexNumber(new Fraction(0, 1), new Fraction(0, 1));
    }

    private static boolean isDataValid(ComplexNumber... args) {
        try {
            if (args.length == 0) throw new NullPointerException("This method should have parametrs");
            return true;
        } catch (NullPointerException exception) {
            Exceptions.noParametrException(exception);

            return false;
        }
    }

}
