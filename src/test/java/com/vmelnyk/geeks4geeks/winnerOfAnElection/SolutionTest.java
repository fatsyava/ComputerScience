package com.vmelnyk.geeks4geeks.winnerOfAnElection;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void example1() {
    assertArrayEquals(
        new String[] {"john", "4"},
        Solution.winner(
            new String[] {
              "john", "johnny", "jackie", "johnny", "john", "jackie", "jamie", "jamie", "john",
              "johnny", "jamie", "johnny", "john"
            },
            13));
  }

  @Test
  void example2() {
    assertArrayEquals(
        new String[] {"andy", "1"}, Solution.winner(new String[] {"andy", "blake", "clark"}, 3));
  }
}
