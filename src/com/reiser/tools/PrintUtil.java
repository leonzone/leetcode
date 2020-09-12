package com.reiser.tools;

/**
 * @author: reiserx
 * Date:2020/9/9
 * Des:
 */
public class PrintUtil {

    public static void out(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        for (int num : nums) {
            System.out.print(num + ",");
        }
    }
}
