package com.phani.DS;
//  Stack Implementation using Linked List usually a bit different which has time complexity of O(1)
// for all the methods push,pop,peek

public class Stack2 {
	
	Node head;
	int length;
	
	Stack2()
	
	{
		this.head=null;
		this.length=-1;
	}

	
	public void push(Object obj)
	
{
		if(this.head ==null)
	
{
	System.out.println("Stack is empty");
	System.out.println("Adding first element");
	this.length=this.length+1;
	this.head=new Node(obj,null);
	}
else
{
	Node temp = head;
	head=new Node(obj,temp);
	this.length=this.length+1;
	
}
}
	
	public Object  pop()
	{
		if (this.head ==null)
			
		{
			System.out.println("Stach is empty");
			return null;
		}
		else
		{
			Node temp = head;
			head = temp.next;
			this.length=this.length-1;
			return temp.data;
		}
	}
	
	public Object peek()
	{
		if(head==null)
		{
			
			System.out.println("stack is empty");
			return null;
		}else
		{
			return this.head.data;
		}
			
		
		
	}
	
	public boolean isempty()
	{
		return this.head==null;
	}
	
	
	public static void main(String [] args)
	{
		Stack2 sl = new Stack2();
		sl.push(10);
		System.out.println(sl.peek());				
		System.out.println(sl.pop());
	
		sl.push(20);
		sl.push(30);
	
		System.out.println(sl.peek());
		System.out.println(sl.pop());
		
	}
	
	
}