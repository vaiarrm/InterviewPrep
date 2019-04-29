/**
https://leetcode.com/problems/to-lower-case/
 */
package com.algo.java.easy;

/**
 * @author vaibhavsharma
 *
 */
public class ToLowerCase {
	public String toLowerCase(String str) {

		if (str == null) return str;
		StringBuilder sb = new StringBuilder();

		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (((int)c >= 65) && ((int) c <= 91)) {
				c = (char) ((int) c + 32); 
				sb.append(c);
			}else {
				sb.append(c);
			}
		}
		return sb.toString();
	}
	
	public static void main(String ...args) {
		ToLowerCase to = new ToLowerCase();
		System.out.println(to.toLowerCase("HELLO"));
	}

}
