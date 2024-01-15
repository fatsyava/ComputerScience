package com.vmelnyk.geeks4geeks.buyMaximumStocks;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void example1() {
    assertEquals(4, Solution.buyMaximumProducts(3, 45, new int[] {10, 7, 19}));
  }

  @Test
  void example2() {
    assertEquals(6, Solution.buyMaximumProducts(3, 100, new int[] {7, 10, 4}));
  }
}
