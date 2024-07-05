package com.java.java8features;

import java.util.ArrayList;
import java.util.List;

public class ForEachImpl {

    public static void main(String[] args) {

        String names[] = { "a", "b", "c", "d"};

        for(int i = 0; i<names.length; i++){
            System.out.println(names[i]);
        }

        //enhanced for loop
        for(String i : names){
            System.out.println(i);
        }

        List<String> namesList = new ArrayList<>();
        namesList.add("a");
        namesList.add("b");
        namesList.add("c");

        namesList.forEach(value -> System.out.print(value+ " "));

    }
}
