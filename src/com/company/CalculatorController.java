package com.company;

import java.util.Scanner;

public class CalculatorController {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        AbstractCalculator calc;

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
}
