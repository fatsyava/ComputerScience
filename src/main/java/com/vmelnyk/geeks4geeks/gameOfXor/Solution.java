package com.vmelnyk.geeks4geeks.gameOfXor; // User function Template for Java

class Solution {
  static int gameOfXor(int n, int[] arr) {
    // code here
    // if even array's elements number, fast result
    if (n % 2 == 0) {
      return 0;
    }
    int ans = 0;
    // if odd array's elements number, XOR odds elements only
    for (int i = 0; i < n; i += 2) {
      ans ^= arr[i];
    }
    return ans;
  }
}

