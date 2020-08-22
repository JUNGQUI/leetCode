package com.jk.leetcode.simple.integerstring;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> results = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            if(selfDividingNumbersHelper(i)) {
                results.add(i);
            }
        }

        return results;
    }

    private boolean selfDividingNumbersHelper(int number) {
        int tempNumber = number;
        while (tempNumber != 0) {
            int element = tempNumber%10;
            if (element == 0 || number%element != 0) {
                return false;
            }

            tempNumber = tempNumber/10;
        }
        return true;
    }
}
