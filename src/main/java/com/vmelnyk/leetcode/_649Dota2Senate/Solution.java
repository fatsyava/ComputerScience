package com.vmelnyk.leetcode._649Dota2Senate;

import java.util.LinkedList;
import java.util.Optional;
import java.util.Queue;

class Solution {
  public String predictPartyVictory(String senate) {
    final int n = senate.length();
    Queue<Integer> radiantSenators = new LinkedList<>();
    Queue<Integer> direSenators = new LinkedList<>();

    for (int i = 0; i < n; ++i)
      if (senate.charAt(i) == 'R') {
        radiantSenators.add(i);
      } else {
        direSenators.add(i);
      }

    while (!radiantSenators.isEmpty() && !direSenators.isEmpty()) {
      final int indexR = radiantSenators.poll();
      final int indexD = direSenators.poll();
      if (indexR < indexD) {
        radiantSenators.add(indexR + n);
      } else {
        direSenators.add(indexD + n);
      }
    }
    return radiantSenators.isEmpty() ? "Dire" : "Radiant";
  }
}
