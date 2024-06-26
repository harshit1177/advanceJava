package com.java.multithreading;

public class Main3 {

    public static void main(String[] args) {

        JoiningThread jt1 = new JoiningThread();
        JoiningThread jt2 = new JoiningThread();
        JoiningThread jt3 = new JoiningThread();
        jt1.start();
        try{
            System.out.println("Using jt1 thread");
            jt1.join();
        }
        catch (Exception ex){
            System.out.println(ex);
        }

        jt2.start();
        try{
            System.out.println("Using the jt2 thread");
            jt2.join();
        }
        catch (Exception ex){
            System.out.println(ex);
        }
        jt3.start();
    }
}
