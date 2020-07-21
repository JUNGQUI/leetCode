package com.jk.leetcode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;


@SpringBootTest
class LeetcodeApplicationTests {

    @Test
    void contextLoads() {
        int[] groupSizes = new int[] {2, 1, 3, 3, 3, 2};

        List<List<Integer>> results = new ArrayList<>();

        List<Integer> contains = new ArrayList<>();

        for (int i : groupSizes) {
            if (!contains.contains(i)) {
                contains.add(i);
            }
        }

        System.out.println("J Tag");
    }
}
