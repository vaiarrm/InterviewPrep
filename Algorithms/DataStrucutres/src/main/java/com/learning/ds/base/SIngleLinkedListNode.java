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
public class SIngleLinkedListNode<T extends Comparable<T>> {

	@Getter
	@NonNull
	final private T value;
	
	@Getter
	@Setter
	private SIngleLinkedListNode<T> next;
	
	public SIngleLinkedListNode(T value, SIngleLinkedListNode<T> next ) {
		this.value = value;
		this.next = next;
	}
	
	public SIngleLinkedListNode(T value ) {
		 this(value, null);
	}
	
	

}
