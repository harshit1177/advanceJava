package com.java.multithreading;

public class StringBestPractice {

    public static void main(String[] args) {

        String first = "";
        StringBuilder second = new StringBuilder();
        System.out.println("Using the string concat method ");
        var currentTime = System.currentTimeMillis();
        System.out.println(currentTime);
        for(int i =0 ;i<10000;i++){
            first = first + i;
        }
        System.out.println(System.currentTimeMillis() - currentTime  + " ms ");

        var currentTime2 = System.currentTimeMillis();
        System.out.println();
        System.out.println("Using the string builder method. ");
        System.out.println(currentTime);
        for(int i =0 ;i<10000;i++){
            second = second.append(i);
        }
        System.out.println( System.currentTimeMillis() - currentTime2+ " ms ");



    }
}
