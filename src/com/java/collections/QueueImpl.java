package com.java.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueImpl {

    //two imp methods 1) Enqueue insertion , Dequeue delete

    public static void main(String[] args) {

        Deque<Integer> queueImpl = new ArrayDeque<>();
      //  Deque<Integer> values = new ArrayDeque<>();
        queueImpl.add(100);
        queueImpl.add(100);
        System.out.println(queueImpl);
        queueImpl.add(20);
        System.out.println(queueImpl);
        System.out.println(queueImpl.peek());
        queueImpl.add(50);
        System.out.println(queueImpl);
        queueImpl.add(60);
        System.out.println(queueImpl.peek());
        System.out.println(queueImpl);
        queueImpl.add(40);
        System.out.println(queueImpl);

    }
}
