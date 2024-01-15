package com.vmelnyk.geeks4geeks.smallestWindowContaining01and2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void example0() {
    Solution solution = new Solution();
    assertEquals(3, solution.smallestSubstring("01212"));
    assertEquals(5, solution.smallestSubstring("111222000"));
    assertEquals(3, solution.smallestSubstring("0000120"));
    assertEquals(-1, solution.smallestSubstring("12122121"));
  }
}
