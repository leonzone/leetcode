package com.reiser.homework.arrary.threesum;

import java.util.*;

/**
 * @author: reiserx
 * Date:2020/9/8
 * Des:三数求和, 暴力求解
 */
public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3) {
            return Collections.emptyList();
        }

        Set<List<Integer>> res = new HashSet<>();
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        Integer[] r = {nums[i], nums[j], nums[k]};
                        Arrays.sort(r);
                        res.add(Arrays.asList(r));
                    }
                }
            }
        }
        return new ArrayList<>(res);
    }
}
