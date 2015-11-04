package com.labouardy.model;

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

			System.out.println(root);
		}
	}
	
	public void inOrder(){
		if(root!=null){
			if(left!=null)
				left.inOrder();
			System.out.println(root);
			if(right!=null)
				right.inOrder();
		}
	}
	
	public void preOrder(){
		if(root!=null){
			System.out.println(root);
			if(left!=null)
				left.preOrder();
			if(right!=null)
				right.preOrder();
		}
	}
	
}
