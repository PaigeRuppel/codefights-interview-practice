package com.paigeruppel.interviewpractice.strings;

public class SentenceBuilder {

	public String amendTheSentence(String s) {
		StringBuilder sb = new StringBuilder();
		String[] words = s.split("(?=[A-Z])");
		for (int i = 0; i < words.length; i++) {
			String word = words[i].toLowerCase();
			sb.append(word);
			if (i != words.length - 1) {
				sb.append(" ");
			}
		}
		return sb.toString();
	}

}
