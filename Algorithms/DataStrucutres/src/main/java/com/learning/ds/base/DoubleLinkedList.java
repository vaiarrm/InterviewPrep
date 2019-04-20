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
public class DoubleLinkedList<T extends Comparable<T>>{

	@Getter
	@NonNull
	final private T value;
	
	@Getter
	@Setter
	private DoubleLinkedList<T> next;
	
	@Getter
	@Setter
	private DoubleLinkedList<T> prev;
	
	public DoubleLinkedList(T value, DoubleLinkedList<T> next, DoubleLinkedList<T> prev ) {
		this.value = value;
		this.next = next;
		this.prev = prev;
	}
	
	public DoubleLinkedList(T value) {
		 this(value, null, null);
	}

}
