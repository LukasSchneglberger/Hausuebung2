package com.company;

public class VectorCalculator  extends AbstractCalculator{
    public VectorCalculator(CalculationOperation add, CalculationOperation subtract, CalculationOperation multiply, CalculationOperation divide) {
        super(
                //Add
                (Number a, Number b) ->{
                Number newNum = new Number();
                 newNum.setA(a.getA() + b.getA());
                 newNum.setB(a.getB() + b.getB());
                 return newNum;
                }, (Number a, Number b) ->{
                    Number newNum = new Number();
                    newNum.setA(a.getA() - b.getA());
                    newNum.setB(a.getB() - b.getB());
                    return newNum;
                }, multiply, divide);
    }

    @Override
    public Number add(Number a, Number b) {
        return this.add(a, b);

    }

    @Override
    public Number subtract(Number a, Number b) {
        return this.subtract(a, b);00000
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
