package com.vmelnyk.leetcode._1161MaximumLevelSumOfBinaryTree;

import java.util.*;

import com.vmelnyk.leetcode.TreeNode;

class Solution {
  public int maxLevelSum(TreeNode root) {
    Map<Integer, Long> sums = new HashMap<>();

    dfs(root, 1, sums);

    long max = Long.MIN_VALUE;
    int level = -1;
    for (Map.Entry<Integer, Long> e : sums.entrySet()) {
      if (e.getValue() > max) {
        max = e.getValue();
        level = e.getKey();
      }
    }

    return level;
  }

  private void dfs(TreeNode root, int depth, Map<Integer, Long> sums) {
    if (root == null) {
      return;
    }

    sums.put(depth, sums.getOrDefault(depth, 0L) + root.val);

    dfs(root.right, depth + 1, sums);
    dfs(root.left, depth + 1, sums);
  }
}
