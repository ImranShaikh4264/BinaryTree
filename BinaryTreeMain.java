package com.bridgelab.BinaryTree;

public class BinaryTreeMain {
	public static void main(String[] args) {
		System.out.println("Welcome in Binary  Tree program");
		BinaryTree tree = new BinaryTree();
		
		tree.addElement(56);
		tree.addElement(30);
		tree.addElement(70);
		tree.addElement(22);
		tree.addElement(40);
		tree.addElement(11);
		tree.addElement(3);
		tree.addElement(16);
		tree.addElement(35);
		tree.addElement(60);
		tree.addElement(93);
		tree.addElement(63);
		tree.addElement(67);
		
		System.out.println("The number of element "+tree.size(tree.root));
		System.out.println("\nBinary search tree after insertion of element");

		tree.display(tree.root);
	}


}
