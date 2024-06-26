package com.java.collections;

import java.util.HashSet;

public class SetImplementation {

    public static void main(String[] args) {

        HashSet<Integer> id = new HashSet<>();
        HashSet<String> names = new HashSet<>();

        id.add(1);
        id.add(1);
        System.out.println(id);

        names.add("Harshit".toLowerCase());
        names.add("harshit");
        names.add("bhanu");
        names.add("Sai");
        names.add("Salim");
        System.out.println(names);


    }
}
