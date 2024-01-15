package com.vmelnyk.geeks4geeks.longestSubarrayWithSumDivisibleByK;

import java.util.HashMap;
import java.util.Map;

class Solution {
  int longSubarrWthSumDivByK(int arr[], int n, int k) {
    Map<Integer, Integer> mp = new HashMap<>();
    mp.put(0, -1);

    int maxLen = 0, sum = 0, remain = 0;
    for (int i = 0; i < n; i++) {
      sum += arr[i];
      remain = sum % k;

      if (remain < 0) {
        remain += k;
      }

      if (mp.containsKey(remain)) {
        final int p = mp.get(remain);
        maxLen = Math.max(maxLen, i - p);
        continue;
      }

      mp.put(remain, i);
    }

    return maxLen;
  }
}
