/**
 * 
 */
package com.learning.ds.base;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

/**
 * @author vaibhavsharma
 *
 */
public class TreeNode<T extends Comparable<T>> {

	@Getter
	@NonNull
	final private T value;
	
	@Getter
	@Setter
	private TreeNode<T> left;
	
	@Getter
	@Setter
	private TreeNode<T> right;
	
	public TreeNode(T value, TreeNode<T> next, TreeNode<T> prev ) {
		this.value = value;
		this.left = next;
		this.right = prev;
	}
	
	public TreeNode(T value) {
		 this(value, null, null);
	}

}
