package com.vmelnyk.geeks4geeks.largestRectangularSubMatrixWhoseSumIs0;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void example1() {
    int[][] matrix = new int[][] {{1, 2, 3}, {-3, -2, -1}, {1, 7, 5}};
    assertEquals(6, Solution.findMaximumSubMatrixWithZeroSum(matrix, 3, 3));

    assertIterableEquals(
        Arrays.asList(List.of(1, 2, 3), List.of(-3, -2, -1)),
        Solution.sumZeroMatrix(matrix));
  }

  @Test
  void example2() {
    int[][] matrix = new int[][] {{9, 7, 16, 5}, {1, -6, -7, 3}, {1, 8, 7, 9}, {7, -2, 0, 10}};
    assertEquals(6, Solution.findMaximumSubMatrixWithZeroSum(matrix, 4, 4));

    assertIterableEquals(
        Arrays.asList(List.of(-6, -7), List.of(8, 7), List.of(-2, 0)),
        Solution.sumZeroMatrix(matrix));
  }

  @Test
  void example2_1() {
    int[][] matrix = new int[][] {{7, 10, -9}, {-8, -1, 5}, {-1, -1, -7}, {-2, -10, -2}, {0, 8, 9}};
    assertEquals(3, Solution.findMaximumSubMatrixWithZeroSum(matrix, 5, 3));

    assertIterableEquals(
        Arrays.asList(List.of(-7), List.of(-2), List.of(9)),
        Solution.sumZeroMatrix(matrix));
  }
}
