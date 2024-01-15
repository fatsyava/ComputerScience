package com.vmelnyk.geeks4geeks.countPossibleWaysConstructBuildings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  @Test
  void totalWays() {
    Solution solution = new Solution();

    assertEquals(4, solution.TotalWays(1));
    assertEquals(9, solution.TotalWays(2));
    assertEquals(25, solution.TotalWays(3));
    assertEquals(64, solution.TotalWays(4));
    assertEquals(169, solution.TotalWays(5));
    assertEquals(543442386, solution.TotalWays(100000));
  }
}
