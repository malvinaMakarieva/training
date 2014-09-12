package com.sirma.itt.javacourse.objects.tree.binary;

/**
 * Class that describes binary tree.
 * 
 * @author Malvina Makarieva
 */
public class BinaryTree {
	public BinaryNode root;

	/**
	 * Getter method for root.
	 *
	 * @return the root
	 */
	public BinaryNode getRoot() {
		return root;
	}

	/**
	 * Setter method for root.
	 *
	 * @param root
	 *            the root to set
	 */
	public void setRoot(BinaryNode root) {
		this.root = root;
	}

	/**
	 * Insert new value in the tree. If this value already exists, it is not added.
	 * 
	 * @param value
	 *            value added in the tree.
	 */
	public void insertBinaryNode(int value) {
		BinaryNode node = new BinaryNode(value);

		if (root == null) {
			root = node;
			return;
		}
		if (searchNodeInTree(value)) {
			return;
		}

		insertBinaryNodeRec(root, node);

	}

	/**
	 * Helper method to recursively insert in the tree.
	 * 
	 * @param latestRoot
	 *            node from the tree.
	 * @param newNode
	 *            value added in the tree
	 */
	private void insertBinaryNodeRec(BinaryNode latestRoot, BinaryNode newNode) {

		if (latestRoot.getNumber() > newNode.getNumber()) {

			if (latestRoot.getLeftChild() == null) {
				latestRoot.setLeftChild(newNode);
				return;
			} else {
				insertBinaryNodeRec(latestRoot.getLeftChild(), newNode);
			}
		} else {
			if (latestRoot.getRightChild() == null) {
				latestRoot.setRightChild(newNode);
				return;
			} else {
				insertBinaryNodeRec(latestRoot.getRightChild(), newNode);
			}
		}
	}

	/**
	 * Method looking whether a number is a node in the tree.
	 * 
	 * @param wantedNode
	 *            node that look.
	 * @return true for found node, and false for not found node.
	 */
	public boolean searchNodeInTree(int wantedNode) {
		BinaryNode node = root;

		while (node != null) {
			if (node.getNumber() == wantedNode) {
				return true;
			} else {
				if (node.getNumber() < wantedNode) {
					node = node.getRightChild();
				} else {
					node = node.getLeftChild();
				}
			}
		}
		return false;

	}

	/**
	 * Printing the contents of the tree in an inorder way.
	 */
	public void printInorder() {
		printInOrderRec(root);
		System.out.println("");
	}

	/**
	 * Helper method to recursively print the contents in an inorder way
	 */
	private void printInOrderRec(BinaryNode currRoot) {
		if (currRoot == null) {
			return;
		}
		printInOrderRec(currRoot.getLeftChild());
		System.out.print(currRoot.getNumber() + " ");
		printInOrderRec(currRoot.getRightChild());
	}

	/**
	 * Method checks whether a node has leaves.
	 * 
	 * @param currentNode
	 *            node to check if there leaves
	 * @return true when node have leaf.
	 */
	public boolean findLeaf(BinaryNode currentNode) {
		if (currentNode.getLeftChild() != null) {
			return true;
		}
		if (currentNode.getRightChild() != null) {
			return true;
		}
		return false;

	}
}
