package com.java.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> noList = new ArrayList();
        noList.add(10);
        noList.add(11);
        noList.add(12);
        noList.add(12);

        
        String abc = "names2";
        abc.length();
        
        int[] noArray = {1,2,3,4};
        int length = noArray.length;
        System.out.println(noArray[1]);

        System.out.println(abc.charAt(2));

        LinkedList<String> names = new LinkedList<>();

        for(int i =0 ;i<noList.size();i++){
            System.out.println(noList.get(i));
        }

    }
}
