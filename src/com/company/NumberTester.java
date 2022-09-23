package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NumberTester{
    private NumberTest oddTester;
    private NumberTest primeTester;
    private NumberTest palindromeTester;

    private String fileName;
    public NumberTester (String fileName ) {
       this.fileName = fileName;
       oddTester = (n) -> (n % 2) == 0;
       primeTester = (n) -> {
           if (n <= 1)
               return false;

           for (int i = 2; i < n; i++)
               if (n % i == 0)
                   return false;

           return true;
       };
        palindromeTester = (n) -> {

            String reverse = new StringBuffer(n + "").reverse().toString();


            return (n + "").equals(reverse);
        };
    }
    public void setOddEvenTester (NumberTest oddTester) {
        this.oddTester = oddTester ;
    }

    public void setPrimeTester (NumberTest primeTester) {
        this.primeTester = primeTester ;
}
    public void setPalindromeTester (NumberTest palindromeTester) {
        this.palindromeTester = palindromeTester ;
}
    public void testFile ( ) {

        try {
            Scanner s = new Scanner(new File(fileName));
            while (s.hasNextLine()){
                
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
