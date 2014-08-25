package com.sirma.itt.javacourse.objects.tree.heterogeneous2;

public class HeterogeneousTree {
	public HeterogeneousNode root;

	/**
	 * Default constructor.
	 */
	public HeterogeneousTree() {

	}

	/**
	 * Constructor of Heterogeneous tree
	 * 
	 * @param currentRoot
	 *            element for the root.
	 */
	public HeterogeneousTree(HeterogeneousNode currentRoot) {
		this.root = currentRoot;
	}

	public void insertHeterogeneousNode(Object data) {
		HeterogeneousNode newNode = new HeterogeneousNode(data);
		if (root == null) {
			root = newNode;
		}
	}

	/**
	 * Print elements of the tree in this order - left successor, root, right successor.
	 * 
	 * @param node
	 */
	public void printHeterogeneousTree(HeterogeneousNode node) {
		if (node == null) {
			// System.out.println("Tree is empty");
			return;
		}
		printHeterogeneousTree(node.getLeftChild());
		System.out.print(node.getData() + " ");
		printHeterogeneousTree(node.getRightChild());
	}

}
