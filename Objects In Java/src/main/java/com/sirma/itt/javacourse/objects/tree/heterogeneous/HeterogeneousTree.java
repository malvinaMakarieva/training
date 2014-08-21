package com.sirma.itt.javacourse.objects.tree.heterogeneous;

import java.util.ArrayList;

/**
 * Class describes a heterogeneous tree.
 * 
 * @author Malvina Makarieva
 */
public class HeterogeneousTree {
	private HeterogeneousNode root;

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
	 * Constructor
	 * 
	 * @param rootData
	 *            data about root data of root
	 */
	public HeterogeneousTree(Object rootData) {
		root = new HeterogeneousNode(rootData);
		root.setData(rootData);
		root.setChildren(new ArrayList<HeterogeneousNode>());
	}

	/**
	 * Print tree in console.
	 * 
	 * @param node
	 *            root of a tree.
	 * @param children
	 *            list of all cildren.
	 */
	public void printTree(HeterogeneousNode node, ArrayList<HeterogeneousNode> children) {
		if (node == null) {
			return;
		}
		System.out.print("Root --- " + node.getData() + " ");
		System.out.println();
		for (int i = 0; i < children.size(); i++) {
			System.out.println("Childrens --- " + children.get(i).getData() + " ");
		}
	}

}
