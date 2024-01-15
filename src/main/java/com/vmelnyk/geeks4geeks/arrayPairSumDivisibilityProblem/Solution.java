package com.vmelnyk.geeks4geeks.arrayPairSumDivisibilityProblem;

import java.util.HashMap;
import java.util.Map;

class Solution {

  public boolean canPair(int[] nums, int k) {
    // Code here
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int num : nums) {

      int rem = num % k;

      map.put(rem, map.getOrDefault(rem, 0) + 1);
    }
    for (int key : map.keySet()) {
      if (key == 0) {
        if (map.get(key) % 2 != 0) {
          return false;
        }

      } else {
        if (!map.containsKey(k - key) || map.get(key) != map.get(k - key)) {
          return false;
        }
      }
    }
    return true;
  }

  public boolean my_canPair(int[] nums, int k) {
    // Code here
    int length = nums.length, counted;
    return length % 2 == 0 && ((counted = countDivisibleSumPairs(nums, k)) > 0) && counted % 2 == 0;
  }

  int countDivisibleSumPairs(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<>();
    int count = 0;

    for (int num : nums) {
      int modulo = num % k;
      int complement = modulo == 0 ? 0 : k - modulo;

      if (map.containsKey(complement)) {
        count += map.get(complement);
      }

      map.putIfAbsent(modulo, 0);
      map.computeIfPresent(modulo, (key, value) -> value + 1);
    }

    return count;
  }
}
