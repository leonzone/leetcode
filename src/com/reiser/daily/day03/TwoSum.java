package com.reiser.daily.day03;

import com.reiser.tools.PrintUtil;

/**
 * @author: reiserx
 * Date:2020/9/9
 * Des:暴力求解
 */
public class TwoSum {
    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int[] r = solution.twoSum(nums, 9);
        PrintUtil.out(r);
    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
