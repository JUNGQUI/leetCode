package com.jk.leetcode.simple.order;

/*
Reveal cards in increasing order
다음과 같은 순서로 정렬을 진행할 예정이다.
1. 첫 카드를 깐다.
2. 두번째 카드가 있을 경우 두번째 카드를 마지막으로 보낸다.
3. 1번과 2번 반복

이러한 순서로 process 를 진행 할 시 오름차순이 될 수 있게 기존의 배열을 재정렬하라.

Make two arrays equal by reversing sub arrays

target[] 과 arr[] 두 배열이 주어지는데 arr[] 을 분할, 순서 역순정렬 을 이용해서 정렬하여 target과 동일하면 true, 아니면 false를 출력
몇 번안에, 혹은 정렬하여 결과를 뱉어라 가 아니기 때문에 정렬하여 같은지 확인하면 된다.

괜히 어렵게 map 으로 만들어서 있는지 확인하는 식으로 함.
 */