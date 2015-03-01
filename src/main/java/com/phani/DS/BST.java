package com.phani.DS;

public class BST {

	TreeNode root;

	public BST() {
		this.root = null;
	}

	public TreeNode insert(TreeNode head, Integer x)

	{
		TreeNode current = null;
		if (head == null) {
			head = new TreeNode(null, null, x);
			if (root == null) {
				root = head;
			}
		} else {
			current = head;
			if (current.value > x) {

				current.left = insert(current.left, x);

			} else {
				current.right = insert(current.right, x);
			}
		}

		return head;
	}

	/*
	 * Delete function takes the value of the Node to be deleted and then
	 * divided into 3 cases
	 * 
	 * Case 1 : If Node has no Child
	 * 
	 * for case 1 : Assign the Node to null and delete the link with the parent
	 * 
	 * Case 2 : If Node has single Child
	 * 
	 * for case 2 : Assign the Child of the Node to the Parent of the Node and
	 * delete the Node. The position depends on the position of the child to the
	 * Node. If the position is left then Assign the child to left of the Parent
	 * else right of the parent
	 * 
	 * Case 3 : If Node has two Children
	 * 
	 * for case 3 : Either find the Right min value of the subtree of the Node
	 * or Left Max value of the Subtree and then replace the value with the
	 * value of Node and delete the another replicated node as above
	 */

	public void delete(int x) {
		int ret = 0;
		if (this.root == null) {
			System.out.println("No nodes to delete");
			ret = 1;
		} else {
			TreeNode current = this.root;
			TreeNode parent = this.root;
			String position = null;

			while (current != null) {
				if (current.value > x) {
					parent = current;
					position = "left";
					current = current.left;

				} else if (current.value < x) {
					position = "right";
					parent = current;
					current = current.right;
				} else {
					if (current.left == null && current.right == null) {

						current = null;
						if (position == "left")
							current.left = null;
						else
							current.right = null;
						ret = 1;

					} else if (current.left == null && current.right != null) {

						if (position == "left") {
							parent.left = current.right;
							current = null;
						} else {
							parent.right = current.right;
							current = null;
						}
						ret = 1;

					} else if (current.left != null && current.right == null) {
						if (position == "left") {
							parent.left = current.left;
							current = null;
						} else {
							parent.right = current.left;
							current = null;
						}
						ret = 1;
					} else {
						TreeNode[] min = findrightmin(current, current.right);
						int finalvalue = min[1].value;
						delete(min[1].value);
						current.value = finalvalue;
						ret = 1;

					}

				}
			}

		}

		if (ret == 0)
			System.out.println("Element not found");

	}

	private TreeNode[] findrightmin(TreeNode p, TreeNode head) {

		if (head.left == null)

		{
			return new TreeNode[] { p, head };
		} else {
			p = head;
			findrightmin(p, head.left);
		}

		return new TreeNode[] { p, head };

	}

	/*
	 * Main Method called for Traversal based on type
	 * "PreOrder","PostOrder","InOder"
	 */

	public void Traversal(String order) {

		if (this.root == null) {
			System.out.println("NO elements found for Traverssal");
		} else {
			TreeNode parent = root;
			if (order == "preorder")
				gotopreorder(this.root);
			else if (order == "inorder")
				gotoinorder(this.root);
			else
				gotopostorder(this.root);
		}

	}

	/* PostOrder Traversal have priority in th way Left-->Right..>Root */
	/* Solved using recursion */

	private void gotopostorder(TreeNode head) {
		if (head == null)
			return;
		gotopostorder(head.left);
		gotopostorder(head.right);
		System.out.println(head.value);

	}

	/* InOrder Traversal have priority in the way Left-->Root..>Right */
	/* Solved using recursion */

	private void gotoinorder(TreeNode head) {
		if (head == null)
			return;
		gotoinorder(head.left);
		System.out.println(head.value);
		gotoinorder(head.right);
	}

	/* PreOrder Traversal have priority in the way Root-->Left..>Right */
	/* Solved using recursion */

	private void gotopreorder(TreeNode head) {

		if (head == null)
			return;
		System.out.println(head.value);
		gotopreorder(head.left);
		gotopreorder(head.right);
	}

	public static void main(String[] args) {
		BST bt = new BST();
		bt.insert(bt.root, 5);
		// System.out.println(bt.root.value);
		bt.insert(bt.root, 3);
		// System.out.println(temp.value);
		bt.insert(bt.root, 4);
		bt.insert(bt.root, 6);
		bt.insert(bt.root, 7);
		bt.insert(bt.root, 7);
		bt.delete(3);
		bt.delete(5);
		bt.Traversal("inorder");
		bt.Traversal("preorder");
		bt.Traversal("postorder");

	}

}
