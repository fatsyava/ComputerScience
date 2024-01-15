package com.vmelnyk.geeks4geeks.modifiedGameOfNim;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void example1() {
    assertEquals(2, Solution.findWinner(3, new int[] {3, 3, 2}));
  }

  @Test
  void example2() {
    assertEquals(1, Solution.findWinner(2, new int[] {3, 3}));
  }
}
