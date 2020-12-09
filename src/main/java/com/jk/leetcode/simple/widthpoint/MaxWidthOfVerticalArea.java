package com.jk.leetcode.simple.widthpoint;

import java.util.Arrays;
import java.util.Comparator;

public class MaxWidthOfVerticalArea {
	public int maxWidthOfVerticalArea(int[][] points) {
		Arrays.sort(points, Comparator.comparingInt(a -> a[0]));

		int result = 0;

		for (int i = 0; i < points.length - 1; i++) {
			result = Math.max((points[i+1][0] - points[i][0]), result);
		}

		return result;
	}
}
