package com.vmelnyk.leetcode._1207UniqueNumberOfOccurrences;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
  public boolean uniqueOccurrences(int[] arr) {

    final Map<Integer, Integer> numberOccurrences = new HashMap<>();

    for (int i : arr) {
      numberOccurrences.put(i, numberOccurrences.getOrDefault(i, 0) + 1);
    }

    final Set<Integer> uniqueOccurrences = new HashSet<>(numberOccurrences.values());

    return numberOccurrences.size() == uniqueOccurrences.size();
  }
}
