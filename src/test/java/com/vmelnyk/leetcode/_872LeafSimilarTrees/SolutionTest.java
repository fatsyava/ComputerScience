package com.vmelnyk.leetcode._872LeafSimilarTrees;

import com.vmelnyk.leetcode.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  @Test
  void leafSimilar() {
    Solution solution = new Solution();

    TreeNode left;
    TreeNode right;
    TreeNode root1;
    TreeNode root2;
    // 1st case
    right = new TreeNode(2, new TreeNode(7), new TreeNode(4));
    left = new TreeNode(5, new TreeNode(6), right);
    right = new TreeNode(1, new TreeNode(9), new TreeNode(8));
    root1 = new TreeNode(3, left, right);

    left = new TreeNode(5, new TreeNode(6), new TreeNode(7));
    right = new TreeNode(2, new TreeNode(9), new TreeNode(8));
    right = new TreeNode(1, new TreeNode(4), right);
    root2 = new TreeNode(3, left, right);

    assertTrue(solution.leafSimilar(root1, root2));

    // 1st case
    root1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));

    root2 = new TreeNode(1, new TreeNode(3), new TreeNode(2));

    assertFalse(solution.leafSimilar(root1, root2));
  }
}
