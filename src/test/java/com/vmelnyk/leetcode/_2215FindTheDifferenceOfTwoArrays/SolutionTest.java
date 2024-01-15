package com.vmelnyk.leetcode._2215FindTheDifferenceOfTwoArrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  @Test
  void findDifference() {
    Solution solution = new Solution();

    assertIterableEquals(
        Arrays.asList(Arrays.asList(1, 3), Arrays.asList(4, 6)),
        solution.findDifference(new int[] {1, 2, 3}, new int[] {2, 4, 6}));

    assertIterableEquals(
        Arrays.asList(List.of(3), List.of()),
        solution.findDifference(new int[] {1, 2, 3, 3}, new int[] {1, 1, 2, 2}));
  }
}
