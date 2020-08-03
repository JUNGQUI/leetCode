package com.jk.leetcode.simple.allpath;

import java.util.ArrayList;
import java.util.List;

public class AllPathsFromSourceToTarget {
    class Solution {
        public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
            List<List<Integer>> results = new ArrayList<>();

            for (int i : graph[0]) {
                List<Integer> result = new ArrayList<>();
                result.add(0);
                result.add(i);
                results.add(result);
            }

            results = calculatorResult(results, graph);

            return results;
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
    }
}
