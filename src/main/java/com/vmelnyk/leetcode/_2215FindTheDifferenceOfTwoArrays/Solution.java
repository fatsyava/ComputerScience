package com.vmelnyk.leetcode._2215FindTheDifferenceOfTwoArrays;

import java.util.*;

class Solution {
  public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
    Map<Integer, Integer> set1 = new HashMap<>();
    Map<Integer, Integer> set2 = new HashMap<>();

    for (int n : nums1) {
      set1.put(n, n);
    }

    for (int n : nums2) {
      set2.put(n, n);
    }

    Set<Integer> result1 = new HashSet<>();
    for (int n : nums1) {
      if (set2.containsKey(n)) {
        continue;
      }
      result1.add(n);
    }

    Set<Integer> result2 = new HashSet<>();
    for (int n : nums2) {
      if (set1.containsKey(n)) {
        continue;
      }
      result2.add(n);
    }

    return Arrays.asList(new ArrayList<>(result1), new ArrayList<>(result2));
  }
}
