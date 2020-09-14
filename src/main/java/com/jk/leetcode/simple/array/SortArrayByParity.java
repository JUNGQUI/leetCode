package com.jk.leetcode.simple.array;

import java.util.ArrayList;
import java.util.List;

public class SortArrayByParity {
    public int[] sortArrayByParity(int[] A) {
        int[] results = new int[A.length];
        int evenIndex = 0, oddIndex = A.length-1;

        for (int j : A) {
            if (j % 2 == 0) {
                results[evenIndex] = j;
                evenIndex++;
            } else {
                results[oddIndex] = j;
                oddIndex--;
            }
        }

        return results;
    }

    public int[] jkSortArrayByParity(int[] A) {
        int[] results = new int[A.length];

        List<Integer> tempResults = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        for (int element : A) {
            if (element % 2 == 0) {
                even.add(element);
            } else {
                odd.add(element);
            }
        }

        tempResults.addAll(even);
        tempResults.addAll(odd);

        for (int i = 0; i < A.length; i++) {
            results[i] = tempResults.get(i);
        }

        return results;
    }
}
