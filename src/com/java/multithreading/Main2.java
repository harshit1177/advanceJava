package com.java.multithreading;

class SharedObject {
    boolean ready = false;

    synchronized void waitForReady() {
        while (!ready) {
            try {
                wait(); // Wait until notified
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread interrupted");
            }
        }
        System.out.println("Ready to proceed!");
    }

    synchronized void setReady() {
        ready = true;
        notify(); // Notify one waiting thread
        // notifyAll(); // Uncomment to notify all waiting threads
    }
}

public class Main2 {
    public static void main(String[] args) {
        SharedObject sharedObject = new SharedObject();

        Thread thread1 = new Thread(() -> {
            sharedObject.waitForReady();
            System.out.println("Thread 1 finished");
        });

        Thread thread2 = new Thread(() -> {
            try {
                Thread.sleep(2000); // Simulate some processing time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            sharedObject.setReady();
            System.out.println("Thread 2 finished");
        });

        thread1.start();
        thread2.start();
    }
}
