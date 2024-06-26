package com.java.collections;

import java.util.Stack;

public class StackImpl {

    public static void main(String[] args) {

        Stack<Integer> marksStack = new Stack<>();
        System.out.println(marksStack);
        marksStack.push(20);
        System.out.println(marksStack.peek());

     //   marksStack.pop();
        marksStack.push(30);
        System.out.println(marksStack.peek());
        marksStack.push(50);
        marksStack.pop();
        marksStack.push(80);
        marksStack.push(90);
        System.out.println(marksStack);
        System.out.println(marksStack.search(30));

    }


}
