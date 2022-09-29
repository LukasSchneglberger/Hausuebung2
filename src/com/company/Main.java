package com.company;

import jdk.jshell.spi.ExecutionControl;

public class Main {

    public static void main(String[] args) {
        NumberTester nT = new NumberTester("test.txt");

	nT.setOddEvenTester((n) -> (n % 2) == 0);
    nT.setPrimeTester((n) -> {
        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    });

    nT.setPalindromeTester((n) -> {

        String reverse = new StringBuffer(n + "").reverse().toString();
        return (n + "").equals(reverse);
    });
    nT.testFile();



}
}
