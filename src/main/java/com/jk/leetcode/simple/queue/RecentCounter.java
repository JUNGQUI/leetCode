package com.jk.leetcode.simple.queue;

import java.util.LinkedList;
import java.util.Queue;

public class RecentCounter {
    Queue<Integer> queue;

    public RecentCounter() {
        queue = new LinkedList<>();
    }

    public int ping (int t) {
        queue.add(t);

        while (true) {
            if (queue.peek() != null && queue.peek() + 3000 < t) {
                queue.poll();
            } else {
                break;
            }
        }

        return queue.size();
    }

//     오답 노트, 성공은 했으나 무려 0.6초 ~ 2초 나 걸림, Queue 를 사용 할 경우 최대 20ms 정도
//        List<Integer> listOfCount;
//
//        public RecentCounter() {
//            listOfCount = new ArrayList<>();
//        }
//
//        public int ping(int t) {
//            List<Integer> changed = new ArrayList<>();
//
//            for (int element : listOfCount) {
//                if (element + 3000 >= t) {
//                    changed.add(element);
//                }
//            }
//
//            changed.add(t);
//            listOfCount = changed;
//
//            return changed.size();
//        }
}
