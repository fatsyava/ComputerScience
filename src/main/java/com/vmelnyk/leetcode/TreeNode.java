package com.vmelnyk.leetcode;

import java.util.*;

public final class TreeNode {
  public int val;
  public TreeNode left;
  public TreeNode right;

  public TreeNode() {
    this.val = Integer.MIN_VALUE;
  }

  public TreeNode(int val) {
    this.val = val;
  }

  public TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }

  @Override
  public String toString() {
    return "(" + left(left) + val + right(right) + ")";
  }

  private String left(TreeNode tn) {
    return tn == null ? "" : (tn + " <- ");
  }

  private String right(TreeNode tn) {
    return tn == null ? "" : (" -> " + tn);
  }

  public static List<Integer> toList(TreeNode root) {
    List<Integer> nodes = new ArrayList<>();
    if (root != null) {
      Queue<TreeNode> q = new LinkedList<>(List.of(root));

      while (!q.isEmpty()) {
        final int size = q.size();
        for (int i = 0; i < size; ++i) {
          TreeNode node = q.poll();

          if (node.val == Integer.MIN_VALUE) {
            nodes.add(null);
          } else {
            nodes.add(node.val);
          }

          if (node.left != null || node.right != null) {
            q.offer(Objects.requireNonNullElseGet(node.left, TreeNode::new));
            q.offer(Objects.requireNonNullElseGet(node.right, TreeNode::new));
          }
        }
      }
    }
    return nodes;
  }
}
