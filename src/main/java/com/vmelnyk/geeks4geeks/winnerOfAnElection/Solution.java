package com.vmelnyk.geeks4geeks.winnerOfAnElection;

import java.util.*;

class Solution {
  // Function to return the name of candidate that received maximum votes.
  public static String[] winner(String[] arr, int n) {
    // add your code

    // add your code
    HashMap<String, Integer> hm = new HashMap<>();
    int max = 0;
    for (int i = 0; i < n; i++) {
      hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
      max = Math.max(hm.get(arr[i]), max);
    }

    String[] result = new String[2];
    for (String key : hm.keySet()) {
      if (hm.get(key) == max) {
        if (result[0] == null) result[0] = key;
        else {
          if (result[0].compareTo(key) > 0) result[0] = key;
        }
      }
    }
    result[1] = String.valueOf(max);
    return result;
  }
}
