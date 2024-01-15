package com.vmelnyk.leetcode._437PathSumIII;

import org.junit.jupiter.api.Test;
import com.vmelnyk.leetcode.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  @Test
  void pathSum() {
    Solution solution = new Solution();

    TreeNode left;
    TreeNode right;
    TreeNode root;
    // 1st case
    left = new TreeNode(3, new TreeNode(3), new TreeNode(-2));
    right = new TreeNode(2, null, new TreeNode(1));
    left = new TreeNode(5, left, right);
    right = new TreeNode(-3, null, new TreeNode(11));
    root = new TreeNode(10, left, right);

    assertEquals(3, solution.pathSum(root, 8));
    // 2nd case
    right = new TreeNode(11, new TreeNode(7), new TreeNode(2));
    left = new TreeNode(4, null, right);
    right = new TreeNode(4, new TreeNode(5), new TreeNode(1));
    right = new TreeNode(8, new TreeNode(13), right);
    root = new TreeNode(5, left, right);

    assertEquals(3, solution.pathSum(root, 22));
    // 127nd case
    left = new TreeNode(1000000000);
    left = new TreeNode(1000000000, left, null);
    left = new TreeNode(1000000000, left, null);
    left = new TreeNode(294967296, left, null);
    left = new TreeNode(1000000000, left, null);
    root = new TreeNode(1000000000, left, null);

    assertEquals(0, solution.pathSum(root, 0));
  }
}
