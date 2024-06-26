package com.java.multithreading;

import javax.swing.plaf.basic.BasicTreeUI;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Main main2= new Main();
        System.out.println(Thread.currentThread());
        var currentTime = System.currentTimeMillis();
        System.out.println(currentTime);
        Thread.sleep(10000);
        System.out.println(System.currentTimeMillis()-currentTime +"ms");
        synchronized (main2){
            main2.wait(1000);
        }
        main2.notify();
        System.out.println(main2.hashCode());

        FirstThread firstThread = new FirstThread();
        Thread secondThread = new Thread(new SecondThread());
        secondThread.setPriority(Thread.MAX_PRIORITY); //10
        System.out.println(firstThread.getPriority()); //5
        firstThread.setPriority(Thread.MIN_PRIORITY); //1
        System.out.println(secondThread.getPriority()); //10
      //  firstThread.run();
         firstThread.start();
     //   firstThread.wait(1000);
        secondThread.start();
        secondThread.run();

        System.out.println(firstThread.getPriority());
        System.out.println(secondThread.getPriority());

        Object obj = new Object();

        Dummy dummy = new Dummy();



    }
}
