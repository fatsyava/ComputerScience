package com.vmelnyk.geeks4geeks._20240119DistributeCandiesInBinaryTree;

import com.vmelnyk.geeks4geeks.Node;

class Solution2 {
  private int numMoves = 0;

  public static int distributeCandy(Node root) {
    Solution2 solution = new Solution2();
    solution.traverse(root);
    return solution.numMoves;
  }

  private int traverse(Node node) {
    if (node == null) {
      return 0;
    }
    final int left = traverse(node.left);
    final int right = traverse(node.right);
    numMoves += Math.abs(left) + Math.abs(right);
    return node.data + left + right - 1;
  }
}
