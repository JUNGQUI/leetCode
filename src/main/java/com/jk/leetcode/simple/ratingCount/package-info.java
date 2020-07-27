package com.jk.leetcode.simple.ratingCount;

/*
n명의 병사가 전선에 서있다, 각 병사는 unique한 rating 을 가지고 있다.
index i < j < k 이면서 rating[i] < rating[j] < rating[k} 이거나 rating[i] > rating[j] > rating[k] 인 조합의 개수를 찾아라.

가운데 숫자를 pivot 으로 써서 양 옆을 오름차 내림차 로 계산한다 생각하고 계산하면 된다.
 */