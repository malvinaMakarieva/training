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
	 * Adding numeric value in binary tree.
	 * 
	 * @param number
	 *            value of new node.
	 */
	public void insertBinaryNode(int number) {
		BinaryNode newNode = new BinaryNode(number);
		if (root == null) {
			root = newNode;
		} else {
			if (!searchNodeInTree(number)) {
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
	public boolean searchNodeInTree(int wantedNode) {
		BinaryNode node = root;

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
	 *            data on one node on tree
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
