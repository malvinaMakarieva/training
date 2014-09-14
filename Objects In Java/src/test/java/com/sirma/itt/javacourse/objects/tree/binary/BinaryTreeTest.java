package com.sirma.itt.javacourse.objects.tree.binary;

import org.junit.Assert;
import org.junit.Test;

/**
 * Class that test methods from class BinaryTree
 * 
 * @author Malvina Makarieva
 */
public class BinaryTreeTest {
	BinaryTree testTree = new BinaryTree();

	/**
	 * Test searchNodeInTreeTest method.
	 */
	@Test
	public void searchNodeInTreeTest() {
		testTree.insertBinaryNode(10);
		testTree.insertBinaryNode(-5);
		testTree.insertBinaryNode(200);

		boolean testActualfaund = testTree.searchNodeInTree(-5);
		boolean testActualNotfound = testTree.searchNodeInTree(30);
		
		Assert.assertNotSame(true, testActualNotfound);
		Assert.assertNotSame(false, testActualfaund);
	}

	/**
	 * Method checks whether the root of the tree is estimated.
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
		testTree.insertBinaryNode(3);
		
		Object firstLeftChild =  testTree.getRoot().getLeftChild().getNumber();
		Object secondLeftChild =  testTree.getRoot().getLeftChild().getLeftChild().getNumber();

		Assert.assertEquals(5,firstLeftChild);
		Assert.assertEquals(3,secondLeftChild);
	}

	/**
	 * Check for right child.
	 */
	@Test
	public void haveRightChildCorect() {
		testTree.insertBinaryNode(10);
		testTree.insertBinaryNode(5);
		testTree.insertBinaryNode(200);
		testTree.insertBinaryNode(7);
		testTree.insertBinaryNode(300);

		
		Object firstRightChild =  testTree.getRoot().getLeftChild().getRightChild().getNumber();
		Object secondRightChild =  testTree.getRoot().getRightChild().getRightChild().getNumber();


		Assert.assertEquals(7, firstRightChild);
		Assert.assertEquals(300, secondRightChild);

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
	 * Check whether the node has a successor is leaf.
	 */
	@Test
	public void nodeThereLeaves() {
		testTree.insertBinaryNode(10);
		testTree.insertBinaryNode(5);
		testTree.insertBinaryNode(200);
		testTree.insertBinaryNode(100);
		testTree.insertBinaryNode(700);

		BinaryNode testTreeNodeOne = testTree.getRoot().getRightChild();
		BinaryNode testTreeNodeTwo = testTree.getRoot().getLeftChild();

		boolean testLeafOne = testTree.findLeaf(testTreeNodeOne);
		boolean testLeafTwo = testTree.findLeaf(testTreeNodeTwo);
		
		Assert.assertTrue(testLeafOne);
		Assert.assertFalse(testLeafTwo);

	}

	/**
	 * Test findLeaf() method form class BinaryTree.
	 */
	@Test
	public void findLeaftest() {
		testTree.insertBinaryNode(10);
		testTree.insertBinaryNode(5);
		testTree.insertBinaryNode(200);
		testTree.insertBinaryNode(100);
		testTree.insertBinaryNode(700);

		BinaryNode testTreeNodeOne = testTree.getRoot().getRightChild();
		BinaryNode testTreeNodeTwo = testTree.getRoot().getLeftChild();

		boolean testFirsNode = testTree.findLeaf(testTreeNodeOne);
		boolean testSecondNode = testTree.findLeaf(testTreeNodeTwo);

		Assert.assertEquals(true, testFirsNode);
		Assert.assertEquals(false, testSecondNode);
		
	}
}
