package com.vmelnyk.leetcode._700SearchInBinarySearchTree;

import com.vmelnyk.leetcode.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.vmelnyk.leetcode.TreeNode.toList;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  @Test
  void searchBST() {
    Solution solution = new Solution();

    TreeNode left;
    TreeNode right;
    TreeNode root;
    TreeNode found;
    List<Integer> actual;
    // 1st case
    left = new TreeNode(2, new TreeNode(1), new TreeNode(3));
    root = new TreeNode(4, left, new TreeNode(7));

    found = solution.searchBST(root, 2);
    actual = toList(found);
    assertEquals(List.of(2, 1, 3), actual);

    // 2nd case
    left = new TreeNode(2, new TreeNode(1), new TreeNode(3));
    root = new TreeNode(4, left, new TreeNode(7));

    found = solution.searchBST(root, 5);
    assertNull(found);
    assertEquals(List.of(), toList(found));
  }
}
