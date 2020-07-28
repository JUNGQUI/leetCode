package com.jk.leetcode.node.bst2gst;

/*
bst 가 주어지는데, 이 node 를 gst 로 바꿔라

gst : 모든 node 의 값의 합보다는 작으며 해당 root 가 모든 right (root 포함) 의 값들 보다 크거나 같은 값을 가지는 node

bst 에서 오른쪽에서부터 original node 들을 sum 을 하며 sum 을 root.val 에 넣어주면 된다.
문제를 이해하는데 오래 걸림
 */