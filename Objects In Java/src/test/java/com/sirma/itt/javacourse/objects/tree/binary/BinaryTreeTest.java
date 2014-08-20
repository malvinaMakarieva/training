package com.sirma.itt.javacourse.objects.tree.binary;

import org.junit.Assert;
import org.junit.Test;

/**
 * Class that test methods from class BinaryTree
 * 
 * @author Malvina Makarieva
 */
public class BinaryTreeTest {
	BinaryNode testNode;
	BinaryTree testTree = new BinaryTree();

	/**
	 * Test searchNodeInTreeTest method.
	 */
	@Test
	public void searchNodeInTreeTest() {
		testTree.insertBinaryNode(10, testTree);
		testTree.insertBinaryNode(5, testTree);
		testTree.insertBinaryNode(200, testTree);

		boolean testActualfaund = testTree.searchNodeInTree(testTree, 5);
		boolean testActualNotfound = testTree.searchNodeInTree(testTree, 30);
		Assert.assertTrue(testActualfaund);
		Assert.assertTrue(!testActualNotfound);
		Assert.assertNotSame(true, testActualNotfound);
		Assert.assertNotSame(false, testActualfaund);
	}

}
