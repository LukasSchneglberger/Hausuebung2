package com.company;

import java.util.ArrayList;
import java.util.List;

public class HalloJavamitForEach {


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Foo");
        list.add("Bar");
        list.add("FooBar");
        list.add("BarFoo");

        for(String s : list){
            System.out.println(s);
        }

        list.forEach((s) -> System.out.println(s));
        list.forEach(System.out::println);



    }
}
