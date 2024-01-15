package com.vmelnyk.leetcode._1372LongestZigZagPathInBinaryTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.vmelnyk.leetcode.TreeNode;

class SolutionTest {

  @Test
  void longestZigZag() {
    Solution solution = new Solution();

    TreeNode left;
    TreeNode right;
    TreeNode root;
    // 1st case
    right = new TreeNode(1, null, new TreeNode(1));
    left = new TreeNode(1, null, right);
    right = new TreeNode(1, left, new TreeNode(1));
    right = new TreeNode(1, new TreeNode(1), right);
    root = new TreeNode(1, null, right);

    assertEquals(3, solution.longestZigZag(root));

  }
}
