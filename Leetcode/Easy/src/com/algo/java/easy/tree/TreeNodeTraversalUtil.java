/**
 * 
 */
package com.algo.java.easy.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author vaibhavsharma
 *
 */
public class TreeNodeTraversalUtil {
	
	public static List<Integer> preOrderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();
		list = preOrderTraversal(root, list);
		return list;
	}
	
	private static List<Integer> preOrderTraversal(TreeNode node, List<Integer> list){
		if (node == null) {
			return list;
		}
		list.add(node.val);
		list = preOrderTraversal(node.left, list);
		list = preOrderTraversal(node.right, list);
		return list;
	}

	public static List<Integer> postOrderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();
		list = postOrderTraversal(root, list);
		return list;

	}
	
	private static List<Integer> postOrderTraversal(TreeNode node, List<Integer> list) {
		if (node == null) {
			return list;
		}
		
		list = postOrderTraversal(node.left, list);
		list = postOrderTraversal(node.right, list);
		list.add(node.val);
		
		return list;
	}
	
	
	public static List<Integer> inOrderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();
		list = inOrderTraversal(root, list);
		return list;
	}
	
	public static List<Integer> inOrderTraversal(TreeNode node, List<Integer> list) {
		if (node == null) {
			return list;
		}
		
		list = inOrderTraversal(node.left, list);
		list.add(node.val);
		list = inOrderTraversal(node.right, list);
		
		return list;
	}
	
	public static void printList(List<Integer> list) {
		for (Integer elem: list) {
			if (elem == null) continue;
			System.out.print(elem + " 	");
		}
		System.out.println();
	}


}
