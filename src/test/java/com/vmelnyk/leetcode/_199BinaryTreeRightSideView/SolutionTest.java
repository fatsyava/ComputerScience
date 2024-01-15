package com.vmelnyk.leetcode._199BinaryTreeRightSideView;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import com.vmelnyk.leetcode.TreeNode;

class SolutionTest {

  @Test
  void rightSideView() {
    Solution solution = new Solution();

    TreeNode left;
    TreeNode right;
    TreeNode root;
    // 1st case
    left = new TreeNode(2, null, new TreeNode(5));
    right = new TreeNode(3, null, new TreeNode(4));
    root = new TreeNode(1, left, right);

    assertEquals(List.of(1, 3, 4), solution.rightSideView(root));

    // 2nd case
    root = new TreeNode(1, null, new TreeNode(3));
    assertEquals(List.of(1, 3), solution.rightSideView(root));

    // 3rd case
    assertEquals(List.of(1), solution.rightSideView(new TreeNode(1)));
    assertEquals(List.of(), solution.rightSideView(null));

    // 4th case
    left = new TreeNode(2, new TreeNode(5), null);
    root = new TreeNode(1, left, null);

    assertEquals(List.of(1, 2, 5), solution.rightSideView(root));
  }

  @Test
  void leftSideView() {
    Solution solution = new Solution();

    TreeNode left;
    TreeNode right;
    TreeNode root;
    // 1st case
    left = new TreeNode(2, null, new TreeNode(5));
    right = new TreeNode(3, null, new TreeNode(4));
    root = new TreeNode(1, left, right);

    assertEquals(List.of(1, 2, 5), solution.leftSideView(root));

    // 2nd case
    root = new TreeNode(1, null, new TreeNode(3));
    assertEquals(List.of(1, 3), solution.leftSideView(root));

    // 3rd case
    assertEquals(List.of(1), solution.leftSideView(new TreeNode(1)));
    assertEquals(List.of(), solution.leftSideView(null));

    // 4th case
    right = new TreeNode(2, null, new TreeNode(5));
    root = new TreeNode(1, null, right);

    assertEquals(List.of(1, 2, 5), solution.leftSideView(root));
  }
}
