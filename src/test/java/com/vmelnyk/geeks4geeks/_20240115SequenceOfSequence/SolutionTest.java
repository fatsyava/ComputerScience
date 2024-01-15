package com.vmelnyk.geeks4geeks._20240115SequenceOfSequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  @Test
  void numberSequence() {

    assertEquals(4, Solution.numberSequence(10,4));
    assertEquals(6, Solution.numberSequence(5,2));
  }
}
