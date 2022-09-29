package com.company;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class RationalCalculator extends AbstractCalculator {

    public RationalCalculator() {
        super(
                //Add
                (Number a, Number b) -> {
                    Number newNum = new Number();
                    newNum.setA(a.getA() + b.getA());

                    return newNum;
                },

                //Substract
                (Number a, Number b) -> {
                    Number newNum = new Number();
                    newNum.setA(a.getA() - b.getA());

                    return newNum;
                },

                //Multiply
                (Number a, Number b) -> {
                    Number newNum = new Number();
                    newNum.setA(a.getA() * b.getA());

                    return newNum;
                },

                //Divide
                (Number a, Number b) -> {
                    Number newNum = new Number();
                    newNum.setA(a.getA() / b.getA());

                    return newNum;
                });



    }

    @Override
    public Number add(Number a, Number b) {
        return this.add(a, b);
    }

    @Override
    public Number subtract(Number a, Number b) {
        return this.subtract(a,b);
    }

    @Override
    public Number multiply(Number a, Number b) {
        return this.multiply(a,b);
    }

    @Override
    public Number divide(Number a, Number b) {
        return this.divide(a,b);
    }
}
