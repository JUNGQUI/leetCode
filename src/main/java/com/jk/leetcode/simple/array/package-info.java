package com.jk.leetcode.simple.array;

/*
- array partition I
주어진 배열이 있다. 2N 의 크기이고 N 개의 pair 를 맞춰서 새로 만든다고 할 때 Min(pairA, pairB) 로 구성해서 가장 큰 값들의 합을 구하라.

정렬 후 뒤에서 부터 짝수 번째 값들의 합이 결과가 된다.

- Minimum operations to make array equal
주어지는 숫자가 있다. 이 숫자는 배열의 length 이고 arr 구성은 arr[i] = 2*i + 1 로 구성되어 있다.
한번의 operation 에 x, y 가 정해지는데, x 는 더하는 위치, y 는 빼는 위치이다.
이러한 operation 을 통해 모든 arr 를 하나의 숫자로 통일하려고 할 때 가장 적은 횟수로 연산할 때 해당 횟수를 반환하라.

어차피 홀수의 집합이고 전체를 합하여 n 만큼 나눴을 때 나오는 값이 가장 중위값이므로 중위값을 기준으로 중위값보다 작은 숫자들의 차를 구하면 된다.
x y 똑같이 더하고 빼는 연산이 동시에 1회로 취급되기 때문이다.
 */