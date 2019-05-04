/*
 *https://leetcode.com/problems/flipping-an-image/ 
 */
package com.algo.java.easy;

/**
 * @author vaibhavsharma
 *
 */
public class FlippingImage {
    public int[][] flipAndInvertImage(int[][] A) {
        if (A == null) return A;
        for (int i = 0; i< A.length; i++){
            int [] B = A[i];
            for (int j = 0, k = B.length -1; j <= k; j++, k--){
                if (j == k){
                    B[j] = B[j] == 0 ? 1 : 0;    
                    continue;
                }
                int temp = B[j];
                B[j] = B[k] == 0 ? 1 : 0;
                B[k] = temp == 0 ? 1 : 0;
            }
        }
        return A;
    }
}
