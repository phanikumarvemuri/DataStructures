package com.phani.DS;

public class Node {
	Node next;
	Object data;
	
	
public Node(Object obj) {
		// TODO Auto-generated constructor stub
		this.next=null;
		this.data=obj;
	}

public Node(Object obj, Node temp)
{
	this.next=temp;
	this.data=obj;
}

	
	

}
