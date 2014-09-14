package com.sirma.itt.javacourse.objects.tree.heterogeneous;

import com.sirma.itt.javacourse.objects.tree.binary.BinaryNode;

/**
 * Class describes a heterogeneous tree.
 * 
 * @author Malvina Makarieva
 */
public class HeterogeneousTree {
	private HeterogeneousNode root;

	/**
	 * Default constructor.
	 */
	public HeterogeneousTree() {

	}

	/**
	 * Constructor of heterogeneous tree.
	 * 
	 * @param rootData
	 *            data about root data of root
	 */
	public HeterogeneousTree(Object rootData) {
		root = new HeterogeneousNode(rootData);
	}

	/**
	 * Getter method for root.
	 *
	 * @return the root
	 */
	public HeterogeneousNode getRoot() {
		return root;
	}

	/**
	 * Setter method for root.
	 *
	 * @param root
	 *            the root to set
	 */
	public void setRoot(HeterogeneousNode root) {
		this.root = root;
	}

	/**
	 * Add node to tree.
	 * 
	 * @param value
	 *            value added to the tree.
	 */
	public void insertHeteroNode(Object value) {
		HeterogeneousNode node = new HeterogeneousNode(value);

		if (root == null) {
			root = node;
			return;
		}
		insertHeteroNodeRec(root, node, value);

	}

	/**
	 * Helper method to recursively insert in the tree.
	 * 
	 * @param latestRoot
	 *            node from the tree.
	 * @param newNode
	 *            node to added in tree.
	 * @param value
	 *            value added to the tree needed to check number or string is object.
	 */
	private void insertHeteroNodeRec(HeterogeneousNode latestRoot, HeterogeneousNode newNode,
			Object value) {

		if (isThisNumber(value)) {

			if (latestRoot.getLeftChild() == null) {
				latestRoot.setLeftChild(newNode);
				return;
			} else {
				insertHeteroNodeRec(latestRoot.getLeftChild(), newNode, value);
			}
		} else if (isThisString(value)) {
			if (latestRoot.getRightChild() == null) {
				latestRoot.setRightChild(newNode);
				return;
			} else {
				insertHeteroNodeRec(latestRoot.getRightChild(), newNode, value);
			}
		}
	}

	/**
	 * Check whether the object is a string.
	 * 
	 * @param value
	 *            object that is added to the tree.
	 * @return true if value of object is string.
	 */
	public boolean isThisString(Object value) {
		if (value instanceof String) {
			return true;
		}
		return false;
	}

	/**
	 * Check whether the object is a number.
	 * 
	 * @param value
	 *            object that is added to the tree.
	 * @return true if value of object is number
	 */
	public boolean isThisNumber(Object value) {
		if (value instanceof Number) {
			return true;
		}
		return false;
	}

	/**
	 * Printing the contents of the tree in an preorder way.
	 */
	public void printPreorder() {
		printPrerderRec(root);
		System.out.println("");
	}

	/**
	 * Helper method to recursively print the contents in an preorder way
	 */
	private void printPrerderRec(HeterogeneousNode currRoot) {
		if (currRoot == null) {
			return;
		}
		System.out.print(currRoot.getData() + " ");
		printPrerderRec(currRoot.getLeftChild());
		printPrerderRec(currRoot.getRightChild());
	}
	
	/**
	 * Method checks whether a node has leaves.
	 * 
	 * @param currentNode
	 *            node to check if there leaves
	 * @return true when node have leaf.
	 */
	public boolean findLeaf(HeterogeneousNode currentNode) {
		if (currentNode.getLeftChild() != null) {
			return true;
		}
		if (currentNode.getRightChild() != null) {
			return true;
		}
		return false;
	}

}
