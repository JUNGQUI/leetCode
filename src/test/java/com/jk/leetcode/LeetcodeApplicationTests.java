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
        int[][] graph = new int[][] {
//                {4,3,1},
//                {3,2,4},
//                {3},
//                {4},
//                {}
                {2},
                {},
                {1}
        };

        List<List<Integer>> results = new ArrayList<>();

        for (int i : graph[0]) {
            List<Integer> result = new ArrayList<>();
            result.add(0);
            result.add(i);
            results.add(result);
        }

        results = calculatorResult(results, graph);

        System.out.println("J Tag");
    }

    private List<List<Integer>> calculatorResult(List<List<Integer>> temp, int[][] graph) {
        List<List<Integer>> beforeResults = new ArrayList<>();
        List<List<Integer>> results = new ArrayList<>();

        for (List<Integer> tempPath : temp) {
            beforeResults.addAll(calculatorPath(tempPath, graph));
        }

        for (List<Integer> beforePaths : beforeResults) {
            if (beforePaths.get(beforePaths.size()-1) == graph.length-1) {
                results.add(beforePaths);
            }
        }

        return results;
    }

    private List<List<Integer>> calculatorPath(List<Integer> partitionsPath, int[][] graph) {
        int lastIndex = partitionsPath.get(partitionsPath.size()-1);
        List<List<Integer>> semiResults = new ArrayList<>();

        if (graph[lastIndex].length == 0 || lastIndex == graph.length-1) {
            semiResults.add(partitionsPath);
            return semiResults;
        }

        for (int g : graph[lastIndex]) {
            List<Integer> temp = new ArrayList<>(partitionsPath);
            temp.add(g);
            semiResults.addAll(calculatorPath(temp, graph));
        }

        return semiResults;
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
