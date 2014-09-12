package com.sirma.itt.javacourse.objects.tree.heterogeneous;

/**
 * Class which builds a tree
 * 
 * @author Malvina Makarieva
 */
public class CreateHeterogeneousTree {

	/**
	 * Method which builds the tree.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		HeterogeneousTree tree = new HeterogeneousTree();
		tree.insertHeteroNode("tree");
		tree.insertHeteroNode("meet");
		tree.insertHeteroNode(8);
		tree.insertHeteroNode(-568);
		tree.insertHeteroNode(0.22545);
		tree.insertHeteroNode("smart");

		System.out.println("Print in Preorder");
		tree.printPreorder();
	}
}
