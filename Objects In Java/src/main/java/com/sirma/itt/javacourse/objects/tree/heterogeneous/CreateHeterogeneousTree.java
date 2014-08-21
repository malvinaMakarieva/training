package com.sirma.itt.javacourse.objects.tree.heterogeneous;

import java.util.ArrayList;

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
		HeterogeneousTree tree = new HeterogeneousTree("tree");

		HeterogeneousNode root;
		HeterogeneousNode firstCild = new HeterogeneousNode("meat");
		HeterogeneousNode secondChild = new HeterogeneousNode(5);
		HeterogeneousNode tirthChild = new HeterogeneousNode(-854);

		root = tree.getRoot();

		ArrayList<HeterogeneousNode> rootChildrenFirstGeneration = new ArrayList<HeterogeneousNode>();
		rootChildrenFirstGeneration.add(secondChild);
		rootChildrenFirstGeneration.add(firstCild);
		rootChildrenFirstGeneration.add(tirthChild);

		tree.printTree(tree.getRoot(), rootChildrenFirstGeneration);

	}
}
