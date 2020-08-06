package com.jk.leetcode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@SpringBootTest
class LeetcodeApplicationTests {

    @Test
    void contextLoads() {
        String S = "ababcbacadefegdehijhklij";



        System.out.println("J Tag");
    }

    public List<Integer> partitionLabels(String S) {
        List<Integer> results = new ArrayList<>();

        if ("".equals(S) || S == null) {
            return null;
        }
        int lastIndex = S.lastIndexOf(S.substring(0, 1));

        for (int i = 0; i < lastIndex; i++) {
            if (S.lastIndexOf(S.substring(i, i+1)) > lastIndex) {
                lastIndex = S.lastIndexOf(S.substring(i, i+1));
            }
            results.add(i);
        }

        S = S.length() == lastIndex+1 ?
        if ()
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
