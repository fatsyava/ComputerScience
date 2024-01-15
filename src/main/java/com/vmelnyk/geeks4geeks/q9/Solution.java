package com.vmelnyk.geeks4geeks.q9;

class Solution {

  // arr: input array
  // n: size of array
  // Function to find the sum of contiguous subarray with maximum sum.
  long maxSubarraySum(int[] arr, int n) {

    // Your code here
    long maxSoFar = arr[0], maxEndingHere = arr[0];
    for (int i = 1; i < n; i++) {
      maxEndingHere = maxEndingHere + arr[i];
      if (arr[i] > maxEndingHere) {
        maxEndingHere = arr[i];
      }
      if (maxSoFar < maxEndingHere) {
        maxSoFar = maxEndingHere;
      }
    }

    return maxSoFar;
  }
}
