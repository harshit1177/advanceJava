package com.java.stackImpl;

public class CustomStack {

	// define the max size of the array/stack
	static final int MAX = 3;
	int top=-1; // keep the track of top most element in the stack
	int stackArray[] = new int[MAX]; // we have created a stack array

	public boolean push(int x) {

		if (top >= MAX - 1) {
			System.out.println("Stack overflow");
			return false;
		} else {
			top++;
			stackArray[top] = x;
			System.out.println("the no " + x + " is successfully inserted");
			return true;
		}
	}

	public int pop() {
		if (top < 0) {
			System.out.println("Stack is empty can't perform pop operation");
			return 0;
		}
		int x = stackArray[top];
		top--;
		return x;
	}

	// peek operation will give me the topmost element of the stack
	public int peek() {

		if (top < 0) {
			System.out.println("Stack is empty");
			return 0;
		} else {
			int x = stackArray[top];
			return x;
		}
	}
	
	public void printStack() {
		for(int i=top;i>-1;i--) {
			System.out.print(" "+stackArray[i]);
		}
	}

}
