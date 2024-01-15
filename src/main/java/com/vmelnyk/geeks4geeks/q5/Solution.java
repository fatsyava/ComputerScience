package com.vmelnyk.geeks4geeks.q5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
  int countTriplet(int[] arr, int n) {
    // code here
    Set<Integer> elements = new HashSet<>();

    for (int i = 0; i < n; i++) {
      elements.add(arr[i]);
    }

    int count = 0;
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (elements.contains(arr[i] + arr[j])) {
          count++;
        }
      }
    }
    return count;
  }

  static int count_Triplets(int[] arr, int n) {
    // code here
    int maxVal = 0;
    for (int i = 0; i < n; i++) {
      maxVal = Math.max(maxVal, arr[i]);
    }
    int[] freq = new int[maxVal + 1];
    for (int i = 0; i < n; i++) {
      freq[arr[i]]++;
    }

    int count = 0;

    count += freq[0] * (freq[0] - 1) * (freq[0] - 2) / 6;

    for (int i = 1; i <= maxVal; i++) {
      count += freq[0] * freq[i] * (freq[i] - 1) / 2;
    }

    for (int i = 1; 2 * i <= maxVal; i++) {
      count += freq[i] * (freq[i] - 1) / 2 * freq[2 * i];
    }

    for (int i = 1; i <= maxVal; i++) {
      for (int j = i + 1; i + j <= maxVal; j++) {
        count += freq[i] * freq[j] * freq[i + j];
      }
    }

    return count;
  }
}
