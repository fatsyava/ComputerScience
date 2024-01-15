package com.vmelnyk.leetcode._1732FindTheHighestAltitude;

class Solution {
  public int largestAltitude(int[] gain) {

    int maxGain = 0, currentGain = 0;
    for (int g : gain) {
      currentGain += g;

      if (currentGain > maxGain) {
        maxGain = currentGain;
      }
    }

    return maxGain;
  }
}
