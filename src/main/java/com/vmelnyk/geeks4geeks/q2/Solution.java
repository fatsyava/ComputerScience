package com.vmelnyk.geeks4geeks.q2;

import java.util.LinkedList;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.stream.LongStream;

class Solution {
  public static String solution(long[] arr) {
    // Type your solution here
    final LinkedList<Long> filtered = new LinkedList<>();
    final SortedMap<Long, Long> collect = new TreeMap<>();
    LongStream.of(arr)
        .filter(l -> l != -1)
        .boxed()
        .peek(filtered::add)
        .forEach(l -> collect.put(l, l));

    if (!filtered.isEmpty()) {
      final Long head = filtered.getFirst();
      final SortedMap<Long, Long> headMap = collect.headMap(head);
      final long left = headMap.keySet().stream().reduce(0L, Long::sum);
      final SortedMap<Long, Long> tailMap = collect.tailMap(head);
      tailMap.remove(head);
      final long right = tailMap.keySet().stream().reduce(0L, Long::sum);

      if (left > right) {
        return "Left";
      }
      if (right > left) {
        return "Right";
      }
    }

    return "";
  }
}
