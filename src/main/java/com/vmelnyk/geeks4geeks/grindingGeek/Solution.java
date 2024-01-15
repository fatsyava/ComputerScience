package com.vmelnyk.geeks4geeks.grindingGeek;

class Solution {
  public int max_courses(int n, int total, int[] cost) {
    // code here
    int[][] dp = new int[n + 1][total + 1];
    for (int sum = 1; sum <= total; ++sum) {
      for (int index = n - 1; index >= 0; index--) {
        int purchase = 0, notPurchase = dp[index + 1][sum];
        if (cost[index] <= sum) {
          purchase = 1 + dp[index + 1][sum - cost[index] + (cost[index] * 9) / 10];
        }
        dp[index][sum] = Math.max(purchase, notPurchase);
      }
    }
    return dp[0][total];
  }
}
