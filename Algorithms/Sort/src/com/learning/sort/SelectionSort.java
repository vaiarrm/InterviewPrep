/**
 * 
 */
package com.learning.sort;

import com.learning.sort.util.SortUtil;

/**
 * @author vaibhavsharma
 *
 */
public class SelectionSort {
	
	private SelectionSort() {}
	
	public static <T extends Comparable<T>>  void sort(T [] arr) {
		
		for (int i = 0; i < arr.length - 1 ; i ++) {
			int min = i;
			for (int j = i+1; j < arr.length ; j++) {
				if (arr[j].compareTo(arr[min])<0) {
					min = j;
				}
			}
			SortUtil.swap(arr, min, i);
		}
	}
	
	public static void main(String ... args) {
		Integer [] arr = new Integer[] {10,9,8,7,6,5,4,3,2,1}; 
		SelectionSort.sort(arr);
		SortUtil.printArr(arr);
	}
}
