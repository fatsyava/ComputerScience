package com.vmelnyk.leetcode._151ReverseWordsInString;

class Solution {
  public String reverseWords(String s) {
    StringBuilder sb = new StringBuilder();
    int start = -1, words = 0;
    for (int pos = 0; pos < s.length(); pos++) {
      if (s.charAt(pos) == ' ') {
        if (start > -1) {
          if (words > 0) {
            sb.insert(0, " ");
          }
          sb.insert(0, s.substring(start, pos));
          words++;
          start = -1;
        }
      } else {
        if (start == -1) {
          start = pos;
        }
      }
    }

    if (start > -1) {
      if (words > 0) {
        sb.insert(0, " ");
      }
      sb.insert(0, s.substring(start));
    }

    return sb.toString();
  }
}
