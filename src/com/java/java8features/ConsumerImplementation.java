package com.java.java8features;

import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerImplementation {

    public static void main(String[] args) {

        System.out.println("Enter your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        Consumer consume = (s) -> {
            System.out.println("Hello "+s);
        };

        Consumer consume2 = (s2) -> {
            System.out.println(s2);
        };

        consume2.accept(name);
        consume.accept(name);


    }

}
