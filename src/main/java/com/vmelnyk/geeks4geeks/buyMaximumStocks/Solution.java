package com.vmelnyk.geeks4geeks.buyMaximumStocks;

import java.util.Arrays;

class Solution {
  public static int buyMaximumProducts(final int n, final int k, int[] price) {
    // code here
    long[] stocks = new long[n];
    final int codingShift = 100000;
    for (int i = 0; i < n; i++) {
      stocks[i] = (long) price[i] * codingShift + i + 1;
    }

    Arrays.sort(stocks);

    int count = 0;
    int moneyAmount = k;
    for (int i = 0; i < n; i++) {
      int dayPosition = (int) stocks[i] % codingShift;
      int dayPrice = (int) stocks[i] / codingShift;

      final int dayAmount = dayPrice * dayPosition;
      if (dayAmount <= moneyAmount) {
        count += dayPosition;
        moneyAmount = moneyAmount - dayAmount;
      } else {
        final int feasibleCount = moneyAmount / dayPrice;
        count += feasibleCount;
        moneyAmount = moneyAmount - dayPrice * feasibleCount;
      }
    }
    return count;
  }
}
