package com.learning.sort;

import com.learning.sort.util.SortUtil;

/**
 * @author vaibhavsharma
 * https://www.interviewbit.com/tutorial/insertion-sort-algorithm/
 */
public class InsertionSort{
	
	private InsertionSort() {}
	
	public static <T extends Comparable<T>>  void sort(T [] arr) {
		
		if (arr == null || arr.length ==1 ) return;
		
		for (int i = 1; i < arr.length; i++ ) {
			int curr = i;
			for (int j = i-1; j >= 0 ; j--) {
				if(arr[curr].compareTo(arr[j]) > 0) break;
				else {
					SortUtil.swap(arr, curr, j);
					curr = j;
				}
			}
		}
	}

}
