package com.vmelnyk.geeks4geeks.modifiedGameOfNim;

import java.util.ArrayList;
import java.util.List;

class Solution {
  static int findWinner(int n, int A[]) {
    // code here
    if (n % 2 == 0) return 1;
    int gameSum = 0;
    for (int x : A) {
      gameSum = gameSum ^ x;
    }
    if (gameSum == 0) return 1;
    return 2;
  }
}
