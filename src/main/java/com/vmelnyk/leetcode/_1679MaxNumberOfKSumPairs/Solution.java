package com.vmelnyk.leetcode._1679MaxNumberOfKSumPairs;

import java.util.HashMap;

class Solution {

  public int maxOperations(int[] nums, int k) {
    HashMap<Integer, Integer> count = new HashMap<>();

    for (final int num : nums) {
      count.merge(num, 1, Integer::sum);
    }

    int ans = 0;
    for (final int num : count.keySet()) {
      final int complement = k - num;
      if (count.containsKey(complement)) {
        ans += Math.min(count.get(num), count.get(complement));
      }
    }

    return ans / 2;
  }
}
