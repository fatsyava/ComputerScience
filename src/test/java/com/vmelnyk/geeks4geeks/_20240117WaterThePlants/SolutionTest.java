package com.vmelnyk.geeks4geeks._20240117WaterThePlants;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  @Test
  void min_sprinklers() {
    Solution solution = new Solution();

    assertEquals(2, solution.min_sprinklers(new int[] {-1, 2, 2, -1, 0, 0}, 6));
    assertEquals(-1, solution.min_sprinklers(new int[] {2, 3, 4, -1, 2, 0, 0, -1, 0}, 9));
    assertEquals(3, solution.min_sprinklers(new int[] {2, 3, 4, -1, 0, 0, 0, 0, 0}, 9));
  }
}
