package com.jk.leetcode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.StringUtils;

import java.util.*;

@SpringBootTest
class LeetcodeApplicationTests {

    @Test
    void contextLoads() {
        String s = "bab", t = "aba";

        int result = 0;
        int[] charDic = new int[26];

        for (int i = 0; i < s.length(); i++) {
            charDic[s.charAt(i) - 'a']++;
            charDic[t.charAt(i) - 'a']--;
        }

        for (int j = 0; j < charDic.length; j++) {
            result += Math.max(charDic[j], 0);
        }

        System.out.println("J Tag");
    }

    private List<Integer> searchBST(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> element = new ArrayList<>();

        element.add(root.val);
        element.addAll(searchBST(root.left));
        element.addAll(searchBST(root.right));

        return element;
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
