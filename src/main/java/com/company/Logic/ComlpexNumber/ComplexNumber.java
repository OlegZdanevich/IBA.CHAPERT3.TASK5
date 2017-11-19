package com.company.Logic.ComlpexNumber;

import com.company.Logic.Fraction.Fraction;


public class ComplexNumber {
    private Fraction realPart = null;
    private Fraction imaginaryPart = null;

    public ComplexNumber(Fraction realPart, Fraction imaginaryPart) {
        this.realPart = new Fraction(realPart);
        this.imaginaryPart = new Fraction(imaginaryPart);
    }

    public Fraction getImaginaryPart() {
        return imaginaryPart;
    }

    public Fraction getRealPart() {
        return realPart;
    }

    @Override
    public String toString() {
        return "(" + realPart + ")+(" + imaginaryPart + ")i";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ComplexNumber)) return false;

        ComplexNumber that = (ComplexNumber) o;

        if (getRealPart() != null ? !getRealPart().equals(that.getRealPart()) : that.getRealPart() != null)
            return false;
        return getImaginaryPart() != null ? getImaginaryPart().equals(that.getImaginaryPart()) : that.getImaginaryPart() == null;
    }

    @Override
    public int hashCode() {
        int result = getRealPart() != null ? getRealPart().hashCode() : 0;
        result = 31 * result + (getImaginaryPart() != null ? getImaginaryPart().hashCode() : 0);
        return result;
    }
}
