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

 */