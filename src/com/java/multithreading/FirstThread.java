package com.java.multithreading;

public class FirstThread extends Thread{

    public void run(){
        System.out.println("inside the run method");
    }
}

//There are two ways to create a thread
//1) extending the Thread class, 2) using the Runnable Interface