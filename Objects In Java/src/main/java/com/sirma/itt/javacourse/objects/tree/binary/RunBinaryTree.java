package com.sirma.itt.javacourse.objects.tree.binary;

public class RunBinaryTree {
	/**
	 * Run function from BinaryTree and BinaryNode to create one binary tree.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		BinaryTree binaryTree = new BinaryTree();

		binaryTree.insertBinaryNode(21, binaryTree);
		binaryTree.insertBinaryNode(19, binaryTree);
		binaryTree.insertBinaryNode(25, binaryTree);
		binaryTree.insertBinaryNode(7, binaryTree);
		binaryTree.insertBinaryNode(20, binaryTree);
		binaryTree.insertBinaryNode(24, binaryTree);
		binaryTree.insertBinaryNode(30, binaryTree);
		binaryTree.insertBinaryNode(23, binaryTree);
		binaryTree.insertBinaryNode(19, binaryTree);
		System.out.println();

		binaryTree.print(binaryTree.root);

		System.out.println();
		binaryTree.searchNodeInTree(binaryTree, 7);
		binaryTree.searchNodeInTree(binaryTree, 90);

	}

}
