package com.vmelnyk.leetcode._643MaximumAverageSubarrayI;

class Solution {
  public double findMaxAverage(int[] nums, int k) {

    final int n = nums.length;

    double sum = 0.0, maxSum = 0.0;
    int i = 0;

    while (i < k) {
      sum += nums[i++];
    }

    maxSum = sum;

    while (i < n) {
      sum += nums[i] - nums[i++ - k];

      if (sum > maxSum) {
        maxSum = sum;
      }
    }

    return maxSum / k;
  }
}
