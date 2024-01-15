package com.vmelnyk.geeks4geeks.q6;

import java.util.Arrays;

class Solution {
  public static int isPossible(int per[], int vac[], int n) {
    // your code here
    Arrays.sort(per);
    Arrays.sort(vac);

    for (int i = 0; i < n; i++) {
      if (per[i] > vac[i]) {
        return 0;
      }
    }

    return 1;
  }
}
