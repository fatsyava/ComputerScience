package com.vmelnyk.geeks4geeks._20240123IsItTree;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  @Test
  void isTree() {
    Solution solution = new Solution();

    ArrayList<ArrayList<Integer>> list;
    // 0th
    list = new ArrayList<>();
    assertTrue(solution.isTree(1, 0, list));
    //
    list.add(new ArrayList<>(Arrays.asList(3, 1)));
    list.add(new ArrayList<>(Arrays.asList(7, 4)));
    list.add(new ArrayList<>(Arrays.asList(3, 7)));
    list.add(new ArrayList<>(Arrays.asList(3, 5)));
    list.add(new ArrayList<>(Arrays.asList(0, 6)));
    list.add(new ArrayList<>(Arrays.asList(3, 2)));
    list.add(new ArrayList<>(Arrays.asList(0, 3)));
    assertTrue(solution.isTree(8, 7, list));
    // 1st
    list = new ArrayList<>();
    list.add(new ArrayList<>(Arrays.asList(0, 1)));
    list.add(new ArrayList<>(Arrays.asList(1, 2)));
    list.add(new ArrayList<>(Arrays.asList(1, 3)));
    assertTrue(solution.isTree(4, 3, list));
    // 2nd
    list = new ArrayList<>();
    list.add(new ArrayList<>(Arrays.asList(0, 1)));
    list.add(new ArrayList<>(Arrays.asList(1, 2)));
    list.add(new ArrayList<>(Arrays.asList(2, 0)));
    assertFalse(solution.isTree(4, 3, list));
    // 11th
    list = new ArrayList<>();
    list.add(new ArrayList<>(Arrays.asList(27, 14)));
    list.add(new ArrayList<>(Arrays.asList(21, 27)));
    list.add(new ArrayList<>(Arrays.asList(23, 9)));
    assertFalse(solution.isTree(30, 3, list));
    // 29th
    list = new ArrayList<>();
    list.add(new ArrayList<>(Arrays.asList(12, 9)));
    list.add(new ArrayList<>(Arrays.asList(2, 8)));
    list.add(new ArrayList<>(Arrays.asList(0, 9)));
    list.add(new ArrayList<>(Arrays.asList(7, 10)));
    list.add(new ArrayList<>(Arrays.asList(3, 6)));
    list.add(new ArrayList<>(Arrays.asList(5, 0)));
    list.add(new ArrayList<>(Arrays.asList(13, 11)));
    list.add(new ArrayList<>(Arrays.asList(8, 11)));
    list.add(new ArrayList<>(Arrays.asList(13, 11)));
    list.add(new ArrayList<>(Arrays.asList(11, 0)));
    list.add(new ArrayList<>(Arrays.asList(2, 13)));
    list.add(new ArrayList<>(Arrays.asList(10, 1)));
    list.add(new ArrayList<>(Arrays.asList(6, 1)));
    assertFalse(solution.isTree(14, 13, list));
    // 112th
    list = new ArrayList<>();
    list.add(new ArrayList<>(Arrays.asList(0, 19)));
    list.add(new ArrayList<>(Arrays.asList(1, 3)));
    list.add(new ArrayList<>(Arrays.asList(2, 13)));
    list.add(new ArrayList<>(Arrays.asList(5, 10)));
    list.add(new ArrayList<>(Arrays.asList(5, 18)));
    list.add(new ArrayList<>(Arrays.asList(6, 21)));
    list.add(new ArrayList<>(Arrays.asList(6, 11)));
    list.add(new ArrayList<>(Arrays.asList(7, 13)));
    list.add(new ArrayList<>(Arrays.asList(7, 12)));
    list.add(new ArrayList<>(Arrays.asList(7, 16)));
    list.add(new ArrayList<>(Arrays.asList(7, 0)));
    list.add(new ArrayList<>(Arrays.asList(8, 7)));
    list.add(new ArrayList<>(Arrays.asList(9, 22)));
    list.add(new ArrayList<>(Arrays.asList(10, 11)));
    list.add(new ArrayList<>(Arrays.asList(10, 6)));
    list.add(new ArrayList<>(Arrays.asList(12, 17)));
    list.add(new ArrayList<>(Arrays.asList(13, 4)));
    list.add(new ArrayList<>(Arrays.asList(14, 9)));
    list.add(new ArrayList<>(Arrays.asList(15, 21)));
    list.add(new ArrayList<>(Arrays.asList(15, 6)));
    list.add(new ArrayList<>(Arrays.asList(16, 12)));
    list.add(new ArrayList<>(Arrays.asList(19, 12)));
    assertFalse(solution.isTree(23, 22, list));
  }
}
