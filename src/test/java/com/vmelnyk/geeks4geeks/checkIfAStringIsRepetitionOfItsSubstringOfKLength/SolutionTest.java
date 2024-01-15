package com.vmelnyk.geeks4geeks.checkIfAStringIsRepetitionOfItsSubstringOfKLength;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void example1() {
    Solution solution = new Solution();

    assertEquals(1, solution.kSubstrConcat(4, "bdac", 2));
  }

  @Test
  void example2() {
    Solution solution = new Solution();

    assertEquals(0, solution.kSubstrConcat(5, "abcde", 2));
  }
}
