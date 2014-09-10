package com.sirma.itt.javacourse.objects.tree.binary;

public class RunBinaryTree {
	/**
	 * Run function from BinaryTree and BinaryNode to create one binary tree.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		BinaryTree binaryTree = new BinaryTree();

		binaryTree.insertBinaryNode(21);
		binaryTree.insertBinaryNode(19);
		binaryTree.insertBinaryNode(25);
		binaryTree.insertBinaryNode(7);
		binaryTree.insertBinaryNode(20);
		binaryTree.insertBinaryNode(24);
		binaryTree.insertBinaryNode(30);
		binaryTree.insertBinaryNode(23);
		binaryTree.insertBinaryNode(19);
		System.out.println();

		binaryTree.print(binaryTree.root);

		System.out.println();
		binaryTree.searchNodeInTree(7);
		binaryTree.searchNodeInTree(90);

	}

}
