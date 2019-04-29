/* https://leetcode.com/problems/unique-email-addresses/
 * 
 */
package com.algo.java.easy;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/**
 * @author vaibhavsharma
 *
 */
public class UniqueEmailAddress {
	public int numUniqueEmails(String[] emails) {
		if (emails == null) return 0;
		Set <String> set = new HashSet<String>();

		for(String email: emails){
			String [] firstSplit = email.split("@");
			if (firstSplit.length != 2) continue;

			String [] secSplit = firstSplit[0].split("\\+");
			String usefulPart = secSplit[0].replace(".","");
			usefulPart = String.join("@", new String [] {usefulPart,firstSplit[1]});
			set.add(usefulPart)   ;         
		}
		return set.size();
	}
	
	public int numUniqueEmails2(String[] emails) {
		if (emails == null) return 0;
		
		Set <String> set = new HashSet<String>();
		Pattern pattern1 = Pattern.compile("@");
		Pattern pattern2 = Pattern.compile("\\+");

		for(String email: emails){
			String [] firstSplit = pattern1.split(email);
			if (firstSplit.length != 2) continue;

			String usefulPart = pattern2.split(firstSplit[0])[0].replace(".","");
			usefulPart = String.join("@", new String [] {usefulPart,firstSplit[1]});
			set.add(usefulPart)   ;         
		}
		return set.size();
	}
}