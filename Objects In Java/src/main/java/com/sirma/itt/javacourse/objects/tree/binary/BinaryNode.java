package com.sirma.itt.javacourse.objects.tree.binary;

/**
 * Class describes node of binary tree
 * 
 * @author Malvina Makarieva
 */
public class BinaryNode {
	private int number;
	private BinaryNode leftChild;
	private BinaryNode rightChild;

	/**
	 * Default constructor.
	 */
	public BinaryNode() {

	}

	/**
	 * Constructor of binary tree.
	 * 
	 * @param currentNumber
	 */
	public BinaryNode(int currentNumber) {
		this.number = currentNumber;
	}

	/**
	 * Getter method for number.
	 *
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * Setter method for number.
	 *
	 * @param number
	 *            the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}

	/**
	 * Getter method for leftChild.
	 *
	 * @return the leftChild
	 */
	public BinaryNode getLeftChild() {
		return leftChild;
	}

	/**
	 * Setter method for leftChild.
	 *
	 * @param leftChild
	 *            the leftChild to set
	 */
	public void setLeftChild(BinaryNode leftChild) {
		this.leftChild = leftChild;
	}

	/**
	 * Getter method for rightChild.
	 *
	 * @return the rightChild
	 */
	public BinaryNode getRightChild() {
		return rightChild;
	}

	/**
	 * Setter method for rightChild.
	 *
	 * @param rightChild
	 *            the rightChild to set
	 */
	public void setRightChild(BinaryNode rightChild) {
		this.rightChild = rightChild;
	}

}
