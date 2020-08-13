package com.jk.leetcode.simple.sort;

/*

- Sort the matrix diagonally

주어지는 배열을 matrix 로 생각하고 이후 해당 matrix 를 대각선 방향으로 한 줄마다 ascending 하게 sort 해라.
즉, 주어지는 matrix 에서 대각선으로 1줄을 하나의 array 로 생각하여 해당 값들을 sorting 한 후 반환해라.

대각선으로 접근해서 각 줄을 배열로 만들고 정렬 후 result 에 저장하는 식으로 해결
아래에서부터 위로 [1][n] 까지 접근 후 정렬
이후 [0][0~m] 까지 접근 후 정렬

- replace elements with greatest element on right side

int[] arr 이 주어지는데, 0부터 시작해서 해당 위치에서 오른쪽 element 중 가장 큰 수로 모두 replace 하라.
원래 풀었던 방법은 이중 for 문으로 순차 max 값을 가져오는 방식이였는데,
discuss 중 영리한 방법이 있어 추가했다.

오른쪽 중 가장 큰 값이라 함은, 뒤에서부터 시작 시 본인 혹은, 지금까지 가져갔었던 값 중 가장 큰 값을 그곳에 넣어주면 된다.
어차피 마지막 값이 -1 로 되어 있기 때문에 뒤에서 시작 시 첫 idx (맨 마지막 idx) 에 -1을 밀어 넣고 그 다음엔 본 배열에서 해당 자리와 계승된 max 값 중 비교 후 값을 채워 넣으면 된다.

ex) 17, 18, 4, 5, 6, 1, 1 일 경우,
-1과 비교 후 -1을 넣고 max 는 -1
1과 1을 비교 후 1을 넣고 max 는 1
1과 1을 비교 후 1을 넣고 max 는 1
6과 1을 비교 후 6을 넣고 max 는 6
5와 6을 비교 후 6을 넣고 max 는 6
18과 6을 비교 후 18을 넣고 max는 18

18 6 6 1 1 -1 이와 같은 형태가 된다.

 */