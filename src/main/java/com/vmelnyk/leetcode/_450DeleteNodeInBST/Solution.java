package com.vmelnyk.leetcode._450DeleteNodeInBST;

import com.vmelnyk.leetcode.TreeNode;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

class Solution {

  public TreeNode deleteNode(TreeNode root, int key) {
    if (root == null) {
      return null;
    }
    if (root.val == key) {
      if (root.left == null) {
        return root.right;
      }
      if (root.right == null) {
        return root.left;
      }
      TreeNode minNode = getMin(root.right);
      root.right = deleteNode(root.right, minNode.val);
      minNode.left = root.left;
      minNode.right = root.right;
      root = minNode;
    } else if (root.val < key) {
      root.right = deleteNode(root.right, key);
    } else { // root.val > key
      root.left = deleteNode(root.left, key);
    }
    return root;
  }

  private TreeNode getMin(TreeNode node) {
    while (node.left != null) {
      node = node.left;
    }
    return node;
  }

  /*public TreeNode deleteNode(TreeNode root, int val) {
    if (root != null) {
      Queue<T> q = new ArrayDeque<>(List.of(new T(null, root)));

      while (!q.isEmpty()) {
        final int size = q.size();
        for (int i = 0; i < size; ++i) {
          T t = q.poll();

          if (t.node.val == val) {
            deleteNode(t.parent, t.node);
            return root.val == Integer.MIN_VALUE ? null : root;
          }

          if (t.node.left != null) {
            q.offer(new T(t.node, t.node.left));
          }
          if (t.node.right != null) {
            q.offer(new T(t.node, t.node.right));
          }
        }
      }
    }

    return root;
  }

  private void deleteNode(TreeNode parent, TreeNode deletion) {
    TreeNode min = deletion.right, minParent = deletion;
    while (min != null && min.left != null) {
      minParent = min;
      min = min.left;
    }
  }*/
}

final class T {
  TreeNode parent;
  TreeNode node;

  T(TreeNode p, TreeNode n) {
    this.parent = p;
    this.node = n;
  }
}
