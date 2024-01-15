package com.vmelnyk.leetcode._735AsteroidCollision;

import java.util.Stack;

class Solution {
  public int[] asteroidCollision(int[] asteroids) {

    Stack<Integer> survives = new Stack<>();
    for (int a : asteroids) {

      if (a > 0) {
        while (!survives.isEmpty() && survives.peek() < 0 && survives.peek() > -a) {
          survives.pop();
        }

        if (survives.isEmpty() || survives.peek() > 0) {
          survives.push(a);
        } else if (survives.peek() == -a) {
          survives.pop();
        }
      } else {
        while (!survives.isEmpty() && survives.peek() > 0 && survives.peek() < -a) {
          survives.pop();
        }

        if (survives.isEmpty() || survives.peek() < 0) {
          survives.push(a);
        } else if (survives.peek() == -a) {
          survives.pop();
        }
      }
    }

    return survives.stream().mapToInt(Integer::intValue).toArray();
  }
}
