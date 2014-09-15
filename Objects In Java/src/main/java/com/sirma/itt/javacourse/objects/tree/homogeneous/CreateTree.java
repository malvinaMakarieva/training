package com.sirma.itt.javacourse.objects.tree.homogeneous;

import java.util.ArrayList;

/**
 * Class which builds a tree
 * 
 * @author Malvina Makarieva
 */
public class CreateTree {

	/**
	 * Method which builds the tree and displayed in the console.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		HomogeneusTree<String> tree = new HomogeneusTree<String>("Food");

		Node<String> root;
		Node<String> nodeOneLevelOne = new Node<String>("meat");
		Node<String> nodeTwoLevelOne = new Node<String>("vegetables");
		Node<String> nodeOneLevelTwo = new Node<String>("pork");
		Node<String> nodeTwoLevelTwo = new Node<String>("chiken");
		Node<String> nodeThreeLevelTwo = new Node<String>("tomato");
		Node<String> nodeFourLevelTwo = new Node<String>("potato");

		root = tree.getRoot();

		ArrayList<Node<String>> rootChildrenFirstGeneration = new ArrayList<Node<String>>();
		rootChildrenFirstGeneration.add(nodeTwoLevelOne);
		rootChildrenFirstGeneration.add(nodeOneLevelOne);

		tree.getRoot().setChildren(rootChildrenFirstGeneration);
		ArrayList<Node<String>> childrenSecondGenerationNodeOne = new ArrayList<Node<String>>();
		childrenSecondGenerationNodeOne.add(nodeThreeLevelTwo);
		childrenSecondGenerationNodeOne.add(nodeFourLevelTwo);

		rootChildrenFirstGeneration.get(0).setChildren(childrenSecondGenerationNodeOne);
		ArrayList<Node<String>> childrenSecondGenerationNodeTwo = new ArrayList<Node<String>>();
		childrenSecondGenerationNodeTwo.add(nodeOneLevelTwo);
		childrenSecondGenerationNodeTwo.add(nodeTwoLevelTwo);
		rootChildrenFirstGeneration.get(1).setChildren(childrenSecondGenerationNodeTwo);

		tree.print(root, " - ");
	}
}
