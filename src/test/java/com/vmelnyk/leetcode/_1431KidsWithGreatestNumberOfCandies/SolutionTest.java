package com.vmelnyk.leetcode._1431KidsWithGreatestNumberOfCandies;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  @Test
  void kidsWithCandies() {
    Solution solution = new Solution();

    assertIterableEquals(
        Arrays.asList(true, true, true, false, true),
        solution.kidsWithCandies(new int[] {2, 3, 5, 1, 3}, 3));

    assertIterableEquals(
        Arrays.asList(true, false, false, false, false),
        solution.kidsWithCandies(new int[] {4, 2, 1, 1, 2}, 1));

    assertIterableEquals(
        Arrays.asList(true, false, true), solution.kidsWithCandies(new int[] {12, 1, 12}, 10));
  }
}
