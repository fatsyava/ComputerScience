package com.vmelnyk.geeks4geeks.rightmostDifferentBit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void example1() {
    assertEquals(2, Solution.posOfRightMostDiffBit(11, 9));
  }

  @Test
  void example2() {
    assertEquals(5, Solution.posOfRightMostDiffBit(52, 4));
  }
}
