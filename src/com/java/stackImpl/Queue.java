package com.java.stackImpl;

public class Queue {

	static final int MAX = 10;
	int front= 0; // keep the track of front and rear most element in the stack
	int rear = -1; 
	int queueArray[] = new int[MAX]; // we have created a stack array
	
	public boolean enqueue(int no) {
		if(rear == MAX-1) {
			System.out.println("Queue is full ");
			return false;
		}
		 rear++;
		 queueArray[rear] = no;
		
		 return true;
	}
	
	public int dequeue() {
		
		
		if(rear == front) {
			System.out.println("Queue is empty");
			return 0;
		}
		else{
			int no =  queueArray[front];
		front++;
		return no;
		}
	}
	
	public int peek() {
		System.out.println();
		if(rear == front) {
			System.out.println("Queue is empty");
			return 0;
		}
		else {
			System.out.println(queueArray[front]);
			return queueArray[front];
		}
	}
	
	public void printQueue() {
		System.out.println();
		for(int i=front; i<=rear;i++) {
			System.out.print(" -> "+queueArray[i]);
		}
	}

}
