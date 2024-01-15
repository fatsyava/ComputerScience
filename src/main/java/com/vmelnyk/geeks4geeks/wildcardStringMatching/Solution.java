package com.vmelnyk.geeks4geeks.wildcardStringMatching;

class Solution {
  static boolean match(String wild, String pattern) {
    // code here
    char[] string = pattern.toCharArray();
    char[] patternChars = wild.toCharArray();

    // create a DP lookup table
    boolean[][] lookup = new boolean[string.length + 1][patternChars.length + 1];
    return isMatch(string, patternChars, string.length - 1, patternChars.length - 1, lookup);
  }

  // Function that matches the input string with a given wildcard pattern
  private static boolean isMatch(char[] chars, char[] pattern, int n, int m, boolean[][] lookup) {
    // If both the input string and pattern reach their end, return true
    if (m < 0 && n < 0) {
      return true;
    }

    // If only the pattern reaches its end, return false
    else if (m < 0) {
      return false;
    }

    // If only the input string reaches its end, return true
    // if the remaining characters in the pattern are all '*'
    else if (n < 0) {
      for (int i = 0; i <= m; i++) {
        if (pattern[i] != '*') {
          return false;
        }
      }

      return true;
    }

    // If the sub problem is encountered for the first time
    if (!lookup[n][m]) {
      if (pattern[m] == '*') {
        // 1. '*' matches with current characters in the input string.
        // Here, we will move to the next character in the string.

        // 2. Ignore '*' and move to the next character in the pattern
        lookup[n][m] =
            isMatch(chars, pattern, n - 1, m, lookup) || isMatch(chars, pattern, n, m - 1, lookup);
      } else {
        // If the current character is not a wildcard character, it
        // should match the current character in the input string
        if (pattern[m] != '?' && pattern[m] != chars[n]) {
          lookup[n][m] = false;
        }
        // check if pattern[0…m-1] matches word[0…n-1]
        else {
          lookup[n][m] = isMatch(chars, pattern, n - 1, m - 1, lookup);
        }
      }
    }

    return lookup[n][m];
  }
}
