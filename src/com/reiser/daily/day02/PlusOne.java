package com.reiser.daily.day02;

/**
 * @author: reiserx
 * Date:2020/9/8
 * Des:
 */
public class PlusOne {

    public static void main(String[] args) {
        PlusOne solution = new PlusOne();
        int[] nums = {9, 9, 9};
        int[] newnums = solution.plusOne(nums);
        for (int num : newnums) {
            System.out.println(num);
        }
    }

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i] = digits[i] + 1;
                break;
            }
        }
        if (digits[0] == 0) {
            digits = new int[digits.length + 1];
            digits[0] = 1;
        }
        return digits;

    }
}
