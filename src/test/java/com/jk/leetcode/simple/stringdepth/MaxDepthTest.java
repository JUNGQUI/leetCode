package com.jk.leetcode.simple.stringdepth;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MaxDepthTest {
	@Test
	void maxDepth() {
		String s = "(()(()))";
		Assertions.assertEquals(3, maxDepth(s));
		s = "(asbsd(ds)fdsg(d(sdds)fsdf((())) ))";
		Assertions.assertEquals(5, maxDepth(s));
	}

	private int maxDepth(String s) {
		int result = 0, tempVal = 0;

		for (char c : s.toCharArray()) {
			tempVal += c == '(' ? 1 : c == ')' ? -1 : 0;
			result = Math.max(result, tempVal);
		}

		return result;
	}
}