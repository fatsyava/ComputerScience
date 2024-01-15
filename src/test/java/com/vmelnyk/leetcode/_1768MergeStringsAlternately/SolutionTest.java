package com.vmelnyk.leetcode._1768MergeStringsAlternately;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  @Test
  void mergeAlternately() {
    Solution solution=new Solution();

    assertEquals("apbqcr", solution.mergeAlternately("abc", "pqr"));
    assertEquals("apbqcrs", solution.mergeAlternately("abc", "pqrs"));
    assertEquals("apbqcd", solution.mergeAlternately("abcd", "pq"));
  }
}
