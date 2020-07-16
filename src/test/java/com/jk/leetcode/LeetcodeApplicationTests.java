package com.jk.leetcode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class LeetcodeApplicationTests {

    @Test
    void contextLoads() {

        System.out.println("J Tag");
    }
}

class SubrectangleQueries {
    int[][] localRec;

    public SubrectangleQueries(int[][] rectangle) {
        this.localRec = rectangle;
    }

    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        for (int i = row1; i <= row2; i++) {
            for (int j = col1; j <= col2; j++) {
                localRec[i][j] = newValue;
            }
        }
    }

    public int getValue(int row, int col) {
        return localRec[row][col];
    }
}
