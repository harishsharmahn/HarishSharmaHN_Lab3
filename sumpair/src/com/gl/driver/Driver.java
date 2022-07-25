package com.gl.driver;

import com.gl.service.Node;
import com.gl.service.SumOfPairInBinarySearchTree;

public class Driver {

	public static void main(String[] args) 
	{
	
	SumOfPairInBinarySearchTree sumPair = new SumOfPairInBinarySearchTree();
		
		Node root = new Node(40);
		root.left = new Node(20);
		root.left.left = new Node(10);
		root.left.right = new Node(30);
		root.right = new Node(60);
		root.right.right = new Node(70);
		root.right.left = new Node(50);
		
		sumPair.printSumOfPair(root, 115);
		
	}


	
	
}


