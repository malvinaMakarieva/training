package com.sirma.itt.javacourse.objects.tree.heterogeneous;

/**
 * Class describes a node of the tree
 * 
 * @author Malvina Makarieva
 */

public class HeterogeneousNode {
	private Object data;
	private HeterogeneousNode leftChild;
	private HeterogeneousNode rightChild;

	/**
	 * Default constructor.
	 */
	public HeterogeneousNode() {

	}

	/**
	 * Constructor of heterogeneous node.
	 * 
	 * @param data
	 *            data of element in Tree
	 */
	public HeterogeneousNode(Object data) {
		this.data = data;
	}

	/**
	 * Getter method for data.
	 *
	 * @return the data
	 */
	public Object getData() {
		return data;
	}

	/**
	 * Setter method for data.
	 *
	 * @param data
	 *            the data to set
	 */
	public void setData(Object data) {
		this.data = data;
	}

	/**
	 * Getter method for leftChild.
	 *
	 * @return the leftChild
	 */
	public HeterogeneousNode getLeftChild() {
		return leftChild;
	}

	/**
	 * Setter method for leftChild.
	 *
	 * @param leftChild
	 *            the leftChild to set
	 */
	public void setLeftChild(HeterogeneousNode leftChild) {
		this.leftChild = leftChild;
	}

	/**
	 * Getter method for rightChild.
	 *
	 * @return the rightChild
	 */
	public HeterogeneousNode getRightChild() {
		return rightChild;
	}

	/**
	 * Setter method for rightChild.
	 *
	 * @param rightChild
	 *            the rightChild to set
	 */
	public void setRightChild(HeterogeneousNode rightChild) {
		this.rightChild = rightChild;
	}
}
