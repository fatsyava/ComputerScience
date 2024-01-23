package com.vmelnyk.geeks4geeks._20240119DistributeCandiesInBinaryTree;

import com.vmelnyk.geeks4geeks.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1Test {

  @Test
  void distributeCandy() {
    assertEquals(2, Solution.distributeCandy(new Node(3, new Node(0), new Node(0))));
    assertEquals(3, Solution.distributeCandy(new Node(0, new Node(3), new Node(0))));
    assertEquals(3, Solution.distributeCandy(new Node(0, new Node(0), new Node(3))));
    assertEquals(2, Solution.distributeCandy(new Node(0, new Node(0), new Node(0))));
    assertEquals(1, Solution.distributeCandy(new Node(0, new Node(1), new Node(0))));
    assertEquals(1, Solution.distributeCandy(new Node(0, new Node(0), new Node(1))));

  }
}
