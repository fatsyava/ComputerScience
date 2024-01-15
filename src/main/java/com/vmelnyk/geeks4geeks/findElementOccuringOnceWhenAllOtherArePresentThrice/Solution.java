package com.vmelnyk.geeks4geeks.findElementOccuringOnceWhenAllOtherArePresentThrice;

import java.util.Arrays;

class Solution {
  static int singleElement(int[] arr, int N) {
    // code here
    int ones =
        0; // At any point of time, this variable holds XOR of all the elements which have appeared
    // "only" once.
    int twos =
        0; // At any point of time, this variable holds XOR of all the elements which have appeared
    // "only" twice.
    int not_threes;

    for (int x : arr) {
      twos |= ones & x; // add it to twos if it exists in ones
      ones ^= x; // if it exists in ones, remove it, otherwise, add it

      // Next 3 lines of code just converts the common 1's between "ones" and "twos" to zero.

      not_threes = ~(ones & twos); // if x is in ones and twos, dont add it to Threes.
      ones &= not_threes; // remove x from ones
      twos &= not_threes; // remove x from twos
    }
    return ones;
  }

  static int singleElement1(int[] arr, int N) {
    if (N == 1) {
      return arr[0];
    }

    if (N % 3 != 1) {
      return Integer.MIN_VALUE;
    }

    Arrays.sort(arr);

    for (int i = 0; i < N - 2; i += 3) {
      if (arr[i] != arr[i + 2]) {
        return arr[i];
      }
    }
    return arr[N-1];
  }
}
