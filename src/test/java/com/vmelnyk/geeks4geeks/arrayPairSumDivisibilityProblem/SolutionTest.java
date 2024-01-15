package com.vmelnyk.geeks4geeks.arrayPairSumDivisibilityProblem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void example0() {
    Solution solution = new Solution();
    assertTrue(solution.canPair(new int[] {9, 5, 7, 3}, 6));
    assertFalse(solution.canPair(new int[] {9, 5, 7, 2}, 6));
  }

  @Test
  void example1() {
    Solution solution = new Solution();
    assertFalse(solution.canPair(new int[] {4, 4, 4}, 4));
    assertFalse(solution.canPair(new int[] {1, 2, 5, 0}, 4));
  }

  @Test
  void example2() {
    Solution solution = new Solution();
//    6 11
//    11 5 2 10 4 12

    assertFalse(solution.canPair(new int[] {11, 5, 2, 10, 4, 12}, 11));
    assertTrue(solution.canPair(new int[] {6, 14, 12, 14}, 2));
  }
}
