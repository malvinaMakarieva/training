package com.sirma.itt.javacourse.objects.tree.heterogeneous2;

public class RunHeterogeneousTree {

	public static void main(String[] args) {
		HeterogeneousTree heterogeneousTree = new HeterogeneousTree();
		heterogeneousTree.insertHeterogeneousNode("Root");
		heterogeneousTree.insertHeterogeneousNode("Left child");
		heterogeneousTree.insertHeterogeneousNode("Right child");

		heterogeneousTree.printHeterogeneousTree(heterogeneousTree.root);

	}
}
