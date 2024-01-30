package com.vmelnyk.geeks4geeks._20240128LCSOfThreeStrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  @Test
  void LCSof3() {
    Solution solution = new Solution();

    assertEquals(5, solution.LCSof3("geeks", "geeksfor", "geeksforgeeks", 5, 8, 13));

    assertEquals(3, solution.LCSof3("abcde", "adeqc", "paiqdmce", 5, 5, 8));
  }
}
