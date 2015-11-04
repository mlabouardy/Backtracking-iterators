package com.labouardy.model;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree<T extends Comparable<T>> {
	private Node<T> root;
	private BinaryTree<T> left,right;
	
	public BinaryTree(){
	}
	
	public void insert(T element){
		if(root==null){
			root=new Node(element);		
		}else{
			if(root.compareTo(element)<0){
				if(right==null)
					right=new BinaryTree<T>();
				right.insert(element);
			}else{
				if(left==null)
					left=new BinaryTree<T>();
				left.insert(element);
			}
		}
	}
	
	
	public void postOrder(){
		if(root!=null){
			if(left!=null)
				left.postOrder();
			if(right!=null)
				right.postOrder();
			System.out.print(root+" ");
		}
	}
	
	public void inOrder(){
		if(root!=null){
			if(left!=null)
				left.inOrder();
			System.out.print(root+" ");
			if(right!=null)
				right.inOrder();
		}
	}
	
	public void preOrder(){
		if(root!=null){
			System.out.print(root+" ");
			if(left!=null)
				left.preOrder();
			if(right!=null)
				right.preOrder();
		}
	}
	
	
	public void bf(){
		Queue<BinaryTree<T>> queue=new LinkedList<BinaryTree<T>>();
		queue.add(this);
		while(!queue.isEmpty()){
			BinaryTree<T> tree=queue.poll();
			if(tree!=null){
				System.out.println(tree.root);
				BinaryTree<T> leftT=tree.left;
				BinaryTree<T> rightT=tree.right;
				if(leftT!=null){
					System.out.println(leftT.root);
					queue.add(leftT.left);
					queue.add(leftT.right);
				}
				if(rightT!=null){
					System.out.println(rightT.root);
					queue.add(rightT.left);
					queue.add(rightT.right);
				}
			}
		}
	}
	
}
