package com.vmelnyk.leetcode._1004MaxConsecutiveOnesIII;

class Solution {
  public int longestOnes(int[] nums, int k) {
    int result = 0;

    for (int l = 0, r = 0; r < nums.length; ++r) {
      if (nums[r] == 0) {
        --k;
      }
      while (k < 0) {
        if (nums[l++] == 0) {
          ++k;
        }
      }
      result = Math.max(result, r - l + 1);
    }

    return result;
  }
}
