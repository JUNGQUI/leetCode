package com.jk.leetcode.simple.richest;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MaximumWealthTest {

	private int[][] accounts_1;
	private int[][] accounts_2;
	private int[][] accounts_3;

	@BeforeEach
	void init() {
		accounts_1 = new int[][]{{1, 2, 3}, {3, 2, 1}};
		accounts_2 = new int[][]{{1,5},{7,3},{3,5}};
		accounts_3 = new int[][]{{2,8,7},{7,1,3},{1,9,5}};
	}

	@Test
	void maximumWealthTest() {
		Assertions.assertEquals(6, maximumWealth(accounts_1));
		Assertions.assertEquals(10, maximumWealth(accounts_2));
		Assertions.assertEquals(17, maximumWealth(accounts_3));
	}


	private int maximumWealth(int[][] accounts) {
		int result = 0;

		for (int[] account : accounts) {
			result = Math.max(result, Arrays.stream(account).sum());
		}

		return result;
	}

}