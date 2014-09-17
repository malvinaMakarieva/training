package com.sirma.itt.javacourse.objects.tree.homogeneous;

/**
 * Class describes a homogeneus tree.
 * 
 * @param <T>
 *            type of data in tree.
 * @author Malvina Makarieva
 */
public class HomogeneusTree<T> {
	private HomogeneousNode<T> root;

	/**
	 * Default constructor.
	 */
	public HomogeneusTree() {

	}

	/**
	 * Constructor of the tree. Creates the root.
	 * 
	 * @param data
	 *            the data that the root will contain
	 */
	public HomogeneusTree(T data) {
		root = new HomogeneousNode<T>(data);
	}

	/**
	 * Getter method for root.
	 * 
	 * @return the root
	 */
	public HomogeneousNode<T> getRoot() {
		return root;
	}

	/**
	 * Setter method for root.
	 * 
	 * @param root
	 *            the root to set
	 */
	public void setRoot(HomogeneousNode<T> root) {
		this.root = root;
	}

}