package com.vmelnyk.leetcode._238ProductOfArrayExceptSelf;

class Solution {
  public int[] productExceptSelf(int[] nums) {
    int[] res = new int[nums.length];
    // first iteration to make res containing temp partial production
    for (int i = 0, temp = 1; i < nums.length; i++) {
      res[i] = temp;
      temp *= nums[i];
    }
    // second iteration to make res containing complete production
    for (int i = nums.length - 1, temp = 1; i >= 0; i--) {
      res[i] *= temp;
      temp *= nums[i];
    }
    return res;
  }
}
