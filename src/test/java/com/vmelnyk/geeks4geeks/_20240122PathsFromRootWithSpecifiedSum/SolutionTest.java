package com.vmelnyk.geeks4geeks._20240122PathsFromRootWithSpecifiedSum;

import com.vmelnyk.geeks4geeks.Node;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  @Test
  void printPaths() {

    Node root;
    Node left;
    Node right;
    //
    left = new Node(4, new Node(6), new Node(7));
    right = new Node(15, new Node(8), new Node(9));
    right = new Node(3, left, right);
    root = new Node(1, new Node(20), right);
    assertIterableEquals(List.of(List.of(1, 3, 4)), Solution.printPaths(root, 8));
    //
    left = new Node(14, new Node(21), new Node(22));
    right = new Node(15, new Node(23), new Node(24));
    right = new Node(13, left, right);
    root = new Node(10, new Node(28), right);
    assertIterableEquals(
        List.of(List.of(10, 28), List.of(10, 13, 15)), Solution.printPaths(root, 38));
  }
}
