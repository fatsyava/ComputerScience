package com.vmelnyk.leetcode._649Dota2Senate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  @Test
  void predictPartyVictory() {
    Solution solution = new Solution();


    assertEquals("Radiant", solution.predictPartyVictory("RD"));
    assertEquals("Dire", solution.predictPartyVictory("RDD"));
    assertEquals("Radiant", solution.predictPartyVictory("RDR"));
    assertEquals("Dire", solution.predictPartyVictory("DR"));
    assertEquals("Radiant", solution.predictPartyVictory("RR"));
    assertEquals("Dire", solution.predictPartyVictory("DD"));
  }
}
