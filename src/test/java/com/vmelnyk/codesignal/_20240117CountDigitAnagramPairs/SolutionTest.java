package com.vmelnyk.codesignal._20240117CountDigitAnagramPairs;

import com.vmelnyk.Util;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  @Test
  void countDigitAnagrams() {

    Solution solution = new Solution();

    assertEquals(4, solution.countDigitAnagrams(new int[] {25, 35, 872, 228, 53, 278, 872}));
    assertEquals(0, solution.countDigitAnagrams(new int[] {30, 72, 3, 227}));
    solution.countDigitAnagrams(Util.randomIntArray(100000, 9999999));
    int[] arr = new int[1000000];
    Arrays.fill(arr, 999999999+1);

    solution.countDigitAnagrams(arr);
  }
}
