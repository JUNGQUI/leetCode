package com.jk.leetcode.simple.arraystringequals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ArrayStringEqualsTest {

	@Test
	void arrayStringEquals() {
		String[] firstWord1 = new String[]{"ab", "c"};
		String[] firstWord2 = new String[]{"a", "bc"};

		String[] secondWord1 = new String[]{"a", "cb"};
		String[] secondWord2 = new String[]{"ab", "c"};

		String[] thirdWord1 = new String[]{"abc", "d", "defg"};
		String[] thirdWord2 = new String[]{"abcddefg"};

		Assertions.assertTrue(arrayStringEquals(firstWord1, firstWord2));
		Assertions.assertFalse(arrayStringEquals(secondWord1, secondWord2));
		Assertions.assertTrue(arrayStringEquals(thirdWord1, thirdWord2));
	}

	private boolean arrayStringEquals(String[] word1, String[] word2) {
		return String.join("", word1).equals(String.join("", word2));
	}
}