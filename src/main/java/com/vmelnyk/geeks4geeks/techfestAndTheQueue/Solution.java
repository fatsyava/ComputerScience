package com.vmelnyk.geeks4geeks.techfestAndTheQueue;

class Solution {
  public static long sumOfPowers(long a, long b) {
    long sum = 0;
    for (long i = a; i <= b; i++) {
      sum += sumOfPowers(i);
    }
    return sum;
  }

  static long sumOfPowers(long x) {
    long c = 0;
    while (x % 2 == 0) {
      c++;
      x /= 2;
    }
    for (long i = 3; i <= Math.sqrt(x); i += 2) {
      while (x % i == 0) {
        c++;
        x /= i;
      }
    }
    if (x > 2) {
      c++;
    }
    return c;
  }
}
