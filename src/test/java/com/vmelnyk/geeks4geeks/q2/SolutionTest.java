package com.vmelnyk.geeks4geeks.q2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void example() {
    final String actual = Solution.solution(new long[] {3, 6, 2, 9, -1, 10});

    assertEquals("Left", actual);
  }

  @Test
  void testCase1() {
    final String actual = Solution.solution(new long[] {1, 4, 100, 5});

    assertEquals("Right", actual);
  }

  @Test
  void equalBranches() {
    final String actual = Solution.solution(new long[] {1, 10, 5, 1, 0, 6});

    assertEquals("", actual);
  }

  @Test
  void emptyTree() {
    final String actual = Solution.solution(new long[] {});

    assertEquals("", actual);
  }

  @Test
  void onlyRootNode() {
    final String actual = Solution.solution(new long[] {1});

    assertEquals("", actual);
  }
}
