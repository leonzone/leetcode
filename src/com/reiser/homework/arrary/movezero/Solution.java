package com.reiser.homework.arrary.movezero;

/**
 * @author: reiserx
 * Date:2020/9/8
 * Des:
 */
public class Solution {

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        Solution solution = new Solution();
        solution.moveZeroes(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }

    //    输入: [0,1,0,3,12]
//    输出: [1,3,12,0,0]
    public void moveZeroes(int[] nums) {

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                if (i != j) {
                    nums[i] = 0;
                }
                j++;
            }
        }
    }
}
