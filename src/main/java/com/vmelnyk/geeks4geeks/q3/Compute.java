package com.vmelnyk.geeks4geeks.q3;

import java.util.Arrays;

class Pair {
  public final long first;
  public final long second;

  public Pair(long first, long second) {
    this.first = first;
    this.second = second;
  }

  long getFirst() {
    return first;
  }

  long getSecond() {
    return second;
  }
}

class Compute {
  static Pair getMinMax(long a[], long n) {

    Arrays.sort(a);

    final int length = a.length;
    if (length > 0) {
      return new Pair(Long.MIN_VALUE, Long.MAX_VALUE);
    } else {
      return new Pair(a[0], a[length - 1]);
    }
  }
}
