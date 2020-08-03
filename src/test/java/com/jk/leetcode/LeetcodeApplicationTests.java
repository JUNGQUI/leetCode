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
        int[] arr = {3,0,1,1,9,7};
        int a = 7, b = 2, c = 3;

        int result = 0;

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                for (int k = i+1; k < arr.length; k++) {
                    if (Math.abs(arr[j] - arr[i]) <= a &&
                            Math.abs(arr[i] - arr[k]) <= b &&
                            Math.abs(arr[j] - arr[k]) <= c) {
                        result++;
                    }
                }
            }
        }

//        int[][] graph = new int[][] {
//                {4,3,1},
//                {3,2,4},
//                {3},
//                {4},
//                {}
//        };
//
//        List<List<Integer>> results = new ArrayList<>();
//
//        for (int g : graph[0]) {
//            List<Integer> partialPath = new ArrayList<>();
//            partialPath.add(0);
//            partialPath.add(g);
//
//            results.add(partialPath);
//        }
//
//        results = recursivePathStep1(results, graph);

        System.out.println("J Tag");
    }

    private List<List<Integer>> recursivePathStep1 (List<List<Integer>> prevPath, int[][] totalGraph) {
        List<List<Integer>> finalResult = new ArrayList<>();
        for (List<Integer> tempPath : prevPath) {
            tempPath = recursivePathStep2(tempPath, totalGraph);
            finalResult.add(tempPath);
        }

        return finalResult;
    }

    private List<Integer> recursivePathStep2 (List<Integer> prevPath, int[][] totalGraph) {
        int idx = prevPath.get(prevPath.size()-1);

        if (idx == totalGraph.length-1) {
            return prevPath;
        }

        for (int tempG : totalGraph[idx]) {
            List<Integer> tempPath = new ArrayList<>(prevPath);
            tempPath.add(tempG);
            prevPath = recursivePathStep2(tempPath, totalGraph);
        }

        return prevPath;
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
