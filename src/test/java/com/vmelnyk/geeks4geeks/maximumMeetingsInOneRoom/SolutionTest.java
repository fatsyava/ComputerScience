package com.vmelnyk.geeks4geeks.maximumMeetingsInOneRoom;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void example0() {
    final ArrayList<Integer> actual =
        Solution.maxMeetings(
            10,
            new int[] {12, 6, 16, 12, 6, 9, 16, 6, 17, 5},
            new int[] {17, 13, 16, 18, 17, 10, 18, 12, 18, 11});

    assertIterableEquals(Arrays.asList(3,6,9), actual, "" + actual);
  }

  @Test
  void example1() {
    assertIterableEquals(
        Arrays.asList(1, 2, 4, 5),
        Solution.maxMeetings(5, new int[] {1, 3, 0, 5, 8, 5}, new int[] {2, 4, 6, 7, 9, 9}));
  }

  @Test
  void example2() {
    assertIterableEquals(Arrays.asList(1), Solution.maxMeetings(1, new int[] {3}, new int[] {7}));
  }

  @Test
  void example3() {
    assertIterableEquals(
            Arrays.asList(1), Solution.maxMeetings(1, new int[] {7}, new int[] {3}));
  }
}
