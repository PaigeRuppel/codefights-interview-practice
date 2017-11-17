package com.paigeruppel.interviewpractice.strings;

public class PatternDetection {

	public int findFirstSubstringOccurence(String s, String x) {
		char[] allChars = s.toCharArray();
		int sLength = s.length();
		char[] match = x.toCharArray();
		int xLength = x.length();
		for (int i = 0; i <= sLength - xLength; i++) {
			int count = 0;
			if (allChars[i] == match[0]) {
				while (count < xLength) {
					if (allChars[i + count] == match[count] && count == xLength - 1) {
						return i;
					} else if (allChars[i + count] != match[count]) {
						break;
					}
					count++;
				}
			}
		}
		return -1;
	}

}
