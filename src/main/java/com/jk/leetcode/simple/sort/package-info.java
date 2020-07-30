package com.jk.leetcode.simple.sort;

/*
주어지는 배열을 matrix 로 생각하고 이후 해당 matrix 를 대각선 방향으로 한 줄마다 ascending 하게 sort 해라.
즉, 주어지는 matrix 에서 대각선으로 1줄을 하나의 array 로 생각하여 해당 값들을 sorting 한 후 반환해라.

대각선으로 접근해서 각 줄을 배열로 만들고 정렬 후 result 에 저장하는 식으로 해결
아래에서부터 위로 [1][n] 까지 접근 후 정렬
이후 [0][0~m] 까지 접근 후 정렬
 */