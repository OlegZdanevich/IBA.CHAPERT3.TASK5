package com.company.ComlpexNumber;


import com.company.Fraction.Fraction;
import org.apache.log4j.Logger;

public abstract class ComplexNumbers {
    private static final Logger log = Logger.getLogger(ComplexNumbers.class);

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
        } else return new ComplexNumber(new Fraction(0, 1), new Fraction(0, 1));
    }

    private static boolean isDataValid(ComplexNumber... args) {
        try {
            if (args.length == 0) throw new NullPointerException("This method should have parametrs");
            return true;
        } catch (NullPointerException exception) {
            log.error("Number of arguments is 0");

            StackTraceElement[] info = exception.getStackTrace();
            StringBuilder trace = new StringBuilder("");

            for (int i = info.length - 1; i >= 0; i--) {
                trace.append(info[i].toString() + "\n");
            }

            log.error(exception.getMessage() + "\nTrace: \n" + trace);
            return false;
        }
    }

}
