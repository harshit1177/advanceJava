package com.java.trees;

public class TotalSum {

	public int findTotalSum(Node node) {
		
		//base condition
		if(node == null)
			return 0;
		
		//logic + recursion
		else
			return node.value + findTotalSum(node.left) + findTotalSum(node.right);
	 
					
	}
}
