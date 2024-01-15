package com.vmelnyk.leetcode._104MaximumDepthOfBinaryTree;

import com.vmelnyk.leetcode.TreeNode;

class Solution {
  public int maxDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }

    return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
  }
}
