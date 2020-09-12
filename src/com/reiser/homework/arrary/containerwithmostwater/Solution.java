package com.reiser.homework.arrary.containerwithmostwater;

/**
 * @author: reiserx
 * Date:2020/9/8
 * Des:
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(solution.maxArea(nums));
    }

    public int maxArea(int[] height) {
        int ans = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                ans = Math.max(ans, Math.min(height[i], height[j]) * (j - i));
            }
        }

        return ans;
    }
}
