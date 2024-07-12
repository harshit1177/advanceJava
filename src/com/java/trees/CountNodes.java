package com.java.trees;

public class CountNodes {

	public int countNodes(Node node) {
		
		if(node == null)
			return 0;
		else
			return 1 + countNodes(node.left) + countNodes(node.right);
	 
					
	}
}
