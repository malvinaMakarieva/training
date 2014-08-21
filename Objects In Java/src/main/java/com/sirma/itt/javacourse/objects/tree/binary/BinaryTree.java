package com.sirma.itt.javacourse.objects.tree.binary;

/**
 * Class that describes binary tree.
 * 
 * @author Malvina Makarieva
 */
public class BinaryTree {
	public BinaryNode root;

	/**
	 * Adding numeric value in binary tree.
	 * 
	 * @param number
	 *            value of new node.
	 */
	public void insertBinaryNode(int number, BinaryTree tree) {
		BinaryNode newNode = new BinaryNode(number);
		if (root == null) {
			root = newNode;
		} else {
			if (!searchNodeInTree(tree, number)) {
				BinaryNode parent;
				BinaryNode selectNode = root;
				for (;;) {
					parent = selectNode;
					if (number < selectNode.getNumber() && number != selectNode.getNumber()) {
						selectNode = selectNode.getLeftChild();
						if (selectNode == null) {
							parent.setLeftChild(newNode);
							return;
						}
					} else if (number != selectNode.getNumber()) {
						selectNode = selectNode.getRightChild();
						if (selectNode == null) {
							parent.setRightChild(newNode);
							return;
						}
					}
				}

			}
		}

	}

	/**
	 * Method looking whether a number is a node in the tree.
	 * 
	 * @param tree
	 *            binary tree.
	 * @param wantedNode
	 *            node that.
	 * @return true for found node, and false for not found node.
	 */
	public boolean searchNodeInTree(BinaryTree tree, int wantedNode) {
		BinaryNode node = tree.root;

		while (node != null) {
			if (node.getNumber() == wantedNode) {
				System.out.println("Node " + wantedNode + " was found");
				return true;
			} else {
				if (node.getNumber() < wantedNode) {
					node = node.getRightChild();
				} else {
					node = node.getLeftChild();
				}
			}
		}
		System.out.println("Node " + wantedNode + " wasn't in a tree");
		return false;

	}

	/**
	 * Print elements of the tree in this order - left successor, root, right successor.
	 * 
	 * @param node
	 *            data on one node on binary tree
	 */
	public void print(BinaryNode node) {
		if (node == null) {
			return;
		}
		print(node.getLeftChild());
		System.out.print(node.getNumber() + " ");
		print(node.getRightChild());
	}
}
