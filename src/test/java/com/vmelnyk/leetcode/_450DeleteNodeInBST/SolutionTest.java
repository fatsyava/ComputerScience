package com.vmelnyk.leetcode._450DeleteNodeInBST;

import com.vmelnyk.leetcode.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.*;

import static com.vmelnyk.leetcode.TreeNode.toList;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  @Test
  void deleteNode() {
    Solution solution = new Solution();

    TreeNode left;
    TreeNode right;
    TreeNode root;
    TreeNode found;
    List<Integer> actual;
    // 1st case
    /*
                5                             5
             /      \                      /     \
         "3"           6          =>      4        6
       /     \           \              /           \
      2       4          7             2             7
    */
    left = new TreeNode(3, new TreeNode(2), new TreeNode(4));
    right = new TreeNode(6, null, new TreeNode(7));
    root = new TreeNode(5, left, right);

    found = solution.deleteNode(root, 3);
    actual = toList(found);
    assertEquals(Arrays.asList(5, 4, 6, 2, null, null, 7), actual);
    // 2nd case
    /*
                5                             5
             /      \                      /     \
          3           6          =>      3         6
        /   \           \              /   \         \
      2       4          7            2     4         7
    */
    left = new TreeNode(3, new TreeNode(2), new TreeNode(4));
    right = new TreeNode(6, null, new TreeNode(7));
    root = new TreeNode(5, left, right);

    found = solution.deleteNode(root, 0);
    actual = toList(found);
    assertEquals(Arrays.asList(5, 3, 6, 2, 4, null, 7), actual);
    // 3rd case
    /*
                5                             5
             /      \                      /     \
          3           6          =>      3         6
       /     \           \              /           \
      2      "4"          7            2             7
    */
    left = new TreeNode(3, new TreeNode(2), new TreeNode(4));
    right = new TreeNode(6, null, new TreeNode(7));
    root = new TreeNode(5, left, right);

    found = solution.deleteNode(root, 4);
    actual = toList(found);
    assertEquals(Arrays.asList(5, 3, 6, 2, null, null, 7), actual);
    // 4th case
    /*
               "5"                            6
             /      \                      /     \
            3        6          =>        3       7
          /   \        \                /   \
         2     4        7              2     4
    */
    left = new TreeNode(3, new TreeNode(2), new TreeNode(4));
    right = new TreeNode(6, null, new TreeNode(7));
    root = new TreeNode(5, left, right);

    found = solution.deleteNode(root, 5);
    actual = toList(found);
    assertEquals(List.of(6, 3, 7, 2, 4), actual);

    // 5th case
    /*
         "5"             =>
    */
    found = solution.deleteNode(new TreeNode(5), 5);
    actual = toList(found);
    assertEquals(List.of(), actual);

    // 63rd case
    /*
             "50"                           60
           /      \                      /      \
        30         70          =>      30        70
          \      /   \                  \          \
           40   60   80                  40         80
    */
    left = new TreeNode(30, null, new TreeNode(40));
    right = new TreeNode(70, new TreeNode(60), new TreeNode(80));
    root = new TreeNode(50, left, right);

    found = solution.deleteNode(root, 50);
    actual = toList(found);
    assertEquals(Arrays.asList(60, 30, 70, null, 40, null, 80), actual);
  }

  @Test
  void deleteNodeCaseN() {
    Solution solution = new Solution();

    TreeNode left;
    TreeNode right;
    TreeNode root;
    TreeNode found;
    List<Integer> actual;
    // Nth case
    /*
                 "50"                                55
             /           \                      /          \
          30             70          =>      30             70
        /   \           /   \               /   \          /   \
       20   40        60     80            20   40        60    80
      /      \        /                   /       \
     10      45      55                  10        45
    */
    left = new TreeNode(20, new TreeNode(10), null);
    right = new TreeNode(40, null, new TreeNode(45));
    left = new TreeNode(30, left, right);
    right = new TreeNode(70, new TreeNode(60, new TreeNode(55), null), new TreeNode(80));
    root = new TreeNode(50, left, right);

    found = solution.deleteNode(root, 50);
    actual = toList(found);
    assertEquals(Arrays.asList(55, 30, 70, 20, 40, 60, 80, 10, null, null, 45), actual);
  }

  @Test
  void deleteNodeCase11() {
    Solution solution = new Solution();

    TreeNode left;
    TreeNode right;
    TreeNode root;
    TreeNode found;
    List<Integer> actual;
    // Nth case
    /*
                 4                         4
                  \                         \
                  "7"          =>            8
                 /   \                     /   \
                6     8                   6     9
               /       \                 /
              5         9               5
    */
    left = new TreeNode(6, new TreeNode(5), null);
    right = new TreeNode(8, null, new TreeNode(9));
    right = new TreeNode(7, left, right);
    root = new TreeNode(4, null, right);

    found = solution.deleteNode(root, 7);
    actual = toList(found);
    assertEquals(Arrays.asList(4, null, 8, 6, 9, 5, null), actual);
  }
}
