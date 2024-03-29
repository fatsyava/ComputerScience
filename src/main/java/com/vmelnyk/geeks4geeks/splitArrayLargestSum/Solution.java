package com.vmelnyk.geeks4geeks.splitArrayLargestSum;

class Solution {
  static int splitArray(int[] arr, int N, int K) {
    long left = 0, right = 0;
    for (int num : arr) {
      left = Math.max(left, num);
      right += num;
    }
    if (K == 1) {
      return (int) right;
    }
    while (left < right) {
      long mid = left + (right - left) / 2;
      if (validGroup(arr, mid, K)) {
        right = mid;
      } else {
        left = mid + 1;
      }
    }
    return (int) right;
  }

  static boolean validGroup(int[] nums, long target, int m) {
    int count = 1;
    long sum = 0;
    for (int num : nums) {
      sum += num;
      if (sum > target) {
        count++;
        sum = num;
        if (count > m) {
          return false;
        }
      }
    }
    return true;
  }
}
