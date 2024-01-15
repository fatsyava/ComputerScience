package com.vmelnyk.geeks4geeks.minCandy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void example0() {
    assertEquals(1, Solution.minCandy(1, new int[]{0}));

    assertEquals(3, Solution.minCandy(2, new int[]{1, 0}));

    assertEquals(2, Solution.minCandy(2, new int[]{1, 1}));
    assertEquals(3, Solution.minCandy(2, new int[]{1, 5}));
  }

  @Test
  void example1() {
    final int actual = Solution.minCandy(3, new int[]{1, 0, 2});

    assertEquals(5, actual);
  }

  @Test
  void example2() {
    final int actual = Solution.minCandy(3, new int[]{1, 2, 2});

    assertEquals(4, actual);
  }
}
