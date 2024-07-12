package com.java.trees;

public class BinaryTree {

	public static void main(String[] args) {

		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(50);
		root.left.left = new Node(30);
		root.left.right = new Node(40);
		root.right.left = new Node(60);
		root.right.right = new Node(70);
	//	System.out.println(root.left.left.value);
        LeafNodes leafNodes = new LeafNodes();
        leafNodes.printLeafNodes(root);
        System.out.println();
        CountNodes countNodesObject = new CountNodes();
        System.out.println("total no of nodes are "+
                             countNodesObject.countNodes(root));
        TotalSum totalSum = new TotalSum();
        System.out.println(totalSum.findTotalSum(root));
		
        DisplayEvenNodes displayEvenNodes = new DisplayEvenNodes();
        displayEvenNodes.printEvenNodes(root);
        System.out.println();
        System.out.println();
        System.out.println("PreOrder Traversal");
        Traversal traversal = new Traversal();
        traversal.preOrderTraversal(root);
        System.out.println();
        System.out.println();
        System.out.println("In Order Traversal");
        traversal.inOrderTraversal(root);
        System.out.println();
        System.out.println();
        System.out.println("Post Order Traversal");
        traversal.postOrderTraversal(root);
        System.out.println();
        LeftSkewedTree leftSkewedTree = new LeftSkewedTree();
        leftSkewedTree.printLeftSkewedTree(root);
	}
}
