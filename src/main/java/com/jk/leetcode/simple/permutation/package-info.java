package com.jk.leetcode.simple.permutation;

/*
숫자 배열 queries[] 가 주어지고, int m 이 주어진다.
m 은 1 ~ m 까지의 순열 배열을 지정해주는 key 값이다.
queries 에서 1개의 값을 뽑아 순열 배열 중 해당 값의 index 를 result 에 넣고 해당 값을 index = 0 에 배치, 나머지 값을 shift 시킨다.

초반 컨셉은 hashMap에 key-value 를 값 - index 로 지정해서 index 를 변경하는 식으로 구했으나 시간 복잡도가 너무 높아 다시 변형,
이후 list 가 stack 형식이고 해당 알고리즘이 스택과 유사하여 list 로 역순으로 배치, index 를 m 을 통해 계산하게 변경했다.
 */