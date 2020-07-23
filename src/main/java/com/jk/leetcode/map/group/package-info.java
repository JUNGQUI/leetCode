package com.jk.leetcode.map.group;

/*
int array 가 주어지는데, 각 숫자들은 같은 숫자끼리 하나의 group 을 형성한다.
이때, 해당 group 의 최대 크기는 n 즉, 각 group 의 요소만큼만 group으로 형성되며 이를 초과할 경우 새 group 으로 작성된다.

ex) 3, 3, 3, 1, 3, 3, 3 -> 0, 1, 2 번이 1개의 group (요소가 3이므로 3개까지 허용), 이후 3번 (1) 이 하나의 group, 다시 4, 5, 6 (3) 이 하나의 group

이 때, 원본의 idx로 각 group 을 구성하여 반환하라.
 */