package com.jk.leetcode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.StringUtils;

import java.util.HashMap;

@SpringBootTest
class LeetcodeApplicationTests {

    @Test
    void contextLoads() {
        HashMap<String, String> encodedCode = new HashMap<>();

        encodedCode.put("1", "a");
        encodedCode.put("2", "b");
        encodedCode.put("3", "c");
        encodedCode.put("4", "d");
        encodedCode.put("5", "e");
        encodedCode.put("6", "f");
        encodedCode.put("7", "g");
        encodedCode.put("8", "h");
        encodedCode.put("9", "i");
        encodedCode.put("10#", "j");
        encodedCode.put("11#", "k");
        encodedCode.put("12#", "l");
        encodedCode.put("13#", "m");
        encodedCode.put("14#", "n");
        encodedCode.put("15#", "o");
        encodedCode.put("16#", "p");
        encodedCode.put("17#", "q");
        encodedCode.put("18#", "r");
        encodedCode.put("19#", "s");
        encodedCode.put("20#", "t");
        encodedCode.put("21#", "u");
        encodedCode.put("22#", "v");
        encodedCode.put("23#", "w");
        encodedCode.put("24#", "x");
        encodedCode.put("25#", "y");
        encodedCode.put("26#", "z");

        String s = "10#11#12";

        String[] subS = s.split("#");
        boolean flag = "#".equals(s.substring(s.length()-1));

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < subS.length; i++) {
            String needModify = subS[i];
            String tempS, hashS = "";

            if (i == subS.length-1 && !flag) {
                tempS = needModify;
            } else {
                tempS = needModify.substring(0, needModify.length()-2);
                hashS = needModify.substring(needModify.length()-2) + "#";
            }

            for (int j = 0; j < tempS.length(); j++) {
                result.append(encodedCode.get(tempS.substring(j, j+1)));
            }

            result.append(StringUtils.hasText(hashS) ? encodedCode.get(hashS) : "");
        }

        System.out.println("J Tag");
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
