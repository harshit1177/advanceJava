package com.java.trees;

public class LeftSkewedTree {

	public void printLeftSkewedTree(Node node) {
		
		//base condition
		if(node == null)
			return;
		
		//recursive case
		if(node.left!=null || node!=null) {
			System.out.print(node.value+" ");
			printLeftSkewedTree(node.left);
		}
		
	}
}
