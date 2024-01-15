package com.vmelnyk.geeks4geeks.subsetSumProblem_NewYearResolution;

import static org.junit.jupiter.api.Assertions.*;

import com.vmelnyk.Util;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void example0() {

    assertTrue(Solution.isPossible(8, new int[]{5, 8, 9, 10, 14, 2, 3, 5}));

    assertTrue(Solution.isPossible(5, new int[]{4,4,4,4,4}));
  }

  @Test
  void example1() {

    final int[] coins = {5, 8, 9, 10, 14, 2, 3, 5};

    assertTrue(Solution.isPossible(8, coins));

    Util.shuffle(coins);

    assertTrue(Solution.isPossible(8, coins));

    Util.shuffle(coins);

    assertTrue(Solution.isPossible(8, coins));
  }

  @Test
  void example2() {

    final int[] coins = {1, 2, 3, 4, 5};

    assertFalse(Solution.isPossible(5, coins));

    Util.shuffle(coins);

    assertFalse(Solution.isPossible(5, coins));

    Util.shuffle(coins);

    assertFalse(Solution.isPossible(5, coins));
  }
}
