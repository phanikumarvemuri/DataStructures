package com.phani.DS;


import java.lang.reflect.Array;
import java.util.Vector;

public class Stack<T> extends Vector {
	int TOP;
	int MAX;
	Vector<T> v;
	Stack(int size)
	{
		this.TOP=-1;
		this.MAX=size;
		this.v = new Vector<T>();
	}
	
	
	public void push(T t)
	{
		
		if(this.TOP==this.MAX-1)
		{
			System.out.println("Stack is full");
			try {
				throw new Exception("Stck out of bound exception");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{
			this.TOP=this.TOP+1;
			this.v.add(TOP, t);
		}
			
		
	}
	
	public void pop()
	{
		if(this.TOP==-1)
		{
			System.out.println("NO elemensts in the stack");
		}
		else
		{
			this.v.remove(TOP);
			this.TOP=this.TOP-1;
			
		}
		
	}
	
	public boolean isEmpty()
	{
		if(this.TOP==-1)
		{
			System.out.println("Stack is empty");
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public Object peek()
	{
		
		return this.v.get(TOP);
		
	}

	public static void main(String[] args) {
		
		Stack<Integer> s = new Stack<Integer>(10);
		s.push(10);
		s.push(20);
		System.out.println(s.peek());
		
		
		

	}

}
