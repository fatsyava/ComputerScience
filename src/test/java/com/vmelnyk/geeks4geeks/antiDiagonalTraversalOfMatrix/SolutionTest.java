package com.vmelnyk.geeks4geeks.antiDiagonalTraversalOfMatrix;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void antiDiagonalPattern() {
    Solution solution = new Solution();
    assertArrayEquals(
        new int[] {1, 2, 5, 3, 6, 9, 4, 7, 10, 8, 11, 12},
        solution.antiDiagonalPattern(new int[][] {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}));
  }

  @Test
  void example1() {
    Solution solution = new Solution();
    assertArrayEquals(
        new int[] {1, 2, 3, 4}, solution.antiDiagonalPattern(new int[][] {{1, 2}, {3, 4}}));
    assertArrayEquals(new int[] {1, 2}, solution.antiDiagonalPattern(new int[][] {{1, 2}}));
    assertArrayEquals(new int[] {1, 2}, solution.antiDiagonalPattern(new int[][] {{1}, {2}}));
    assertArrayEquals(new int[] {1}, solution.antiDiagonalPattern(new int[][] {{1}}));
  }

  @Test
  void example2() {
    Solution solution = new Solution();
    assertArrayEquals(
        new int[] {3, 2, 4, 3, 5, 7, 1, 8, 9},
        solution.antiDiagonalPattern(
            new int[][] {
              {3, 2, 3},
              {4, 5, 1},
              {7, 8, 9},
            }));
  }
}
