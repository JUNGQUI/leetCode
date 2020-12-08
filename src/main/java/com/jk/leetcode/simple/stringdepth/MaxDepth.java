package com.jk.leetcode.simple.stringdepth;

public class MaxDepth {
	public int maxDepth(String s) {
		int result = 0, tempVal = 0;

		for (char c : s.toCharArray()) {
			tempVal += c == '(' ? 1 : c == ')' ? -1 : 0;
			result = Math.max(result, tempVal);
		}

		return result;
	}
}
