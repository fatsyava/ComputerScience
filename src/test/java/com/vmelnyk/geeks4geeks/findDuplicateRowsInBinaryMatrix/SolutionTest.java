package com.vmelnyk.geeks4geeks.findDuplicateRowsInBinaryMatrix;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  @Test
  void repeatedRows() {

    assertIterableEquals(List.of(1), Solution.repeatedRows(new int[][] {{1, 0}, {1, 0}}, 2, 2));
    assertIterableEquals(
        List.of(1, 3),
        Solution.repeatedRows(new int[][] {{1, 0, 0}, {1, 0, 0}, {0, 0, 0}, {0, 0, 0}}, 4, 3));
  }
}
