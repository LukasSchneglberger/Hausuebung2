package com.company;

import java.util.Scanner;

public class CalculatorController {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        AbstractCalculator calc = null;

        System.out.println("Choose calculator:");
        System.out.println("1 - Relational Calculator");
        System.out.println("2 - Vector Calculator");
        System.out.println("3 - Complex Calculator");
        System.out.println("4 - Exit program");

        while (s.hasNextLine()){
            int in = s.nextInt();
            switch (in){
                case 1 :
                    System.out.println("Enter Number x a");
                    double xA = s.nextDouble();
                    System.out.println("Enter Number x b");
                    double xB = s.nextDouble();
                    System.out.println("Enter Number y a");
                    double yA = s.nextDouble();
                    System.out.println("Enter Number y b");
                    double yB = s.nextDouble();
                    int operation = chooseOperation();
                    switch (operation){
                        case 1 : Number tmp = calc.add(new Number(xA, xB), new Number(yA, yB));
                            System.out.println("Solution:");
                            System.out.println("a = " + tmp.getA());
                            System.out.println("b = " + tmp.getB());
                            break;
                        case 2 : Number tmpSub = calc.subtract(new Number(xA, xB), new Number(yA, yB));
                            System.out.println("Solution:");
                            System.out.println("a = " + tmpSub.getA());
                            System.out.println("b = " + tmpSub.getB());
                            break;
                        case 3 : Number tmpMul = calc.multiply(new Number(xA, xB), new Number(yA, yB));
                            System.out.println("Solution:");
                            System.out.println("a = " + tmpMul.getA());
                            System.out.println("b = " + tmpMul.getB());
                            break;
                    }
            }
        }

        switch ("asdfasdf^1"){
            case "1":
                calc = new RationalCalculator();
                // ...
            default:
                calc = new RationalCalculator();

        }

        calc.add(null, null);
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
