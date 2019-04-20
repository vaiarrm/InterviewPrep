package com.learning.sort.util;

public class SortUtil {
	
	private SortUtil() {}
	
	public static <T>  void swap(T [] arr, int i, int j ) {
		T temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static<T> void printArr(T [] arr) {
		for (T elem : arr) {
			System.out.println(elem.toString());
		}
	}
}
