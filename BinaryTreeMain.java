package com.bridgelab.BinaryTree;

public class BinaryTreeMain {
	public static void main(String[] args) {
		System.out.println("Welcome in Binary  Tree program");
		BinaryTree tree = new BinaryTree();
		
		tree.addElement(56);
		tree.addElement(30);
		tree.addElement(70);

		System.out.println("\nBinary search tree after insertion of element");

		tree.display(tree.root);
	}


}
