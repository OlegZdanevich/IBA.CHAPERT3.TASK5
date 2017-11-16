package com.company.ComlpexNumber;

import com.company.Fraction.Fraction;
import com.company.Fraction.FractionTools;

public abstract class ComplexNumberTools {

    public static ComplexNumber sum(ComplexNumber complexNumber1, ComplexNumber complexNumber2) {

        Fraction realPart = FractionTools.sum(complexNumber1.getRealPart(), complexNumber2.getRealPart());
        Fraction imaginaryPart = FractionTools.sum(complexNumber1.getImaginaryPart(), complexNumber2.getImaginaryPart());

        return new ComplexNumber(realPart, imaginaryPart);
    }

    public static ComplexNumber multiplication(ComplexNumber complexNumber1, ComplexNumber complexNumber2) {
        Fraction firstComplexNumberRealPart = complexNumber1.getRealPart();
        Fraction secondComplexNumberRealPart = complexNumber2.getRealPart();

        Fraction firstComplexNumberImaginaryPart = complexNumber1.getImaginaryPart();
        Fraction secondComplexNumberImaginaryPart = complexNumber2.getImaginaryPart();

        Fraction firstPartOfDifferenceRealPart = FractionTools.multiplication(firstComplexNumberRealPart, secondComplexNumberRealPart);
        Fraction secondPartOfDifferenceRealPart = FractionTools.multiplication(firstComplexNumberImaginaryPart, secondComplexNumberImaginaryPart);

        Fraction firstPartOfDifferenceImaginaryPart = FractionTools.multiplication(firstComplexNumberRealPart, secondComplexNumberImaginaryPart);
        Fraction secondPartOfDifferenceImaginaryPart = FractionTools.multiplication(firstComplexNumberImaginaryPart, secondComplexNumberRealPart);

        Fraction realPart = FractionTools.difference(firstPartOfDifferenceRealPart, secondPartOfDifferenceRealPart);
        Fraction imaginaryPart = FractionTools.difference(firstPartOfDifferenceImaginaryPart, secondPartOfDifferenceImaginaryPart);

        return new ComplexNumber(realPart, imaginaryPart);
    }
}
