/*
*https://leetcode.com/problems/unique-morse-code-words/submissions/
 * 
 */
package com.algo.java.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author vaibhavsharma
 *
 */
public class UniqueMorseCodeRepresentations {
	
public int uniqueMorseRepresentations(String[] words) {
        
        if (words == null) return 0;
        
        String [] morse = new String [] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        Map<Character,String> map = new HashMap<Character, String>();
        
        for (int i = 0,  j = 97; i < morse.length; i++){
            map.put(new Character((char) j++), morse[i]);
        }
        
        Set<String> set = new HashSet<String>();
        
        for (String word: words){
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < word.length(); i++){
                sb.append(map.get(new Character(word.charAt(i))));
            }
            set.add(sb.toString());
        }
        return set.size();
    }

}
