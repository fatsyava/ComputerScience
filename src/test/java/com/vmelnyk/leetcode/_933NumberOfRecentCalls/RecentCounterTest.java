package com.vmelnyk.leetcode._933NumberOfRecentCalls;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecentCounterTest {

  @Test
  void ping() {
    RecentCounter recentCounter = new RecentCounter();

    assertEquals(1, recentCounter.ping(1));
    assertEquals(2, recentCounter.ping(100));
    assertEquals(3, recentCounter.ping(3001));
    assertEquals(3, recentCounter.ping(3002));
    assertEquals(1, recentCounter.ping(6005));
    assertEquals(1, recentCounter.ping(10000));
  }
}
