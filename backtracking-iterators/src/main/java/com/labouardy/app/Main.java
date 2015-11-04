package com.labouardy.app;

import com.labouardy.model.BinaryTree;

public class Main {
	public static void main(String[] args) {
		BinaryTree<Integer> tree=new BinaryTree<Integer>();
		tree.insert(5);
		tree.insert(2);
		tree.insert(7);
		tree.insert(1);
		tree.insert(3);
		System.out.println("Post order");
		tree.postOrder();
		System.out.println("In Order");
		tree.inOrder();
		System.out.println("Pre order");
		tree.preOrder();
		System.out.println("BF");
		tree.bf();
	}
}
