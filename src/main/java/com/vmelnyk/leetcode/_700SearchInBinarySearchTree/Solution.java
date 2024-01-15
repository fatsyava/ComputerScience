package com.vmelnyk.leetcode._700SearchInBinarySearchTree;

import com.vmelnyk.leetcode.TreeNode;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

class Solution {
  public TreeNode searchBST(TreeNode root, int val) {
    if (root != null) {
      Queue<TreeNode> q =
          new ArrayDeque<>(List.of(root));

      while (!q.isEmpty()) {
        final int size = q.size();
        for (int i = 0; i < size; ++i) {
          TreeNode node = q.poll();

          if(node.val == val){
            return node;
          }

          if (node.left != null) {
            q.offer(node.left);
          }
          if (node.right != null) {
            q.offer(node.right);
          }
        }
      }
    }

    return null;
  }
}
