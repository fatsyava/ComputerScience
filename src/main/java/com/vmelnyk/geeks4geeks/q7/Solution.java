package com.vmelnyk.geeks4geeks.q7;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

class Solution {
  // Function to find all elements in array that appear more than n/k times.
  public int countOccurence(int[] arr, int n, int k) {
    // your code here,return the answer
    int nk = n / k;
    int count = 0;
    Map<Integer, Integer> elementTimes = new HashMap<>();
    Map<Integer, Integer> moreThanNkTimes = new HashMap<>();

    for (int i = 0; i < n; i++) {
      final int element = arr[i];
      final int occurence = elementTimes.computeIfAbsent(element, v -> 0) + 1;
      if (occurence >= nk && !moreThanNkTimes.containsKey(element)) {
        moreThanNkTimes.put(element, element);
        count++;
      }

      elementTimes.put(element, occurence);
    }

    return count;
  }
}
