package com.paigeruppel.interviewpractice.hashtables;

import java.util.HashMap;
import java.util.Map;

public class Pattern {

	public boolean areFollowingPatterns(String[] strings, String[] patterns) {

		Map<String, String> stringToPattern = new HashMap<>();
		
		for (int i = 0; i < strings.length; i++) {
			String s = strings[i];
			String p = patterns[i];
			stringToPattern.put(s, p); 
			stringToPattern.put(p, s);
		}
		
		for (int i = 0; i < strings.length; i++) {
			String s = strings[i];
			String p = patterns[i];
			String pat = stringToPattern.get(s);
			String str = stringToPattern.get(p);
			if (!pat.equals(p) || !str.equals(s)) {
				return false;
			}
		} 

		return true;
	}

}
