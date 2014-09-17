package com.sirma.itt.javacourse.objects.homogeneous;

import org.junit.Assert;
import org.junit.Test;

import com.sirma.itt.javacourse.objects.tree.homogeneous.HomogeneousNode;
import com.sirma.itt.javacourse.objects.tree.homogeneous.HomogeneusTree;

public class HomogeneusTreeTest {
	HomogeneusTree<String> testStringTree = new HomogeneusTree<String>("Tree");

	/**
	 * Checks if the tree is empty or has a root.
	 */
	@Test
	public void haveRoot() {
		testStringTree.getRoot().add(new HomogeneousNode<String>("A"));
		testStringTree.getRoot().add(new HomogeneousNode<String>("B"));
		testStringTree.getRoot().add(new HomogeneousNode<String>("C"));
		testStringTree.getRoot().getChildren(0).add(new HomogeneousNode<String>("A1"));

		String actualRoot = testStringTree.getRoot().getData();
		Assert.assertNotEquals(null, actualRoot);

	}

	/**
	 * Checks if correctly added childrens.
	 */
	@Test
	public void treeHaveChildrens() {
		testStringTree.getRoot().add(new HomogeneousNode<String>("A"));
		testStringTree.getRoot().add(new HomogeneousNode<String>("B"));
		testStringTree.getRoot().add(new HomogeneousNode<String>("C"));
		testStringTree.getRoot().getChildren(0).add(new HomogeneousNode<String>("A1"));

		String firstChildren = testStringTree.getRoot().getChildren(0).getData();
		String childOfChild = testStringTree.getRoot().getChildren(0).getChildren(0).getData();
		Assert.assertSame("A", firstChildren);
		Assert.assertSame("A1", childOfChild);
	}

	/**
	 * Verify whether the addition of nodes they appear under the root.
	 */
	@Test
	public void rootThereLeaves() {
		testStringTree.getRoot().add(new HomogeneousNode<String>("A"));
		testStringTree.getRoot().add(new HomogeneousNode<String>("B"));
		testStringTree.getRoot().add(new HomogeneousNode<String>("C"));
		testStringTree.getRoot().getChildren(0).add(new HomogeneousNode<String>("A1"));

		String firstLeaf = testStringTree.getRoot().getChildren(1).getData();
		String secondLeaf = testStringTree.getRoot().getChildren(2).getData();

		Assert.assertSame("B", firstLeaf);
		Assert.assertSame("C", secondLeaf);
	}

}
