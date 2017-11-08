package com.paigeruppel.interviewpractice.hashtables;

import java.util.HashMap;
import java.util.Map;

public class Pattern {

	public boolean areFollowingPatterns(String[] strings, String[] patterns) {
		int stringsCounter = 0;
		int patternsCounter = 0;

		Map<String, Integer> stringsMap = new HashMap<>();
		Map<String, Integer> patternsMap = new HashMap<>();

		for (int i = 0; i < strings.length; i++) {
			String s = strings[i];
			String p = patterns[i];
			if (!stringsMap.containsKey(s)) {
				stringsMap.put(s, stringsCounter);
				stringsCounter++;
			}
			if (!patternsMap.containsKey(p)) {
				patternsMap.put(p, patternsCounter);
				patternsCounter++;
			}
		}

		for (int i = 0; i < strings.length; i++) {
			String s = strings[i];
			String p = patterns[i];
			if (stringsMap.get(s) != patternsMap.get(p)) {
				return false;
			}
		}

		return true;
	}

}
