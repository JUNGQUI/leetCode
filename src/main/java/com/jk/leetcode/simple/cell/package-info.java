package com.jk.leetcode.simple.cell;

/*
- Cell with odd values in a matrix

row 개수 n 과 col 개수 m, int[][] indices 가 주어진다.
indices[] = {row, col} 과 같이 구성되어 있는데, n X m 으로 이루어진 matrix가 0으로 init 되어 시작할 때
matrix 에서 각 row, col 에 위치한 모든 line 에 1씩 더한다.

모든 indices 에 대한 계산이 끝나고 odd 인 element 의 총 개수를 구하라.

- Matrix block sum

Matrix mat[m][n] 이 주어지고 K 가 주어진다.
결과 matrix [][] 를 구하는데 [i][j] 의 값은 [0 || i-K ~ m || i+K][0 || j-K ~ n || j+K] 의 합이다.

결과 matrix 를 구하라.

- Count square submatrices with all ones
0과 1로만 이루어진 matrix 가 주어지는데, 1로 이루어진 사각형의 개수를 구하라
[0, 1, 1]
[1, 1, 1]
[0, 1, 0]

변이 1인 사각형 - 6
변이 2인 사각형 - 1
총 7개

누적 개수를 대각선 부분에 맞춰 나가서 최종적으로 전체 개수를 구하는 방향으로 구해야 O(mn) 이 나온다.
그 외의 경우에는 대각선 방향이나 맨 아래, 맨 오른쪽 변에 대해서도 구해야 하기 때문에 복잡도가 늘어난다.

 */