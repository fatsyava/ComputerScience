package com.vmelnyk.leetcode._933NumberOfRecentCalls;

import java.util.SortedSet;
import java.util.TreeSet;

class RecentCounter {

  private final SortedSet<Integer> requests = new TreeSet<>();

  public RecentCounter() {}

  public int ping(int t) {
    requests.add(t);

    if (t >= 3000) {
      requests.removeIf(time -> time < t - 3000);
    }
    return requests.size();
  }
}
