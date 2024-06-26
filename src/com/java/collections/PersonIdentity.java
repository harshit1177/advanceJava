package com.java.collections;

import java.util.HashMap;
import java.util.Map;

public class PersonIdentity {

    //we can have duplicates values
    // we will always have unique keys
    // we can have 1 null key in the map.

    public static void main(String[] args) {

        Map<String,String> personId = new HashMap<>();

        personId.put("pancard1","Vishwa");
        personId.put("pancard2","Vishwa");
        personId.put("pancard3","Vishwa");
        personId.put(null,null);
        System.out.println(personId);

        //enhanced for loop to iterate over a collection.
        for(int i = 1;i<= personId.size();i++){
            System.out.println(personId.get(i));
        }
    }
}
