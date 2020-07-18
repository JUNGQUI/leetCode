package com.jk.leetcode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@SpringBootTest
class LeetcodeApplicationTests {

    @Test
    void contextLoads() {
        int n = 4421;

        int pd = 1, sd = 0, tempN = n;

        while (tempN != 0) {
            sd += tempN%10;
            pd *= tempN%10;
            tempN = tempN / 10;
        }

        System.out.println("J Tag");
    }
}
