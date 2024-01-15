package com.vmelnyk.leetcode._199BinaryTreeRightSideView;

import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.ArrayDeque;

import com.vmelnyk.leetcode.TreeNode;

class Solution {
  public List<Integer> rightSideView(TreeNode root) {
    List<Integer> retval = new ArrayList<>();

    if (root != null) {
      Queue<TreeNode> q = new ArrayDeque<>(List.of(root));

      while (!q.isEmpty()) {
        final int size = q.size();
        for (int i = 0; i < size; ++i) {
          TreeNode node = q.poll();
          if (i == size - 1) {
            retval.add(node.val);
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

    return retval;
  }

  public List<Integer> leftSideView(TreeNode root) {
    List<Integer> retval = new ArrayList<>();

    if (root != null) {
      Queue<TreeNode> q = new ArrayDeque<>(List.of(root));
      while (!q.isEmpty()) {
        final int size = q.size();
        for (int i = 0; i < size; ++i) {
          TreeNode node = q.poll();
          if (i == size - 1) {
            retval.add(node.val);
          }
          if (node.right != null) {
            q.offer(node.right);
          }
          if (node.left != null) {
            q.offer(node.left);
          }
        }
      }
    }

    return retval;
  }
}
