package com.vmelnyk.geeks4geeks.findElementOccuringOnceWhenAllOtherArePresentThrice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void example1() {

    assertEquals(10, Solution.singleElement(new int[] {1, 10, 1, 1}, 4));
    assertEquals(3, Solution.singleElement(new int[] {3, 2, 1, 34, 34, 1, 2, 34, 2, 1}, 10));
    assertEquals(
        3, Solution.singleElement(new int[] {3, 3, 3, 3, 2, 1, 34, 34, 1, 2, 34, 2, 1}, 13));
    assertEquals(
        3, Solution.singleElement(new int[] {5, 5, 5, 3, 2, 1, 34, 34, 1, 2, 34, 2, 1}, 13));
    assertEquals(
        3, Solution.singleElement(new int[] {2, 2, 2, 3, 2, 1, 34, 34, 1, 2, 34, 2, 1}, 13));
  }
}
