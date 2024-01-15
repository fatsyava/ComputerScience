package com.vmelnyk.leetcode._735AsteroidCollision;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  @Test
  void asteroidCollision() {
    Solution solution = new Solution();

    assertArrayEquals(new int[] {5, 10}, solution.asteroidCollision(new int[] {5, 10, -5}));
    assertArrayEquals(new int[] {-5, -10}, solution.asteroidCollision(new int[] {-5, -10, 5}));
    assertArrayEquals(new int[] {50}, solution.asteroidCollision(new int[] {-5, -10, 50}));
    assertArrayEquals(
        new int[] {50}, solution.asteroidCollision(new int[] {-5, -10, -20, -30, -40, 50}));
    assertArrayEquals(new int[] {5}, solution.asteroidCollision(new int[] {5, 10, -10}));
    assertArrayEquals(new int[] {-50}, solution.asteroidCollision(new int[] {5, 10, -50}));
    assertArrayEquals(
        new int[] {-50}, solution.asteroidCollision(new int[] {5, 10, 20, 30, 40, -50}));
    assertArrayEquals(new int[] {-5}, solution.asteroidCollision(new int[] {-5, -10, 10}));
  }
}
