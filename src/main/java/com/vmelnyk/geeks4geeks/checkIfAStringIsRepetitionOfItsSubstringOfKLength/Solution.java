package com.vmelnyk.geeks4geeks.checkIfAStringIsRepetitionOfItsSubstringOfKLength;

import java.util.HashMap;

class Solution {
  int kSubstrConcat(int n, String s, int k) {
    // Your Code Here

    if (n % k != 0) {
      return 0;
    }

    HashMap<String, Integer> substrings = new HashMap<>();

    for (int i = 0; i < n / k; i++) {
      String sub = s.substring(k * i, k * (i + 1));
      final Integer rep = substrings.computeIfAbsent(sub, str -> 0);
      substrings.put(sub, rep + 1);
    }

    if (substrings.size() > 2) {
      return 0;
    }

    return 1;
  }
}
