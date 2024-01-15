package com.vmelnyk.geeks4geeks.removeKDigits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  @Test
  void removeKdigits() {
    Solution solution = new Solution();

//    assertEquals("111", solution.removeKdigits("149811", 3));
    assertEquals("21", solution.removeKdigits("1002991", 3));

  }
}
