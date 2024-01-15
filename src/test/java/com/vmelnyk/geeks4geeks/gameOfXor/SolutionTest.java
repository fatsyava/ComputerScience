package com.vmelnyk.geeks4geeks.gameOfXor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void example1() {
    assertEquals(2, Solution.gameOfXor(3, new int[] {1, 2, 3}));
  }

  @Test
  void example2() {
    assertEquals(0, Solution.gameOfXor(2, new int[] {1, 2}));
  }
}
