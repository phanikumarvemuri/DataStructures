package com.phani.DS;


public class StackUsingLinkedList {

	Node head;
	int length;

	StackUsingLinkedList()

	{
		this.head = null;
		this.length = -1;
	}

	public void push(Object obj)

	{
		if (this.length == -1) {
			this.length = this.length + 1;
			this.head = new Node(obj);
		} else {
			int i = 0;
			Node temp = head;
			while (i < this.length)

			{

				temp = temp.next;
				i++;

			}
			this.length = this.length + 1;
			temp.next = new Node(obj);

		}
	}

	public  Object pop() {
		if (this.length == -1) {
			System.out.println("Stack is empty");
			return null;
		} else if(this.head.next==null)
		{
			Object d = this.head.data;
			this.head=null;
			this.length=this.length-1;
			return d;
			
		}else
		{
			int i = 0;
			Node temp = head;
			while (i < this.length-1)

			{

				temp = temp.next;
				i++;

			}
			this.length = this.length - 1;
			Object d =  temp.next.data;
			temp.next = null;
			return d;
		}
	}

	public Object peek()

	{
		Node temp = head;
		if (this.length == -1)

		{
			
			System.out.println("Stack is empty");
			return null;

		} else {
			int i = 0;

			while (i < this.length)

			{

				temp = temp.next;
				i++;

			}
			return temp.data;


		}
	}

	public static void main(String[] args) {
		
		StackUsingLinkedList sl  = new StackUsingLinkedList();
		sl.push(10);
		System.out.println(sl.peek());
		System.out.println(sl.pop());
	
		sl.push(20);
		sl.push(30);
	
		System.out.println(sl.peek());
		System.out.println(sl.pop());
		
	}

}
