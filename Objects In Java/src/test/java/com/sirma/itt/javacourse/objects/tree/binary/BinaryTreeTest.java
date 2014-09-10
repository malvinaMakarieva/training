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
		testTree.insertBinaryNode(10);
		testTree.insertBinaryNode(5);
		testTree.insertBinaryNode(200);

		boolean testActualfaund = testTree.searchNodeInTree(5);
		boolean testActualNotfound = testTree.searchNodeInTree(30);
		Assert.assertTrue(testActualfaund);
		Assert.assertTrue(!testActualNotfound);
		Assert.assertNotSame(true, testActualNotfound);
		Assert.assertNotSame(false, testActualfaund);
	}

	/**
	 * Method checks whether the root of the tree is estimated,
	 */
	@Test
	public void haveRoot() {
		testTree.insertBinaryNode(10);
		testTree.insertBinaryNode(5);
		testTree.insertBinaryNode(200);

		Assert.assertEquals(10, testTree.getRoot().getNumber());
	}

	/**
	 * Check for left child.
	 */
	@Test
	public void haveLeftChildCorect() {
		testTree.insertBinaryNode(10);
		testTree.insertBinaryNode(5);
		testTree.insertBinaryNode(200);

		Assert.assertEquals(5, testTree.getRoot().getLeftChild().getNumber());
	}

	/**
	 * Check for right child.
	 */
	@Test
	public void haveRightChildCorect() {
		testTree.insertBinaryNode(10);
		testTree.insertBinaryNode(5);
		testTree.insertBinaryNode(200);

		Assert.assertEquals(200, testTree.getRoot().getRightChild().getNumber());

	}

	/**
	 * Check children of root.
	 */
	@Test
	public void rootThereLeaves() {
		testTree.insertBinaryNode(10);
		testTree.insertBinaryNode(5);
		testTree.insertBinaryNode(200);

		Assert.assertEquals(200, testTree.getRoot().getRightChild().getNumber());
		Assert.assertEquals(5, testTree.getRoot().getLeftChild().getNumber());

	}

	/**
	 * Check nodes of nodes.
	 */
	@Test
	public void nodeThereLeaves() {
		testTree.insertBinaryNode(10);
		testTree.insertBinaryNode(5);
		testTree.insertBinaryNode(200);
		testTree.insertBinaryNode(100);
		testTree.insertBinaryNode(700);

		Assert.assertEquals(100, testTree.getRoot().getRightChild().getLeftChild().getNumber());
		Assert.assertEquals(null, testTree.getRoot().getLeftChild().getRightChild().getNumber());

	}

}
