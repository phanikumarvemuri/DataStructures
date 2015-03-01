package com.phani.DS;

public class HashNode {
	String key;
	int value;
	HashNode next;
	
	
	HashNode()
	
	{
	this.key=null;
	this.value=0;
	this.next=null;
	}
	
	HashNode(String key, int value, HashNode next)
	{
		this.key=key;
		this.value=value;
		this.next=null;
	}

}
