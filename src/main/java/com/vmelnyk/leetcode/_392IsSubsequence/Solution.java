package com.vmelnyk.leetcode._392IsSubsequence;

class Solution {
  public boolean isSubsequence(String s, String t) {
    int sLen = s.length(), tLen = t.length();
    int si = 0, ti = 0;
    while (si < sLen && ti < tLen) {
      if (s.charAt(si) == t.charAt(ti)) {
        ++si;
      }
      ++ti;
    }
    return si == sLen;
  }
}
