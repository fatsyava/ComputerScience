package com.vmelnyk.geeks4geeks.removeKDigits;

import java.util.Stack;

class Solution {
  public String removeKdigits(String s, int k) {
    // code here
    Stack<Character> ms = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      final char c = s.charAt(i);
      while (!ms.isEmpty() && ms.peek() > c && k > 0) {
        ms.pop();
        k--;
      }
      ms.add(c);
    }
    while (k-- > 0) {
      ms.pop();
    }
    if (ms.isEmpty()) {
      return "0";
    }
    StringBuilder result = new StringBuilder();
    while (!ms.isEmpty()) {
      result.append(ms.pop());
    }
    result = result.reverse();
    int index = 0;
    while (index < result.length() - 1 && result.charAt(index) == '0') {
      index++;
    }
    return result.substring(index);
  }
}
