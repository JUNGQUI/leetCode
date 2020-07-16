package com.jk.leetcode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class LeetcodeApplicationTests {

    @Test
    void contextLoads() {
        int[] nums = new int[] {2, 5, 1, 3, 4, 7};
        int n = 3;

        int[] result = new int[nums.length];

        for (int i = 0; i < n; i++) {
            int idx = i*2;
            result[idx] = nums[i];
            result[idx + 1] = nums[i+n];
        }

        System.out.println("J Tag");
    }
}
