package com.vmelnyk.leetcode._119PascalsTriangleII;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  @Test
  void getRow() {
    Solution solution = new Solution();

    assertIterableEquals(List.of(1), solution.getRow(0));
    assertIterableEquals(List.of(1, 1), solution.getRow(1));
    assertIterableEquals(List.of(1, 2, 1), solution.getRow(2));
    assertIterableEquals(List.of(1, 3, 3, 1), solution.getRow(3));

    //solution.getRow(24);

    for (int i = 4; i < 34; i++) {
      solution.getRow(i);
    }
  }
}
