package com.vmelnyk.geeks4geeks.q8;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
  // Function to find a continuous sub-array which adds up to a given number.
  static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
    // Your code here
    final ArrayList<Integer> indexes = new ArrayList<>();
    if (n > 1) {
      for (int i = 0; i < n - 1; i++) {
        int sum = arr[i];

        if (sum == s) {
          indexes.add(i + 1);
          indexes.add(i + 1);

          return indexes;
        } else if (sum > s) {
          continue;
        }

        for (int j = i + 1; j < n; j++) {
          sum += arr[j];
          if (sum == s) {
            indexes.add(i + 1);
            indexes.add(j + 1);

            return indexes;
          } else if (sum > s) {
            break;
          }
        }
      }
    } else if (n > 0 && arr[0] == s) {
      indexes.add(1);
      indexes.add(1);

      return indexes;
    }

    indexes.add(-1);

    return indexes;
  }

  static ArrayList<Integer> subarray(int[] arr, int n, int s) {
    final ArrayList<Integer> indexes = new ArrayList<>();
    int currentSum = arr[0], begin = 0, i;

    // Always start with the initial index of an array
    for (i = 1; i <= n; i++) {
      // If currentSum exceeds the sum,
      // then remove the starting elements
      while (currentSum > s && begin < i - 1) {
        currentSum -= arr[begin];
        begin++;
      }

      // If currentSum becomes equal to sum,
      // then return true
      if (currentSum == s) {
        indexes.add(begin + 1);
        indexes.add(i);

        return indexes;
      }

      // Add this element to currentSum
      if (i < n) {
        currentSum += arr[i];
      }
    }

    indexes.add(-1);

    return indexes;
  }
}
