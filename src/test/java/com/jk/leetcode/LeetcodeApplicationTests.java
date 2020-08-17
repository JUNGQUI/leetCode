package com.jk.leetcode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.StringUtils;

import java.util.*;

@SpringBootTest
class LeetcodeApplicationTests {

    @Test
    void contextLoads() {
        List<TreeNode> result = allPossibleFBT(7);

        TreeNode treeNode = new TreeNode(0, new TreeNode(0, new TreeNode(0), null), new TreeNode(0));
        TreeNode cloned = this.cloneNode(treeNode);

        System.out.println("J Tag");
    }

    public List<TreeNode> allPossibleFBT(int N) {
        TreeNode root = new TreeNode(0);

        makeFBT(root, N-1);

        return new ArrayList<>();
    }

    private List<TreeNode> makeFBT(TreeNode root, int N) {
        List<TreeNode> tempResult = new ArrayList<>();

        if (N == 0) {
            tempResult.add(root);
            return tempResult;
        }

        root.left = new TreeNode(0);
        root.right = new TreeNode(0);

        TreeNode left = cloneNode(root);
        TreeNode right = cloneNode(root);

        tempResult.add(makeFBT(left.left, N-2, true));
        tempResult.add(makeFBT(left.right, N-2, false));
        tempResult.add(makeFBT(right.left, N-2, true));
        tempResult.add(makeFBT(right.right, N-2, false));

        return tempResult;
    }

    private TreeNode makeFBT(TreeNode root, int N, boolean flag) {
        if (N == 0) {
            return root;
        }

        root.left = new TreeNode(0);
        root.right = new TreeNode(0);

        if (flag) {
            return makeFBT(root.left, N-2, flag);
        } else {
            return makeFBT(root.right, N-2, flag);
        }
    }

    private TreeNode cloneNode(TreeNode original) {
        TreeNode cloned = new TreeNode(original.val);

        if (original.left != null) {
            cloned.left = cloneNode(original.left);
        }

        if (original.right != null) {
            cloned.right = cloneNode(original.right);
        }

        return cloned;
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
