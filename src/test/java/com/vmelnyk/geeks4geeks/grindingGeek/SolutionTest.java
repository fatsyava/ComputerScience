package com.vmelnyk.geeks4geeks.grindingGeek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  @Test
  void max_courses() {
    Solution solution = new Solution();

    assertEquals(2, solution.max_courses(2, 10, new int[] {10, 9}));
    assertEquals(10, solution.max_courses(11, 10, new int[] {10, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
  }
}
