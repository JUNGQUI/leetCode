package com.jk.leetcode.simple.widthpoint;

import java.util.Arrays;
import java.util.Comparator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MaxWidthOfVerticalAreaTest {

	@Test
	void maxWidthOfVerticalArea() {
		int[][] points = new int[][]{
				{3,1},
				{9,0},
				{1,0},
				{1,4},
				{5,3},
				{8,8}
		};

		Assertions.assertEquals(3, maxWidthOfVerticalArea(points));
	}

	private int maxWidthOfVerticalArea(int[][] points) {
		Arrays.sort(points, Comparator.comparingInt(a -> a[0]));

		int result = 0;

		for (int i = 0; i < points.length - 1; i++) {
			result = Math.max((points[i+1][0] - points[i][0]), result);
		}

		return result;
	}
}