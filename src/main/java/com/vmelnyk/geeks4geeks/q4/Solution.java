package com.vmelnyk.geeks4geeks.q4;

import java.util.Arrays;

class Solution {
  int missingNumber(int array[], int n) {
    // Your Code Here
    final int sum1 = ((n) * (n + 1)) / 2;
    final int len = array.length;
    int sum2 = 0;
    for (int i = 0; i < len; i++) sum2 += array[i];
    return sum1 - sum2;
  }
}
