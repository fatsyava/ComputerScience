package com.vmelnyk.geeks4geeks.wildcardStringMatching;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

  // https://www.techiedelight.com/wildcard-pattern-matching/
  @Test
  void techiedelight() {
    assertTrue(Solution.match("x***y", "xyxzzxy"));
    assertFalse(Solution.match("x***x", "xyxzzxy"));
    assertTrue(Solution.match("x***x?", "xyxzzxy"));
    assertTrue(Solution.match("*", "xyxzzxy"));
  }

  @Test
  void example1() {

    assertTrue(Solution.match("ge*ks", "geeks"));
    assertTrue(Solution.match("ge?ks*", "geeksforgeeks"));
  }
}
