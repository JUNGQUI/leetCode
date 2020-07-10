package com.jk.leetcode.valid;

public class ValidParentheses {
    class Solution {
        public boolean isValid(String s) {
            StringBuilder result = new StringBuilder();

            for (char sChar : s.toCharArray()) {
                if (sChar == '(' || sChar == '[' || sChar == '{') {
                    result.append(sChar);
                } else {
                    int sIdx = result.length()-1;

                    if (sIdx < 0) return false;

                    switch (sChar) {
                        case ')':
                            if (result.lastIndexOf("(") == sIdx) {
                                result.deleteCharAt(sIdx);
                            } else {
                                return false;
                            }
                            break;
                        case ']':
                            if (result.lastIndexOf("[") == sIdx) {
                                result.deleteCharAt(sIdx);
                            } else {
                                return false;
                            }
                            break;
                        case '}':
                            if (result.lastIndexOf("{") == sIdx) {
                                result.deleteCharAt(sIdx);
                            } else {
                                return false;
                            }
                            break;
                    }
                }
            }

            return "".equals(result.toString());
        }
    }
}
