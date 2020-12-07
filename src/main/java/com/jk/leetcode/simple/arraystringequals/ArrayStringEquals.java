package com.jk.leetcode.simple.arraystringequals;

public class ArrayStringEquals {
	public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
		return String.join("", word1).equals(String.join("", word2));
	}
}
