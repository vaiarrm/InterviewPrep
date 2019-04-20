package com.learning.sort;

import com.learning.sort.util.SortUtil;

public class MergeSort{

	private MergeSort() {}
	
	public static <T extends Comparable<T>>  void sort(T [] arr) {
		
		if (arr == null || arr.length == 1) return;
		int start = 0;
		int end = arr.length;
	
		divide(arr, start, end );
	}
	
	private static <T extends Comparable<T>> void divide(T [] arr, int start, int end) {
		if (start >= end) return;
		int mid = start + Math.floorDiv(end - start, 2);
		divide(arr, start, mid);
		divide(arr, mid, end);
		merge(arr, start, mid, end);
	}
	
	private static <T extends Comparable<T>> void merge(T [] arr, int start, int mid, int end) {
		int i = start;
		int j = mid;
		
		T [] temp = (T [])new Object[end - start];
		int k = 0;
		while(i < mid && j < end) {
			if (arr[i].compareTo(arr[j]) <= 0) {
				temp [k++] = arr[i++];
			}else {
				temp [k++] = arr[j++];
			}
		}
		if (i == mid) {
			while (j < end) temp [k++] = arr[j++];
		}else if(j == end) {
			while(i < mid) temp [k++] = arr[i++];
		}
		
		for (i = start, k =0; i < end && k < temp.length; i++,k++ ) {
			arr[i] = temp[k];
		}
	}
	
	public static void main(String[] args) {

		Integer [] arr = new Integer[] {10,9,8,7,6,5,4,3,2,1}; 
		MergeSort.sort(arr);
		SortUtil.printArr(arr);

	}
}
