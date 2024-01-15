package com.vmelnyk.leetcode._443StringCompression;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  @Test
  void compress() {
    Solution solution = new Solution();

    char[] actual;

    actual = new char[] {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
    assertEquals(6, solution.compress(actual));
    assertArrayEquals(6, new char[] {'a', '2', 'b', '2', 'c', '3'}, actual);

    actual = new char[] {'a'};
    assertEquals(1, solution.compress(actual));
    assertArrayEquals(1, new char[] {'a'}, actual);

    actual = new char[] {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
    assertEquals(4, solution.compress(actual));
    assertArrayEquals(4, new char[] {'a', 'b', '1', '2'}, actual);
  }

  void assertArrayEquals(int numberOfCharsToCheck, char[] expected, char[] actual) {
    char[] actualized = new char[numberOfCharsToCheck];
    System.arraycopy(actual, 0, actualized, 0, numberOfCharsToCheck);
    Assertions.assertArrayEquals(expected, actualized);
  }
}
