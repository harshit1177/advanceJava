package com.java.multithreading;

public class SecondThread implements  Runnable{
    @Override
    public void run() {
        System.out.println("this run method is coming from the Runnable interface");
    }
}
