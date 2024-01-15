package com.vmelnyk.geeks4geeks.substringsOfLengthKWithK_11DistinctElements;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void example0() {
    assertEquals(1, Solution.countOfSubstrings("abcc", 2));
  }

  @Test
  void example1() {
    assertEquals(3, Solution.countOfSubstrings("aabab", 3));
  }
}
