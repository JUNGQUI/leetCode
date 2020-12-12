package com.jk.leetcode.node.merge;

import com.jk.leetcode.LeetCodeNotepad.ListNode;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MergeInBetweenTest {
	@Test
	void mergeInBetweenTest() {

		ListNode listNode1 = new ListNode(
				0, new ListNode(1,
				new ListNode(2, new ListNode(3,
						new ListNode(4, new ListNode(5)))
				)
		));

		ListNode listNode2 = new ListNode(1000000, new ListNode(1000001, new ListNode(1000002)));

		ListNode listNode3 = new ListNode(
				0, new ListNode(1,
				new ListNode(2, new ListNode(1000000,
						new ListNode(1000001, new ListNode(1000002,
								new ListNode(5))
						)
				))
		));

		int a = 3, b = 4, currentIdx = 0;

		ListNode result = new ListNode(listNode1.val, listNode1.next);

		while (listNode1.next != null) {
			if (currentIdx == a) {
				result.next = new ListNode(listNode2.val, listNode2.next);
			}

			if (currentIdx == b) {
				result.next = new ListNode(listNode1.val, listNode1.next);
				break;
			}

			currentIdx++;
			listNode1 = listNode1.next;
			result = result.next != null ? result.next : null;
		}
	}
}