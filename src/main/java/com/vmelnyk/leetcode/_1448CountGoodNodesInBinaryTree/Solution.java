package com.vmelnyk.leetcode._1448CountGoodNodesInBinaryTree;


import com.vmelnyk.leetcode.TreeNode;

class Solution {
  public int goodNodes(TreeNode root) {
    return goodNodes(root, Integer.MIN_VALUE);
  }

  public int goodNodes(TreeNode root, int max) {
    if (root == null) {
      return 0;
    }

    final int newMax = Math.max(root.val, max);

    return (root.val >= max ? 1 : 0) + goodNodes(root.left, newMax) + goodNodes(root.right, newMax);
  }
}
