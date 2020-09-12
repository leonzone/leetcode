package com.reiser.homework.arrary.containerwithmostwater;

/**
 * @author: reiserx
 * Date:2020/9/8
 * Des:
 */
public class Solution2 {
    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        int[] nums = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(solution.maxArea(nums));
    }

    public int maxArea(int[] height) {

        int l = 0;
        int r = height.length - 1;
        int ans = 0;

        while (l < r) {
            int area = Math.min(height[r], height[l]) * (r - l);
            ans = Math.max(area, ans);
            if (height[l] <= height[r]) {
                l++;
            } else {
                r--;
            }
        }

        return ans;
    }
}
