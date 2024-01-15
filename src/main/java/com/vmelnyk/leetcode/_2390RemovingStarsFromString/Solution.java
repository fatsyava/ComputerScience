package com.vmelnyk.leetcode._2390RemovingStarsFromString;

class Solution {
  public String removeStars(String s) {
    final int length = s.length();

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < length; i++) {
      if (s.charAt(i) == '*') {
        final int l = sb.length();
        sb.delete(l - 1, l);
      } else {
        sb.append(s.charAt(i));
      }
    }

    return sb.toString();
  }
}
