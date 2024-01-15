package com.vmelnyk.geeks4geeks.stringFormationFromSubstring;

class Solution {
  int isRepeat(String s) {
    // code here
    return check(s)? 1:0;
  }

  boolean check(final String str) {
    final int l = str.length();
    if (l == 1) {
      return true; // trivial case
    }

    for (int i = 1; i <= l / 2; i++) { // biggest possible repeated pattern has length/2 characters

      if (l % i != 0) {
        continue; // pattern of size i doesn't fit
      }

      String p = str.substring(0, i);

      if (isRepeating(p, str)) {
        return true;
      }
    }
    return false;
  }

  boolean isRepeating(String p, String str) {
    if (str.length() > p.length()) { // maybe more than 2 occurences

      String left = str.substring(0, p.length());
      String right = str.substring(p.length());
      return left.equals(p) && isRepeating(p, right);
    }
    return str.equals(p);
  }
}
