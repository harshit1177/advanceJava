package com.java.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapImpl {

    public static void main(String[] args) {

     //   Map<Key, Value>
        HashMap<String,String> names = new HashMap<>();
        Map<String,Integer> marks = new ConcurrentHashMap<>();
        marks.put("Maths", 90);
        marks.put("English", 80);
        marks.put("Computer", 90);
        System.out.println(marks);
        names.put(null,"ABC");
        names.put("pancard1","dummy");
        names.put("pancard1", "dummy2");
       // names.remove(null);
        System.out.println(names);
        System.out.println(names.keySet());

      //  names.put("pancard1","dummy2");
        System.out.println(names);

    }
}
