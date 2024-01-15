package com.vmelnyk.leetcode._605CanPlaceFlowers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  @Test
  void example1() {
    Solution solution = new Solution();

    assertTrue(solution.canPlaceFlowers(new int[]{1,0,0,0,1}, 1));
    assertTrue(solution.canPlaceFlowers(new int[]{1,0,0,0,1,0}, 1));
    assertFalse(solution.canPlaceFlowers(new int[]{1,0,0,0,1}, 2));
    assertFalse(solution.canPlaceFlowers(new int[]{1,0,0,0,1,0}, 2));

    assertTrue(solution.canPlaceFlowers(new int[]{0,0,1,0,1}, 1));
    assertTrue(solution.canPlaceFlowers(new int[]{0,0,1,0,0}, 2));
    assertFalse(solution.canPlaceFlowers(new int[]{0,0,1,0,0}, 3));

    assertTrue(solution.canPlaceFlowers(new int[]{0,0,0,1,0}, 1));
    assertTrue(solution.canPlaceFlowers(new int[]{0,1,0,0,0}, 1));
    assertFalse(solution.canPlaceFlowers(new int[]{0,0,0,1,0}, 2));
    assertFalse(solution.canPlaceFlowers(new int[]{0,1,0,0,0}, 2));

    assertFalse(solution.canPlaceFlowers(new int[]{0,1,0,1,0,1,0,0}, 2));

    assertTrue(solution.canPlaceFlowers(new int[]{0,0,0,0,0}, 1));
    assertTrue(solution.canPlaceFlowers(new int[]{0,0,0,0,0}, 2));
    assertTrue(solution.canPlaceFlowers(new int[]{0,0,0,0,0}, 3));

    assertTrue(solution.canPlaceFlowers(new int[]{0,0,0,0,0,0}, 1));
    assertTrue(solution.canPlaceFlowers(new int[]{0,0,0,0,0,0}, 2));
    assertTrue(solution.canPlaceFlowers(new int[]{0,0,0,0,0,0}, 3));
  }
}
