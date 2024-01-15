package com.vmelnyk.leetcode._1456MaximumNumberOfVowelsInSubstringOfGivenLength;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class SolutionTest {

  @Test
  void maxVowels() {
    Solution solution = new Solution();

    assertEquals(3, solution.maxVowels("abciiidef", 3));
    assertEquals(2, solution.maxVowels("aeiou", 2));
    assertEquals(2, solution.maxVowels("leetcode", 3));

  }
}