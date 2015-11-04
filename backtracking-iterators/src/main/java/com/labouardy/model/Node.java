package com.labouardy.model;

public class Node<T extends Comparable<T>> implements Comparable<T>{
	private T value;
	
	public Node(T value){
		this.value=value;
	}
	
	public String toString(){
		return ""+value;
	}

	public int compareTo(T t2) {
		return value.compareTo(t2);
	}
	
	
}
