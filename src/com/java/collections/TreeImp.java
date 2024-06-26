package com.java.collections;

import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;

public class TreeImp {

    public static void main(String[] args) {

        TreeSet<String> names = new TreeSet<>();
        names.add("Harshit".toLowerCase());
        names.add("harshit");
        names.add("bhanu");
        names.add("Sai");
        names.add("Salim");
        names.add("Sab");
        names.add("ab");
        System.out.println(names);

        //based on the keys the ording will happen.
        TreeMap<Integer,String> names2 = new TreeMap<>();
        names2.put(10, "ABC");
        names2.put(15,"abc");
        names2.put(5,"abc");
        names2.put(1,"something");
        System.out.println(names2);

        //Thread safe collections : we can use in multi user environment

        //
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        list.add(10);
        list.add(20);
        System.out.println(list);
    }
}

//Tree --> maintain the order
//Hash --> O(1) time complexity fast execution
//Set --> Hold unique values
//Map --> Key value pair.