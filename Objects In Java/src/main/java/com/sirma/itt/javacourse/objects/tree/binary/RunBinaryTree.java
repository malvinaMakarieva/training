package com.sirma.itt.javacourse.objects.tree.binary;

import java.util.Scanner;

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

		System.out.println("Inorder");
		binaryTree.printInorder();

		System.out.print("Enter the value of the search node = ");
		Scanner userInput = new Scanner(System.in);
		int findNode = userInput.nextInt();

		boolean flag = binaryTree.searchNodeInTree(findNode);
		if (flag) {
			System.out.println("Element is located in the tree");
		} else
			System.out.println("The element is not found in tree");

		if (userInput != null) {
			userInput.close();
		}
	}

}
