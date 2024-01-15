package com.vmelnyk.geeks4geeks._20240115SequenceOfSequence;

class Solution {
  static int numberSequence(int m, int n) {
    // code here
    return numberSequence(0, m, n);
  }

  static int numberSequence(int prev, int m, int n) {
    if (prev > m) {
      return 0;
    }
    if (n == 0) {
      return 1;
    }
    int result = 0;
    for (int i = prev * 2; i <= m; i++) {
      if (i > 0) {
        result += numberSequence(i, m, n - 1);
      }
    }
    return result;
  }
}
