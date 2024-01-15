package com.vmelnyk.geeks4geeks.substringsOfLengthKWithK_11DistinctElements;

import java.util.HashMap;
import java.util.TreeSet;

class Solution {
  static int countOfSubstrings(String s, int k) {
    int l = 0;
    int r = 0;
    HashMap<Character, Integer> map = new HashMap<>();

    // initial map setting for window
    for (; r < k; r++) {
      map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);
    }

    int res = map.size() == k - 1 ? 1 : 0;

    // gradually incrementing window
    for (; r < s.length(); r++, l++) {
      // adding the character
      map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);

      // removing character
      if (map.get(s.charAt(l)) == 1) {
        // remove character
        // if it was the only character
        // into the window
        map.remove(s.charAt(l));
      } else {
        map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
      }

      if (map.size() == k - 1) {
        res++;
      }
    }

    return res;
  }
}
