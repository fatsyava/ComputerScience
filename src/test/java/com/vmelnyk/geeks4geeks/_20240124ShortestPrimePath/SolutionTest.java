package com.vmelnyk.geeks4geeks._20240124ShortestPrimePath;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  @Test
  void solve() {
    Solution solution = new Solution();

    assertEquals(6, solution.solve(1033, 8179));
    assertEquals(0, solution.solve(1009, 1009));
  }
}
