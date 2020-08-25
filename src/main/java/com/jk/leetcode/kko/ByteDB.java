package com.jk.leetcode.kko;

import java.util.*;

public class ByteDB {
    // 뭐 하나가 안맞았음.. 이유 파악 불가능..
    public static List<Integer> Solution(List<List<Integer>> arr) {
        Map<String, Integer> arrMap = new HashMap<>();
        List<Integer> results = new ArrayList<>();
        List<String> tempArr = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {
            String tempString = arr.get(i).toString()
                    .replaceAll(",", "")
                    .replace("{", "")
                    .replace("}", "");

            tempArr.add(tempString);
            arrMap.put(tempString, i);
        }

        tempArr.sort(Comparator.reverseOrder());

        for (String tempString : tempArr) {
            results.add(arrMap.get(tempString));
        }

        return results;
    }
}
