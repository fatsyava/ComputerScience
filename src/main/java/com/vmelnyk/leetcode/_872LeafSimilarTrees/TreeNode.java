package com.vmelnyk.leetcode._872LeafSimilarTrees;

import java.util.ArrayList;
import java.util.List;

import com.vmelnyk.leetcode.TreeNode;

class Solution {
  public boolean leafSimilar(TreeNode root1, TreeNode root2) {
    List<TreeNode> root1leafs = new ArrayList<>();
    List<TreeNode> root2leafs = new ArrayList<>();

    dfs(root1, root1leafs);
    dfs(root2, root2leafs);

    boolean similar = root1leafs.size() == root2leafs.size();
    if (similar) {
      for (int i = 0; i < root1leafs.size() && similar; i++) {
        similar &= root1leafs.get(i).val == root2leafs.get(i).val;
      }
    }

    return similar;
  }

  private void dfs(TreeNode root, List<TreeNode> leafs) {
    if (root.left == null && root.right == null) {
      leafs.add(root);
    } else {
      if (root.left != null) {
        dfs(root.left, leafs);
      }
      if (root.right != null) {
        dfs(root.right, leafs);
      }
    }
  }
}
