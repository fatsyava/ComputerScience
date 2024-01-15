package com.vmelnyk.leetcode._151ReverseWordsInString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  @Test
  void reverseWords() {
    Solution solution = new Solution();

    assertEquals("melnyk slava", solution.reverseWords("slava melnyk"));
    assertEquals("blue is sky the", solution.reverseWords("the sky is blue"));
    assertEquals("world hello", solution.reverseWords("  hello world  "));
    assertEquals("example good a", solution.reverseWords("a good   example"));
  }
}
