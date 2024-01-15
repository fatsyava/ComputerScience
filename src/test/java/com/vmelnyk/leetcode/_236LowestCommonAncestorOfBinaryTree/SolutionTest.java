package com.vmelnyk.leetcode._236LowestCommonAncestorOfBinaryTree;

import com.vmelnyk.leetcode.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  @Test
  void lowestCommonAncestor() {
    Solution solution = new Solution();

    TreeNode left;
    TreeNode right;
    TreeNode root;
    // 1st case
    right = new TreeNode(2, new TreeNode(7), new TreeNode(4));
    left = new TreeNode(5, new TreeNode(6), right);
    right = new TreeNode(1, new TreeNode(0), new TreeNode(8));
    root = new TreeNode(3, left, right);

    assertEquals(3, solution.lowestCommonAncestor(root, new TreeNode(5), new TreeNode(1)).val);
    assertEquals(5, solution.lowestCommonAncestor(root, new TreeNode(5), new TreeNode(4)).val);

    root = new TreeNode(1, new TreeNode(2), null);
    assertEquals(1, solution.lowestCommonAncestor(root, new TreeNode(1), new TreeNode(2)).val);
  }
}
