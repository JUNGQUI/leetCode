package com.jk.leetcode.simple.string;

/*

- DecryptStringFromAlphabetToIntegerMapping
1~9 : a~i
10#~26# : j~z

위와 같은 법칙일 때 주어지는 s 를 decrypting 하라


- PartitionLabels

주어지는 S 에서 같은 단어가 반복되는 최대의 단락으로 나눈것들의 길이를 List 로 반환하라.

"ababcbacadefegdehijhklij"
- ababcbaca 가 하나 : 9
- defegde 가 하나 : 7
- hijhklij 가 하나 : 8

같은 단어가 반복되어야 하므로 최소 처음 시작하는 녀석이 가장 마지막에 있어야 한다.
그 후 해당 길이까지 도달하는 와중 안에 있는 값들이 현재 last Index 보다 뒤에 있다면 lastIndex 를 늘려서 적용한다.
그렇게 하다 최대가 된다면 어쩔 수 없이 최대인 것이다.


- increasing decreasing string
주어지는 string s 를 처음에는 ascending 하게, 후에는 descending 하게 정렬하여 새로운 string 을 만들어라
ex) aaaabbbbcccc
-> abccbaabccba

정렬하는 method 를 만들어서 while 로 돌리게 하였으나, 실제로 performance 측면에서 문제가 발생 (굉장히 느림)
반면에, 전체 string 에 대해 사전을 만든 후 (a는 몇 개, b는 몇개... 모두 lower-case 임을 이용) 단어가 완성될 때 까지 사전을 돌리면서 차를 구하는 방식이 더 빨랐다.
해당 solution 은 discuss 에서 확인 가능

 */