package com.bridgelab.BinaryTree;

public class BinaryTree {
	Node root;
	static int size = 0;

	// Method to add data in tree
	public void addElement(int data) {
		Node node = new Node(data);
		node.data = data;
		node.left = null;
		node.right = null;

		if (root == null) {
			root = node;
			return;
		} 
		else {
			Node parent = root;
			Node current = root;
			while (current != null) {
				parent = current;
				if (node.data > current.data) {
					current = current.right;
				} else {
					current = current.left;
				}
			}
			if (node.data > parent.data) {
				parent.right = node;
			} 
			else {
				parent.left = node;
			}
		}
	}

	public static int size(Node node) {
		
		if (node.left != null) {
			size(node.left);

		}
		size++;

		if (node.right != null) {
			size(node.right);
		
		}
		return size;

	}

	// Method to display data of tree
	public void display(Node node) {
		if (node.left != null) {
			display(node.left);
		}

		System.out.print(node.data + " ");

		if (node.right != null) {
			display(node.right);
		}
	}
}
