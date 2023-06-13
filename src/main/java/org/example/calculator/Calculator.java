package org.example.calculator;

import org.example.calculator.exception.NotANumberException;
import org.example.calculator.exception.NullException;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Calculator {
    private static final Consumer<Double> nullCheck = (a) -> {
        if (a == null) {
            throw new NullException("Null is not a valid parameter");
        }
    };
    private static final BiConsumer<Double, Double> biNullCheck = (a, b) -> {
        if (a == null || b == null) {
            throw new NullException("Null is not a valid parameter");
        }
    };

    public Double add(Double a, Double b) {
        biNullCheck.accept(a, b);
        if(Double.isNaN(a)||Double.isNaN(b)){
            throw new NotANumberException("Cannot add value of NaN");
        }
        return a + b;
    }

    public Double subtract(Double a, Double b) {
        biNullCheck.accept(a, b);
        if(Double.isNaN(a)||Double.isNaN(b)){
            throw new NotANumberException("Cannot subtract value of NaN");
        }
        return a - b;
    }

    public Double multiply(Double a, Double b) {
        biNullCheck.accept(a, b);
        if(Double.isNaN(a)||Double.isNaN(b)){
            throw new NotANumberException("Cannot multiply with value of NaN");
        }
        return a * b;
    }

    public Double divide(Double a, Double b) {
        biNullCheck.accept(a, b);
        if(Double.isNaN(a)||Double.isNaN(b)){
            throw new NotANumberException("Cannot divide value of NaN");
        }
        return a / b;
    }

    public Double square(Double a) {
        nullCheck.accept(a);
        if(Double.isNaN(a)){
            throw new NotANumberException("Cannot square value of NaN");
        }
        return a * a;
    }

    public Double squareRoot(Double a) {
        nullCheck.accept(a);
        if(Double.isNaN(a)){
            throw new NotANumberException("Cannot take square root value of NaN");
        }
        return Math.sqrt(a);
    }

    public Double power(Double a, Double b) {
        biNullCheck.accept(a, b);
        if(Double.isNaN(b)||Double.isNaN(a)){
            throw new NotANumberException("Cannot calculate power value of NaN");
        }
        return Math.pow(a, b);
    }

    public Double absolute(Double a) {
        nullCheck.accept(a);
        if(Double.isNaN(a)){
            throw new NotANumberException("Cannot calculate absolute value of NaN");
        }
        return Math.abs(a);
    }
}
