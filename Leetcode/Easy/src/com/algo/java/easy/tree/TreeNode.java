/**
 * 
 */
package com.algo.java.easy.tree;

import java.util.*;

/**
 * @author vaibhavsharma
 *
 */
public class TreeNode {

	/**
	 * @param args
	 */

	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }

	public static TreeNode fromArray(int [] arr) {
		if (arr == null) return null;
		TreeNode root = null;

		for (int i =0; i< arr.length; i++) {
			root = createTree(root,arr[i]);
		}

		return root;
	}

	private static TreeNode createTree(TreeNode node, int val) {
		if (node == null) {
			return new TreeNode(val);
		}else if (val <= node.val){
			node.left = createTree(node.left, val);
			return node;
		}else {
			node.right = createTree(node.right, val);
			return node;
		}
	}

	public static void main(String[] args) {
		int [] tree = new int [] {10,5,15,3,7,18};
		TreeNode root = fromArray(tree);
		
		List<Integer> preOrderlist = TreeNodeTraversalUtil.preOrderTraversal(root);
		TreeNodeTraversalUtil.printList(preOrderlist);
		
		List<Integer> postOrderlist = TreeNodeTraversalUtil.postOrderTraversal(root);
		TreeNodeTraversalUtil.printList(postOrderlist);
		
		List<Integer> inOrderlist = TreeNodeTraversalUtil.postOrderTraversal(root);
		TreeNodeTraversalUtil.printList(inOrderlist);
	}

}
