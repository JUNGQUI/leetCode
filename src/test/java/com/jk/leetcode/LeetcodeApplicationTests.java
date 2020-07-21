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
//        int[] groupSizes = new int[] {2, 1, 3, 3, 3, 2};
        int[] groupSizes = new int[] {3, 3, 3, 3, 1, 3, 3};

        List<List<Integer>> results = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < groupSizes.length; i++) {
            if (map.containsKey(groupSizes[i])) {
                List<Integer> temp = map.get(groupSizes[i]);

                if (temp.size() == groupSizes[i]) {
                    results.add(temp);
                    temp = new ArrayList<>();
                }

                temp.add(i);
                map.put(groupSizes[i], temp);
            } else {
                List<Integer> temp = new ArrayList<>();
                temp.add(i);
                map.put(groupSizes[i], temp);
            }
        }

        for (int i : map.keySet()) {
            results.add(map.get(i));
        }

        System.out.println("J Tag");
    }
}
