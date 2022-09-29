package com.company;

public class ComplexCalculator extends AbstractCalculator{
    public ComplexCalculator() {
        super(//Add
                (Number a, Number b) -> {
                    Number newNum = new Number();
                    newNum.setA(a.getA() + b.getA());
                    newNum.setB(a.getB() + b.getB());

                    return newNum;
                },

                //Substract
                (Number a, Number b) -> {
                    Number newNum = new Number();
                    newNum.setA(a.getA() - b.getA());
                    newNum.setB(a.getB() - b.getB());

                    return newNum;
                },

                //Multiply
                (Number a, Number b) -> {
                    Number newNum = new Number();
                    newNum.setA(a.getA() * b.getA());
                    newNum.setB(a.getB() * b.getB());

                    return newNum;
                },

                //Divide
                (Number a, Number b) -> {
                    Number newNum = new Number();
                    newNum.setA(a.getA() / b.getA());
                    newNum.setB(a.getB() / b.getB());

                    return newNum;
                });
    }

    @Override
    public Number add(Number a, Number b) {
        return null;
    }

    @Override
    public Number subtract(Number a, Number b) {
        return null;
    }

    @Override
    public Number multiply(Number a, Number b) {
        return null;
    }

    @Override
    public Number divide(Number a, Number b) {
        return null;
    }
}
