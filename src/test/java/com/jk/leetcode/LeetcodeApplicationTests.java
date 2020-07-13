package com.jk.leetcode;

import org.apache.commons.lang3.time.FastDateFormat;
import org.apache.tomcat.util.codec.binary.Base64;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Calendar;

@SpringBootTest
class LeetcodeApplicationTests {

    @Test
    void contextLoads() {

        System.out.println("J Tag");

        int[] nums = new int[] {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

//        if (nums.length == 0) return;
//
//        int prev = nums[0];
//        int totRemove = 0;
//
//        boolean flag = true;
//
//        while (flag) {
//
//        }
//
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] == prev) {
//                totRemove++;
//            } else {
//                prev = nums[i];
//            }
//        }

        int prev = nums[0];
        int target = 1;

        for (int i = 1; i < nums.length; i++) {
            if (prev != nums[i]) {
                nums[target] = nums[i];
                prev = nums[i];
                target++;
            }
        }

        System.out.println("J Tag");
    }
}
