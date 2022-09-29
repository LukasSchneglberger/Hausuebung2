package com.company;

import java.util.Scanner;

public class CalculatorController {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        RationalCalculator calc = null;

        VectorCalculator vectorCalculator = null;
        RationalCalculator rationalCalculator = null;

        System.out.println("Choose calculator:");
        System.out.println("1 - Relational Calculator");
        System.out.println("2 - Vector Calculator");
        System.out.println("3 - Complex Calculator");
        System.out.println("4 - Exit program");

        while (s.hasNextLine()) {
            int in = s.nextInt();
            switch (in) {
                case 1:
                    System.out.println("Enter Number x a");
                    double xA = s.nextDouble();
                    System.out.println("Enter Number x b");
                    double xB = s.nextDouble();
                    System.out.println("Enter Number y a");
                    double yA = s.nextDouble();
                    System.out.println("Enter Number y b");
                    double yB = s.nextDouble();
                    int operation = chooseOperation();
                    switch (operation) {
                        case 1 -> {
                            Number tmp = calc.add(new Number(xA, xB), new Number(yA, yB));
                            System.out.println("Solution:");
                            System.out.println("a = " + tmp.getA());
                            System.out.println("b = " + tmp.getB());
                            break;
                        }
                        case 2 -> {
                            Number tmpSub = calc.subtract(new Number(xA, xB), new Number(yA, yB));
                            System.out.println("Solution:");
                            System.out.println("a = " + tmpSub.getA());
                            System.out.println("b = " + tmpSub.getB());
                            break;
                        }
                        case 3 -> {
                            Number tmpMul = calc.multiply(new Number(xA, xB), new Number(yA, yB));
                            System.out.println("Solution:");
                            System.out.println("a = " + tmpMul.getA());
                            System.out.println("b = " + tmpMul.getB());
                            break;
                        }
                        case 4 -> {
                            Number tmpDiv = calc.divide(new Number(xA, xB), new Number(yA, yB));
                            System.out.println("Solution:");
                            System.out.println("a = " + tmpDiv.getA());
                            System.out.println("b = " + tmpDiv.getB());
                            break;
                        }

                    }
                    break;
                case 2:
                    System.out.println("Enter Number x a");
                    double xA2 = s.nextDouble();
                    System.out.println("Enter Number x b");
                    double xB2 = s.nextDouble();
                    System.out.println("Enter Number y a");
                    double yA2 = s.nextDouble();
                    System.out.println("Enter Number y b");
                    double yB2 = s.nextDouble();
                    int operation2 = chooseOperation();
                    switch (operation2) {
                        case 1 -> {
                            Number tmp = vectorCalculator.add(new Number(xA2, xB2), new Number(yA2, yB2));
                            System.out.println("Solution:");
                            System.out.println("a = " + tmp.getA());
                            System.out.println("b = " + tmp.getB());
                            break;
                        }
                        case 2 -> {
                            Number tmpSub = vectorCalculator.subtract(new Number(xA2, xB2), new Number(yA2, yB2));
                            System.out.println("Solution:");
                            System.out.println("a = " + tmpSub.getA());
                            System.out.println("b = " + tmpSub.getB());
                            break;
                        }
                        case 3 -> {
                            Number tmpMul = vectorCalculator.multiply(new Number(xA2, xB2), new Number(yA2, yB2));
                            System.out.println("Solution:");
                            System.out.println("a = " + tmpMul.getA());
                            System.out.println("b = " + tmpMul.getB());
                            break;
                        }
                        case 4 -> {
                            Number tmpDiv = vectorCalculator.divide(new Number(xA2, xB2), new Number(yA2, yB2));
                            System.out.println("Solution:");
                            System.out.println("a = " + tmpDiv.getA());
                            System.out.println("b = " + tmpDiv.getB());
                            break;
                        }


                    }
                case 3:
                    System.out.println("Enter Number x a");
                    double xA3 = s.nextDouble();
                    System.out.println("Enter Number x b");
                    double xB3 = s.nextDouble();
                    System.out.println("Enter Number y a");
                    double yA3 = s.nextDouble();
                    System.out.println("Enter Number y b");
                    double yB3 = s.nextDouble();
                    int operation3 = chooseOperation();
                    switch (operation3) {
                        case 1 -> {
                            Number tmp = rationalCalculator.add(new Number(xA3, xB3), new Number(yA3, yB3));
                            System.out.println("Solution:");
                            System.out.println("a = " + tmp.getA());
                            System.out.println("b = " + tmp.getB());
                            break;
                        }
                        case 2 -> {
                            Number tmpSub = rationalCalculator.subtract(new Number(xA3, xB3), new Number(yA3, yB3));
                            System.out.println("Solution:");
                            System.out.println("a = " + tmpSub.getA());
                            System.out.println("b = " + tmpSub.getB());
                            break;
                        }
                        case 3 -> {
                            Number tmpMul = rationalCalculator.multiply(new Number(xA3, xB3), new Number(yA3, yB3));
                            System.out.println("Solution:");
                            System.out.println("a = " + tmpMul.getA());
                            System.out.println("b = " + tmpMul.getB());
                            break;
                        }
                        case 4 -> {
                            Number tmpDiv = rationalCalculator.divide(new Number(xA3, xB3), new Number(yA3, yB3));
                            System.out.println("Solution:");
                            System.out.println("a = " + tmpDiv.getA());
                            System.out.println("b = " + tmpDiv.getB());
                            break;
                        }



                    }

            }
        }
    }

    public static int chooseOperation(){
        System.out.println("Choose Operation:");
        Scanner in = new Scanner(System.in);
        System.out.println("1 - Add");
        System.out.println("2 - Subtract");
        System.out.println("3 - multiply");
        System.out.println("4 - divide");

        return in.nextInt();


    }
}
