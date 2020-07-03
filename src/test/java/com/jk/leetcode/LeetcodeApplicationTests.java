package com.jk.leetcode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class LeetcodeApplicationTests {

    @Test
    void contextLoads() {
        String s = "MCMXCIV";
        char[] roman = s.toCharArray();
        int result = 0;
        int index = roman.length-1;

        while (index >= 0) {

            switch (roman[index]) {
                case 'I':
                    result += 1;
                    index--;
                    break;
                case 'V':
                    if (index >= 1 && roman[index-1] == 'I') {
                        result += 4;
                        index--;
                    } else {
                        result += 5;
                    }

                    index--;
                    break;
                case 'X':
                    if (index >= 1 && roman[index-1] == 'I') {
                        result += 9;
                        index--;
                    } else {
                        result += 10;
                    }

                    index--;
                    break;
                case 'L':
                    if (index >= 1 && roman[index-1] == 'X') {
                        result += 40;
                        index--;
                    } else {
                        result += 50;
                    }

                    index--;
                    break;
                case 'C':
                    if (index >= 1 && roman[index-1] == 'X') {
                        result += 90;
                        index--;
                    } else {
                        result += 100;
                    }

                    index--;
                    break;
                case 'D':
                    if (index >= 1 && roman[index-1] == 'C') {
                        result += 400;
                        index--;
                    } else {
                        result += 500;
                    }

                    index--;
                    break;
                case 'M':
                    if (index >= 1 && roman[index-1] == 'C') {
                        result += 900;
                        index--;
                    } else {
                        result += 1000;
                    }

                    index--;
                    break;
            }
        }

        System.out.println("J Tag");
    }
}
