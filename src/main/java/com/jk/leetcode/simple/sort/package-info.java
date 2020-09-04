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

- path in zigzag labelled binary tree
full binary tree 가 주어진다. root 가 1층인 것을 기준으로 홀수는 정배열, 짝수는 역배열 순서로 이루어져 있다면, int label 이 주어졌을 때 label 까지 가는 path 를 return 하라.

ex) label 14

                    1
            3                2
        4       5        6       7
      15 14   13 12    11 10    9  8
...

1 - 3 - 4 - 14 가 반환되어야 한다.

- maximum number of coins you can get

동전이 주어지는데, 이 동전을 3개씩으로 묶어서 가장 큰 수는 alice 가, 두번째 큰수는 당신이, 마지막 동전은 bob 에게 줄 것 이다.
당신이 가질 수 있는 가장 큰 수를 가지게 동전을 나눌 때 optimal 한 동전의 합을 return 하라.

ex)
{9,8,7,6,5,1,2,3,4}
-> 981 / 762 / 543 -> 8 + 6 + 4 = 18

오름차순 정렬 후 2번째 값만 순차로 획득하게 하면 된다. 단, idx 는 전체 length / 3 보다 크거나 같을 때만 해야 하는데, 정렬 시 가장 작은 값들은 bob 이 가져가야 하기 때문이다.
 */