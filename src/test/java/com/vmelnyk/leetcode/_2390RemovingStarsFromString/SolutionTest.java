package com.vmelnyk.leetcode._2390RemovingStarsFromString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  @Test
  void removeStars() {
    Solution solution = new Solution();

    assertEquals("lecoe", solution.removeStars("leet**cod*e"));
    assertEquals("", solution.removeStars("erase*****"));
  }
}
