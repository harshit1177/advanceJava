package com.java.java8features;

import java.util.*;

public class DSA {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Set<Character> setVAlue = new HashSet<>();
        Map<Character,Integer> occurences = new HashMap<>();
        int counter =0;
        int finalCounter = 0;
        char currChar;
        for(int i = 0; i<name.length();i++){
            currChar = name.charAt(i);
            if(!setVAlue.contains(currChar)){
                setVAlue.add(currChar);
                counter = 0;
                for(int j=i; j<name.length();j++){
                    if(name.charAt(j) == currChar){
                        counter++;
                    }
                }
                finalCounter = counter;
               // System.out.println(finalCounter);
            }
            if(!occurences.containsKey(currChar))
             occurences.put(currChar,finalCounter);
        }

        System.out.println(occurences);
    }
}
