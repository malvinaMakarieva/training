package com.sirma.itt.javacourse.objects.tree.homogeneous;

/**
 * Class which builds a tree
 * 
 * @author Malvina Makarieva
 */
public class CreateHomogeneousTree {
	/**
	 * Method which builds the tree.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		HomogeneusTree<String> tree = new HomogeneusTree<String>("tree");
		tree.getRoot().add(new HomogeneousNode<String>("A"));
		tree.getRoot().add(new HomogeneousNode<String>("B"));
		tree.getRoot().add(new HomogeneousNode<String>("C"));
		tree.getRoot().getChildren(0).add(new HomogeneousNode<String>("A1"));
	}
}
