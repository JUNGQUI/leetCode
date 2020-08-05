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
        List<List<String>> paths = new ArrayList<>();
        List<String> tempPath = new ArrayList<>();
        tempPath.add("B");
        tempPath.add("C");
        paths.add(tempPath);

        tempPath = new ArrayList<>();
        tempPath.add("D");
        tempPath.add("B");
        paths.add(tempPath);

        tempPath = new ArrayList<>();
        tempPath.add("C");
        tempPath.add("A");
        paths.add(tempPath);

        HashMap<String, String> result = new HashMap<>();

        for (List<String> path : paths) {
            if (!result.containsKey(path.get(1))) {
                result.put(path.get(1), path.get(1));
            }
        }

        for (List<String> path : paths) {
            result.remove(path.get(0));
        }

//        return result.entrySet().iterator().hasNext() ? result.entrySet().iterator().next().getValue() : null;

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
