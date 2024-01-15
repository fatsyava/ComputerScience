package com.vmelnyk.leetcode._443StringCompression;

class Solution {
  public int compress(char[] chars) {
    StringBuilder sb = new StringBuilder();

    Character prev = null;
    int count = 0;
    for (char c : chars) {
      if (prev == null) {
        prev = c;
        count = 1;
      } else {
        if (prev != c) {
          sb.append(prev);
          if (count > 1) {
            sb.append(count);
          }
          prev = c;
          count = 1;
        } else {
          count++;
        }
      }
    }

    if (prev != null) {
      sb.append(prev);
      if (count > 1) {
        sb.append(count);
      }
    }

    final int length = sb.length();
    sb.getChars(0, length, chars, 0);
    return length;
  }
}
