package com.phani.DS;

public class Queue {
	
	Node head;
	Node tail;
	int count;
	
	Queue()
	
	{
		this.head=null;
		this.tail=null;
		count=0;
		}
	
	public void enqueue(Object x)
	{
		if(this.tail==null)
		{
			System.out.println("Queue is empty.Adding first element");
			this.head=new Node(x,null);
			this.tail=this.head;
			this.count++;
		}
		else
		{
			Node temp = this.tail;
			this.tail = new Node(x,null);
			temp.next=null;
			this.count++;
		}
	}
	
	public void dequeue()
	{
		if(this.head==null)
		{
			System.out.println("Queue is empty.No elements to return");
			
		}
		else if (this.head.next==null)
		{
			Node temp;
			temp= head.next;
			head=temp;
			this.tail=null;
			this.count--;
			}
		else
		{
			Node temp;
			temp= head.next;
			head=temp;
			this.tail=null;
			this.count--;
		}
	}
	
	public Object peek()
	{
		return head.data;
		
	}
	
	public int size()
	{
		return this.count;
	}
	
	public boolean isEmpty()
	{
		return this.count==0;
	}
	
	public static void main(String []  args)
	{
		Queue q  = new Queue();
		q.enqueue(10);
		q.dequeue();
		q.enqueue(20);
		System.out.println(q.peek());
		q.dequeue();
		System.out.println(q.isEmpty());
		
	}
	

}
