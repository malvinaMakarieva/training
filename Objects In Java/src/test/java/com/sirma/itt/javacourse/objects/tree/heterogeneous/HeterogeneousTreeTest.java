package com.sirma.itt.javacourse.objects.tree.heterogeneous;

import org.junit.Assert;
import org.junit.Test;

/**
 * Class contains tests for heterogeneous tree.
 * 
 * @author Malvina Makarieva
 */
public class HeterogeneousTreeTest {
	HeterogeneousTree testTree = new HeterogeneousTree();

	/**
	 * Check whether the return values of method isThisString() are expected.
	 */
	@Test
	public void isThisStringTest() {
		boolean testString = testTree.isThisString("5ter");
		boolean testNotString = testTree.isThisString('r');
		boolean testEmptyString = testTree.isThisString("");

		Assert.assertEquals(true, testString);
		Assert.assertEquals(false, testNotString);
		Assert.assertEquals(true, testEmptyString);

	}

	/**
	 * Check whether the return values of method isThisNumber() are expected.
	 */
	@Test
	public void isThisNumberTest() {
		boolean testNumberFloat = testTree.isThisNumber(98.23);
		boolean testNumberInteger = testTree.isThisNumber(85);
		boolean testNumberNegativInteger = testTree.isThisNumber(-5);
		boolean testNotNumber = testTree.isThisNumber("ret");

		Assert.assertEquals(true, testNumberFloat);
		Assert.assertEquals(true, testNumberInteger);
		Assert.assertEquals(true, testNumberNegativInteger);
		Assert.assertEquals(false, testNotNumber);
	}

	/**
	 * Checks if the tree is empty or has a root.
	 */
	@Test
	public void haveRoot() {
		testTree.insertHeteroNode("first");
		testTree.insertHeteroNode("Second");
		testTree.insertHeteroNode(9);

		Object testNodehaveNode = testTree.getRoot().getData();

		Assert.assertEquals("first", testNodehaveNode);

	}

	/**
	 * Checks if correctly added left child of tree.
	 */
	@Test
	public void haveLeftChildCorect() {
		testTree.insertHeteroNode("first");
		testTree.insertHeteroNode(9);
		testTree.insertHeteroNode("Second");
		testTree.insertHeteroNode(-98.25);

		Object firstLeftChild = testTree.getRoot().getLeftChild().getData();
		Object secodnLeftChild = testTree.getRoot().getLeftChild().getLeftChild().getData();

		Assert.assertEquals(9, firstLeftChild);
		Assert.assertEquals(-98.25, secodnLeftChild);
	}

	/**
	 * Checks if correctly added right child of tree.
	 */
	@Test
	public void haveRightChildCorect() {
		testTree.insertHeteroNode("first");
		testTree.insertHeteroNode(9);
		testTree.insertHeteroNode("Second");
		testTree.insertHeteroNode("left child");

		Object firstRightChild = testTree.getRoot().getRightChild().getData();
		Object secodnRightChild = testTree.getRoot().getRightChild().getRightChild().getData();

		Assert.assertEquals("Second", firstRightChild);
		Assert.assertEquals("left child", secodnRightChild);
	}

	/**
	 * Verify whether the addition of nodes they appear under the root.
	 */
	@Test
	public void rootThereLeaves() {
		testTree.insertHeteroNode("first");
		testTree.insertHeteroNode(9);
		testTree.insertHeteroNode("Second");
		testTree.insertHeteroNode("last");

		Object firstLeaf = testTree.getRoot().getLeftChild().getData();
		Object secondLeaf = testTree.getRoot().getRightChild().getData();

		Assert.assertSame(9, firstLeaf);
		Assert.assertSame("Second", secondLeaf);
	}

	/**
	 * Check whether the node has a successor Is leaf
	 */
	@Test
	public void nodeThereLeaves() {
		testTree.insertHeteroNode("first");
		testTree.insertHeteroNode("Second");
		testTree.insertHeteroNode(9);
		testTree.insertHeteroNode(43);
		testTree.insertHeteroNode(-0.22);

		HeterogeneousNode testTreeNodeOne = testTree.getRoot().getRightChild();
		HeterogeneousNode testTreeNodeTwo = testTree.getRoot().getLeftChild();

		boolean testLeafOne = testTree.findLeaf(testTreeNodeOne);
		boolean testLeafTwo = testTree.findLeaf(testTreeNodeTwo);
		Assert.assertFalse(testLeafOne);
		Assert.assertTrue(testLeafTwo);
	}

}
