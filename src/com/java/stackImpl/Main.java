package com.java.stackImpl;

public class Main {

	public static void main(String[] args) {
		
		CustomStack stack = new CustomStack();
		stack.pop();
		stack.push(100);
		stack.push(50);
		stack.push(110);
		stack.push(60);
		System.out.println("*********************");
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.peek();
        queue.printQueue();
        queue.dequeue();
        queue.printQueue();
        queue.enqueue(90);
        queue.printQueue();
        queue.peek();
        queue.dequeue();
        queue.printQueue();
        System.out.println("*********************");
        
        QueueUsingStack queueUsingStack = new QueueUsingStack();
        queueUsingStack.enqueue(10);
        queueUsingStack.dequeue();
		

	}

}
