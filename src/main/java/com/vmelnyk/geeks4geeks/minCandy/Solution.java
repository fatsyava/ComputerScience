package com.vmelnyk.geeks4geeks.minCandy;

import java.util.Arrays;

class Solution {
  static int minCandy(int N, int ratings[]) {
    // code here
    if (N < 2) {
      return N;
    }

    int[] candies = new int[N];
    Arrays.fill(candies, 1);

    // ** Step 1: Forward **
    for (int i = 0; i < N - 1; i++) {
      if (ratings[i] < ratings[i + 1]) {
        candies[i + 1] = candies[i] + 1;
      }
    }

    // ** Step 2: Backward **
    for (int i = N - 1; i > 0; i--) {
      if (ratings[i] < ratings[i - 1]) {
        candies[i - 1] = Math.max(candies[i] + 1, candies[i - 1]);
      }
    }

    // ** Step 3: Count Candies **
    int count = 0;
    for (int i = 0; i < candies.length; i++) {
      count += candies[i];
    }

    return count;
  }
}
