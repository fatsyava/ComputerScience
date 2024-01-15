package com.vmelnyk.leetcode._104MaximumDepthOfBinaryTree;

import com.vmelnyk.leetcode.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  @Test
  void maxDepth() {
    Solution solution = new Solution();

    TreeNode left;
    TreeNode right;
    TreeNode root;
    // 1st case
    left = new TreeNode(9);
    right = new TreeNode(20, new TreeNode(15), new TreeNode(7));
    root = new TreeNode(3, left, right);

    assertEquals(3, solution.maxDepth(root));

    // 2st case
    right = new TreeNode(2);
    root = new TreeNode(1, null, right);

    assertEquals(2, solution.maxDepth(root));
  }
}
