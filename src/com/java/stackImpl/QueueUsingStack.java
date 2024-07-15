package com.java.stackImpl;

import java.util.Stack;

public class QueueUsingStack {

	Stack<Integer> stack1 = new Stack<>();
	Stack<Integer> stack2 = new Stack<>();
	
	void enqueue(int no) {
		stack1.push(no);
		System.out.println("no "+ no+ "is inserted successfully");
	}
	
	void dequeue() {
		while(!stack1.isEmpty()) {
			stack2.push(stack1.pop());
		}
		System.out.println("the removed element is "+ stack2.pop());
	}
	
}
