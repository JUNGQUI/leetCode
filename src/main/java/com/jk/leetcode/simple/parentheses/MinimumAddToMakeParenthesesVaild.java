package com.jk.leetcode.simple.parentheses;

public class MinimumAddToMakeParenthesesVaild {
    class Solution {
        public int minAddToMakeValid(String S) {
            int A = 0, B = 0;

            for (int i = 0; i < S.length(); i++) {
                String s = S.substring(i, i+1);

                switch (s) {
                    case "(":
                        A++;
                        break;
                    case ")":
                        if (A > 0) {
                            A--;
                        } else {
                            B++;
                        }
                        break;
                }
            }

            return A+B;
        }
    }
}
