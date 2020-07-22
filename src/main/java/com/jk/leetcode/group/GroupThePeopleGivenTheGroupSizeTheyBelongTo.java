package com.jk.leetcode.group;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupThePeopleGivenTheGroupSizeTheyBelongTo {
    class Solution {
        public List<List<Integer>> groupThePeople(int[] groupSizes) {
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

            return results;
        }
    }
}
