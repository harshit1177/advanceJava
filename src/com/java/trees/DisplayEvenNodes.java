package com.java.trees;

public class DisplayEvenNodes {

	public void printEvenNodes(Node node) {
		
		//base condition
		if(node == null)
			return;
		
		//logic 
		if(node.value % 2 ==0) {
			System.out.print(node.value+ " ");
			//return;
		}
		
		//recursive case
		if(node.left!=null)
			printEvenNodes(node.left);
		
		if(node.right!=null)
			printEvenNodes(node.right);
	}
}
