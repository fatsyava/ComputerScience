package com.vmelnyk.geeks4geeks.determinantOfAMatrix;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void example1() {
    final int[][] matrix = new int[][] {{1, 0, 2, -1}, {3, 0, 0, 5}, {2, 1, 4, -3}, {1, 0, 5, 0}};
    assertEquals(30, Solution.determinantOfMatrix(matrix, 4));
  }

  @Test
  void example2() {
    final int[][] matrix = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 10, 9}};
    assertEquals(12, Solution.determinantOfMatrix(matrix, 3));
  }

  @Test
  void example3() {
    final int[][] matrix = new int[][] {{1, 2}, {4, 5}};
    assertEquals(-3, Solution.determinantOfMatrix(matrix, 2));
  }
}
