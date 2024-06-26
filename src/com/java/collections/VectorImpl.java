package com.java.collections;

import java.util.Vector;

public class VectorImpl {

    public static void main(String[] args) {

        Vector<String> names = new Vector<>();
        names.add("C");
        names.add("A");
        names.add("B");
        names.add(1,"D");
        System.out.println(names.elementAt(3));
        System.out.println(names.contains("E"));
        System.out.println(names);
    }
}
