package com.vmelnyk.leetcode._334IncreasingTripletSubsequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  @Test
  void increasingTriplet() {
    Solution solution = new Solution();

    assertTrue(solution.increasingTriplet(new int[] {1, 2, 3, 4, 5}));
    assertTrue(solution.increasingTriplet(new int[] {2, 1, 5, 0, 4, 6}));

    assertFalse(solution.increasingTriplet(new int[] {5, 4, 3, 2, 1}));
    assertFalse(solution.increasingTriplet(new int[] {5, 4}));
    assertFalse(solution.increasingTriplet(null));
  }
}
