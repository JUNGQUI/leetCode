package com.jk.leetcode.node.sumListNode;

import com.jk.leetcode.node.ListNode;

import java.util.ArrayList;
import java.util.List;

public class ConvertBinaryNumberInALinkedListToInteger {
    class Solution {
        public int getDecimalValue(ListNode head) {
            int length = -1;

            List<Integer> results = new ArrayList<>();
            int result = 0;

            while(head != null) {
                length++;
                results.add(head.val);
                head = head.next;
            }

            for (Integer temp : results) {
                result += temp*Math.pow(2, length);
                length--;
            }

            return result;
        }
    }
}
