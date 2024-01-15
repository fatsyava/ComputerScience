package com.vmelnyk.geeks4geeks.countPossibleWaysConstructBuildings;

class Solution {
  static int MOD = (int) Math.pow(10, 9) + 7;

  public int TotalWays(int n) {
    // Code here
    long answer = 0, first = 1, second = 1;
    for (int i = 0; i < n; i++) {
      answer = first + second;
      first = second;
      second = answer;
      answer %= MOD;
      first %= MOD;
      second %= MOD;
    }
    answer %= MOD;
    return (int) ((answer * answer) % MOD);
  }
}
