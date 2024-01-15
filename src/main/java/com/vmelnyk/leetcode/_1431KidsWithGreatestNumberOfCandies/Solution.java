package com.vmelnyk.leetcode._1431KidsWithGreatestNumberOfCandies;

import java.util.ArrayList;
import java.util.List;

class Solution {
  public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    final ArrayList<Boolean> result = new ArrayList<>();

    int maxCandies = 0;
    for (int candy : candies) {
      if (candy > maxCandies) {
        maxCandies = candy;
      }
    }

    for (int candy : candies) {
      result.add(candy + extraCandies >= maxCandies);
    }

    return result;
  }
}
