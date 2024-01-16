package com.vmelnyk.leetcode._399EvaluateDivision;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  @Test
  void calcEquation() {
    Solution solution = new Solution();

    assertArrayEquals(
        new double[] {6.00000, 0.50000, -1.00000, 1.00000, -1.00000},
        solution.calcEquation(
            List.of(List.of("a", "b"), List.of("b", "c")),
            new double[] {2.0, 3.0},
            List.of(
                List.of("a", "c"),
                List.of("b", "a"),
                List.of("a", "e"),
                List.of("a", "a"),
                List.of("x", "x"))));

    assertArrayEquals(
        new double[] {3.75000, 0.40000, 5.00000, 0.20000},
        solution.calcEquation(
            List.of(List.of("a", "b"), List.of("b", "c"), List.of("bc", "cd")),
            new double[] {1.5, 2.5, 5.0},
            List.of(
                List.of("a", "c"), List.of("c", "b"), List.of("bc", "cd"), List.of("cd", "bc"))));

    assertArrayEquals(
        new double[] {0.50000, 2.00000, -1.00000, -1.00000},
        solution.calcEquation(
            List.of(List.of("a", "b")),
            new double[] {0.5},
            List.of(List.of("a", "b"), List.of("b", "a"), List.of("a", "c"), List.of("x", "y"))));
  }
}
