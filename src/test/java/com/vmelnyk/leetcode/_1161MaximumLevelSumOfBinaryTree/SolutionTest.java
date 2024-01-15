package com.vmelnyk.leetcode._1161MaximumLevelSumOfBinaryTree;

import org.junit.jupiter.api.Test;
import com.vmelnyk.leetcode.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  @Test
  void maxLevelSum() {
    Solution solution = new Solution();

    TreeNode left;
    TreeNode right;
    TreeNode root;
    // 1st case
    left = new TreeNode(7, new TreeNode(7), new TreeNode(-8));
    right = new TreeNode(0);
    root = new TreeNode(1, left, right);

    assertEquals(2, solution.maxLevelSum(root));

    // 2nd case
    right = new TreeNode(-89388, null, new TreeNode(-32127));
    right = new TreeNode(10250, new TreeNode(98693), right);
    root = new TreeNode(989, null, right);
    assertEquals(2, solution.maxLevelSum(root));
  }
}
