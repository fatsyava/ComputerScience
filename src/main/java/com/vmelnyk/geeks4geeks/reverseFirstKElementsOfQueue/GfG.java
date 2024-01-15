package com.vmelnyk.geeks4geeks.reverseFirstKElementsOfQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class GfG {
  // Function to reverse first k elements of a queue.
  public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
    // add code here.
    int n = q.size() - k;
    Stack<Integer> reverse = new Stack<>();
    while (k-- > 0) {
      reverse.push(q.poll());
    }

    while (!reverse.isEmpty()) {
      q.add(reverse.pop());
    }

    while (n-- > 0) {
      q.add(q.poll());
    }

    return q;
  }
}
