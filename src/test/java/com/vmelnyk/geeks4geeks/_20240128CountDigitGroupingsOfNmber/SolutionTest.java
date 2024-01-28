package com.vmelnyk.geeks4geeks._20240128CountDigitGroupingsOfNmber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  @Test
  void totalCount() {
    Solution solution = new Solution();

    assertEquals(1, solution.TotalCount("9111"));
    assertEquals(7, solution.TotalCount("1119"));
    assertEquals(2, solution.TotalCount("12"));
    assertEquals(1, solution.TotalCount("21"));
  }
}
