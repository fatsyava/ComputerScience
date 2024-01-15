package com.vmelnyk.geeks4geeks.subsetSumProblem_NewYearResolution;

class Solution {
  public static boolean isPossible(int N, int[] coins) {
    // code here
    final boolean[][] dp = getDynProgTable(N, coins, 2024);

    for (int sum = 1; sum < 2025; sum++) {
      if ((sum % 20 == 0 || sum % 24 == 0 || sum % 2024 == 0) && dp[N][sum]) {
        return true;
      }
    }

    return false;
  }

  private static boolean[][] getDynProgTable(int N, int[] arr, int sum) {
    boolean[][] dp = new boolean[N + 1][sum + 1];

    for (int i = 0; i < dp.length; i++) {
      for (int j = 0; j < dp[0].length; j++) {
        if (i == 0 && j == 0) {
          dp[i][j] = true;
        } else if (i == 0) {
          dp[i][j] = false;
        } else if (j == 0) {
          dp[i][j] = true;
        } else {
          if (dp[i - 1][j]) {
            dp[i][j] = true;
          } else if (arr[i - 1] <= j) {
            dp[i][j] = dp[i - 1][j - arr[i - 1]];
          }
        }
      }
    }
    return dp;
  }
}
