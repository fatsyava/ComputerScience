package com.vmelnyk.leetcode._1448CountGoodNodesInBinaryTree;

import com.vmelnyk.leetcode.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  @Test
  void goodNodes() {
    Solution solution = new Solution();

    TreeNode left;
    TreeNode right;
    TreeNode root;
    // 1st case
    left = new TreeNode(1, new TreeNode(3), null);
    right = new TreeNode(4, new TreeNode(1), new TreeNode(5));
    root = new TreeNode(3, left, right);

    assertEquals(4, solution.goodNodes(root));
    // 2nd case
    left = new TreeNode(3, new TreeNode(4), new TreeNode(2));
    root = new TreeNode(3, left, null);

    assertEquals(3, solution.goodNodes(root));
    // 3rd case
    root = new TreeNode(1);

    assertEquals(1, solution.goodNodes(root));
  }
}