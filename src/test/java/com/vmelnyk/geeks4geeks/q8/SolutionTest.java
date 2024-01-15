package com.vmelnyk.geeks4geeks.q8;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void example0() {
    final ArrayList<Integer> actual = Solution.subarray(new int[] {0}, 1, 0);
    assertIterableEquals(Arrays.asList(1, 1), actual);
  }

  @Test
  void example1() {
    final ArrayList<Integer> actual = Solution.subarray(new int[] {1, 2, 3, 7, 5}, 5, 12);
    assertIterableEquals(Arrays.asList(2, 4), actual);
  }

  @Test
  void example2() {
    final ArrayList<Integer> actual =
        Solution.subarray(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 10, 15);
    assertIterableEquals(Arrays.asList(1, 5), actual);
  }

  @Test
  void example12() {
    final ArrayList<Integer> actual = Solution.subarray(new int[] {1, 2}, 2, 1);
    assertIterableEquals(Arrays.asList(1, 1), actual);
  }
}
