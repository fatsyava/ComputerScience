package com.vmelnyk.leetcode._437PathSumIII;

import com.vmelnyk.leetcode.TreeNode;


class Solution {
  public int pathSum(TreeNode root, long sum) {
    if (root == null) {
      return 0;
    }
    return dfs(root, sum)
        + //
        pathSum(root.left, sum)
        + //
        pathSum(root.right, sum);
  }

  private int dfs(TreeNode root, long sum) {
    if (root == null) {
      return 0;
    }
    return (sum == root.val ? 1 : 0)
        + //
        dfs(root.left, sum - root.val)
        + //
        dfs(root.right, sum - root.val);
  }
}
