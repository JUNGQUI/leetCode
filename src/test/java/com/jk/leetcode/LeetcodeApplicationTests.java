package com.jk.leetcode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@SpringBootTest
class LeetcodeApplicationTests {

    @Test
    void contextLoads() {
        int[][] buildings = new int[][]{
                {3, 0, 8, 4},
                {2, 4, 5, 7},
                {9, 2, 6, 3},
                {0, 3, 1, 0}
        };

        int[] tb = new int[buildings.length];
        int[] lr = new int[buildings.length];
        int count = 0;

        for (int i = 0; i < buildings.length; i++) {
            for (int j = 0; j < buildings.length; j++) {
                tb[j] = Math.max(tb[j], buildings[i][j]);
                lr[i] = Math.max(lr[i], buildings[i][j]);
            }
        }

        for (int i = 0; i < buildings.length; i++) {
            for (int j = 0; j < buildings.length; j++) {
                count += Math.abs(Math.min(tb[j], lr[i]) - buildings[i][j]);
            }
        }

        System.out.println("J Tag");
    }
}
