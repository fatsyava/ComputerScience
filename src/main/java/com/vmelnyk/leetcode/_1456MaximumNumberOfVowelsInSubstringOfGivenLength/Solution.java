package com.vmelnyk.leetcode._1456MaximumNumberOfVowelsInSubstringOfGivenLength;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
  public int maxVowels(String s, int k) {
    final Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
    final int len = s.length();

    int maxNumberOfVowels = 0, numberOfVowels = 0, pos = 0;

    while (pos < k) {
      final char c = s.charAt(pos++);

      if (vowels.contains(c)) {
        numberOfVowels++;
      }
    }

    maxNumberOfVowels = numberOfVowels;

    while (pos < len) {
      final char c1 = s.charAt(pos);
      final char c2 = s.charAt(pos - k);

      if (vowels.contains(c1)) {
        numberOfVowels++;
      }
      if (vowels.contains(c2)) {
        numberOfVowels--;
      }

      if (maxNumberOfVowels < numberOfVowels) {
        maxNumberOfVowels = numberOfVowels;
      }

      pos++;
    }

    return maxNumberOfVowels;
  }
}
