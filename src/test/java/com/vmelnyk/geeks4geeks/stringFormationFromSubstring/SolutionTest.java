package com.vmelnyk.geeks4geeks.stringFormationFromSubstring;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void example0() {
    Solution solution = new Solution();
    assertEquals(1, solution.isRepeat("ababab"));
  }

  @Test
  void example1() {
    Solution solution = new Solution();
    assertEquals(0, solution.isRepeat("ababac"));
  }
}
