package com.vmelnyk.geeks4geeks._20240122CourseSchedule;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  @Test
  void findOrder() {

    ArrayList<ArrayList<Integer>> list;
    // 1st
    list = new ArrayList<>();
    list.add(new ArrayList<>(Arrays.asList(1, 0)));
    assertArrayEquals(new int[] {0, 1}, Solution.findOrder(2, 1, list));
    // 2nd
    list = new ArrayList<>();
    list.add(new ArrayList<>(Arrays.asList(1, 0)));
    list.add(new ArrayList<>(Arrays.asList(2, 0)));
    list.add(new ArrayList<>(Arrays.asList(3, 1)));
    list.add(new ArrayList<>(Arrays.asList(3, 2)));
    assertArrayEquals(new int[] {0, 2, 1, 3}, Solution.findOrder(4, 4, list));
    // 5th
    list = new ArrayList<>();
    list.add(new ArrayList<>(Arrays.asList(10, 15)));
    list.add(new ArrayList<>(Arrays.asList(16, 10)));
    list.add(new ArrayList<>(Arrays.asList(12, 3)));
    list.add(new ArrayList<>(Arrays.asList(9, 5)));
    list.add(new ArrayList<>(Arrays.asList(2, 0)));
    list.add(new ArrayList<>(Arrays.asList(15, 0)));
    list.add(new ArrayList<>(Arrays.asList(13, 8)));
    list.add(new ArrayList<>(Arrays.asList(0, 8)));
    list.add(new ArrayList<>(Arrays.asList(5, 8)));
    assertArrayEquals(
        new int[] {8, 0, 15, 10, 3, 5, 16, 14, 13, 12, 11, 9, 7, 6, 4, 2, 1},
        Solution.findOrder(17, 9, list));
  }
}
