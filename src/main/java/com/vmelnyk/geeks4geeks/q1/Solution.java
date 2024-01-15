package com.vmelnyk.geeks4geeks.q1;

import java.util.OptionalLong;
import java.util.stream.LongStream;

class Solution {
  public static long solution(long[] arr) {
    final OptionalLong max = LongStream.of(arr).max();

    return max.isPresent() ? max.getAsLong() :  0L;
  }
}
