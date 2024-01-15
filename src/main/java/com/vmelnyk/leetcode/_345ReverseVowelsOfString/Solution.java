package com.vmelnyk.leetcode._345ReverseVowelsOfString;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
  public String reverseVowels(String s) {
    // Create a hash table for vowels.
    Set<Character> vowels =
        new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

    // Convert input string to array so that we can write into it.
    char[] result = s.toCharArray();

    int left = 0;
    int right = result.length - 1;
    while (left < right) {
      if (!vowels.contains(result[left])) {
        left++;
      } else if (!vowels.contains(result[right])) {
        right--;
      } else {
        // Both are vowels.
        char temp = result[left];
        result[left] = result[right];
        result[right] = temp;
        left++;
        right--;
      }
    }
    return new String(result);
  }
}
