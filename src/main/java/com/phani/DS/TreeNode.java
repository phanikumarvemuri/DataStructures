package com.phani.DS;

public class TreeNode {
	
	Integer value;
	TreeNode left;
	TreeNode right;
	
	public TreeNode()
	{
		this.value=null;
		this.left=null;
		this.right=null;
		
	}
	
	public TreeNode(TreeNode left,TreeNode right,Integer obj)
	{
		this.value=obj;
		this.left=left;
		this.right=right;	
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}
	
	
	

}
