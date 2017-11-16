package com.company.Fraction;


import org.apache.log4j.Logger;

public class Fraction {
    private long denominator;
    private long numerator;

    private static final Logger log = Logger.getLogger(Fraction.class);

    public Fraction(long numerator, long denominator) {
        try {
            if (denominator == 0) throw new ArithmeticException("Divsion by zero");

            this.numerator = numerator;
            this.denominator = denominator;
        } catch (ArithmeticException arithmeticException) {
            log.error("Number of denominator is 0");

            StackTraceElement[] info = arithmeticException.getStackTrace();
            StringBuilder trace = new StringBuilder("");

            for (int i = info.length - 1; i >= 0; i--) {
                trace.append(info[i].toString() + "\n");
            }

            log.error(arithmeticException.getMessage() + "\nTrace: \n" + trace);
        }


    }

    public Fraction(Fraction f) {
        this.numerator = f.numerator;
        this.denominator = f.denominator;
    }

    public long getDenominator() {
        return denominator;
    }

    public long getNumerator() {
        return numerator;
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

        if (getDenominator() != fraction.getDenominator()) return false;
        return getNumerator() == fraction.getNumerator();
    }

    @Override
    public int hashCode() {
        int result = (int) (getDenominator() ^ (getDenominator() >>> 32));
        result = 31 * result + (int) (getNumerator() ^ (getNumerator() >>> 32));
        return result;
    }
}
