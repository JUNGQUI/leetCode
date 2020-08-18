package com.jk.leetcode.simple.anagram;

/*
두 string s, t 가 주어진다, length 는 같고 s의 anagram 이 되게 t 를 수정하기 위한 최소한의 변경 수를 return 하라

t 중 s 의 요소를 포함하는 것들은 배제하고 나머지 바꿔야 하는 것들의 값을 반환하면 된다.

이러한 류 문제들을 처음으로 사전을 만들어서 해결했다.
사전을 없이 substring 과 O(n)으로 했다고 했으나 실제 러닝 타임이 그보다 오래 걸렸다.
이전 code 는 for 문 하나로 돌렸으나 time exception 이 났고, 이후 사전 작성 후 for문 두 개로 돌렸더니 실제 for 문 자체 실행 속도가 낮아 더 우위를 점했다.
 */