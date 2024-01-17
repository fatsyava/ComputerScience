package com.vmelnyk.geeks4geeks._20240116AllUniquePermutationsOfArray;

import com.vmelnyk.Util;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  @Test
  void uniquePerms() {
    assertIterableEquals(
        List.of(List.of(1, 1, 2), List.of(1, 2, 1), List.of(2, 1, 1)),
        Solution.uniquePerms(new ArrayList<>(List.of(1, 2, 1)), 3));

    assertIterableEquals(
        List.of(List.of(4, 5), List.of(5, 4)),
        Solution.uniquePerms(new ArrayList<>(List.of(4, 5)), 2));
  }

  //@Test
  void uniquePermsTimings() {
    Solution.uniquePerms(new ArrayList<>(Util.randomIntList(10)), 10);
    Solution.uniquePerms(new ArrayList<>(Util.randomIntList(7)), 7);

    for (int capacity : List.of(10, 9, 8, 7, 6, 5, 4, 3, 2)) {
      final long start = System.nanoTime();

      Solution.uniquePerms(new ArrayList<>(Util.randomIntList(capacity)), capacity);

      final long end = System.nanoTime();

      System.out.println(
          "Elapsed time: " + ((end - start) / 1000) + " mu sec for " + capacity + " capacity.");
    }

    final int cap = 9;
    int[] capacities = new int[cap];
    Arrays.fill(capacities, cap);
    long total = 0;
    for (int capacity : capacities) {
      final long start = System.nanoTime();

      Solution.uniquePerms(new ArrayList<>(Util.randomIntList(capacity)), capacity);

      final long time = System.nanoTime() - start;
      total += time;
      System.out.println(
          "Elapsed time: " + (time / 1000) + " mu sec for " + capacity + " capacity.");
    }
    System.out.println("Total Avg. time: " + (total / 1000 / cap) + " mu sec.");
  }
}
