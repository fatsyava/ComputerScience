package com.vmelnyk.leetcode._1493longestSubarrayOf1sAfterDeletingOneElement;

class Solution {
  public int longestSubarray(int[] nums) {
    int result = 0, zeroesCount = 0;

    for (int l = 0, r = 0; r < nums.length; r++) {
      if (nums[r] == 0) {
        ++zeroesCount;
      }
      while (zeroesCount == 2) {
        if (nums[l++] == 0) {
          --zeroesCount;
        }
      }
      result = Math.max(result, r - l);
    }

    return result;
  }
}
