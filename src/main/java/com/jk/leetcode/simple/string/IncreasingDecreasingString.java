package com.jk.leetcode.simple.string;

public class IncreasingDecreasingString {
    class Solution {
        public String sortString(String s) {
            StringBuilder result = new StringBuilder();
            boolean sortingType = true;
            char charResult = (char) 96;

            while (s.length() != 0) {
                char tempChar = sorting(s, charResult, sortingType);

                if (charResult == tempChar) {
                    sortingType = !sortingType;
                    charResult = sortingType ? (char) 96 : (char) 123;
                } else {
                    result.append(tempChar);
                    s = s.replaceFirst(String.valueOf(tempChar), "");
                    charResult = tempChar;
                }
            }

            return result.toString();
        }

        private char sorting (String s, char prev, boolean sortingType) {
            char inputedchar = prev;
            prev = sortingType ? (char) 123 : (char) 96;

            for (char charS : s.toCharArray()) {
                if (sortingType) {
                    prev = inputedchar < charS && charS <= prev ? charS : prev;
                } else {
                    prev = inputedchar > charS && charS >= prev ? charS : prev;
                }
            }

            prev = prev == (char) 123 || prev == (char) 96 ? inputedchar : prev;

            return prev;
        }
    }
}
