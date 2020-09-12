package com.reiser.homework.arrary.threesum;

import java.util.*;

/**
 * @author: reiserx
 * Date:2020/9/8
 * Des:三数求和, Hash
 */
public class Solution3 {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3) {
            return Collections.emptyList();
        }

        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum > 0) {
                    while (j < k && nums[k] == nums[--k]) ;
                } else if (sum < 0) {
                    while (j < k && nums[j] == nums[++j]) ;
                } else {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while (j < k && nums[k] == nums[--k]) ;
                    while (j < k && nums[j] == nums[++j]) ;
                }
            }

        }
        return new ArrayList<>(res);
    }
}
