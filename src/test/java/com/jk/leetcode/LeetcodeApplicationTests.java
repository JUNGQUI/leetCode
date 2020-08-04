package com.jk.leetcode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


@SpringBootTest
class LeetcodeApplicationTests {

    @Test
    void contextLoads() {
        int num = 9669;
        String sNum = String.valueOf(num);
        StringBuilder result = new StringBuilder();
        boolean flag = true;

        for (int i = 0; i < sNum.length(); i++) {
            if (sNum.startsWith("6", i) && flag) {
                result.append("9");
                flag = false;
            } else {
                result.append(sNum, i, i+1);
            }
        }

        Integer.parseInt(result.toString());

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
