package com.vmelnyk;

import java.util.*;

/** Usage: int[] array = {1, 2, 3}; Util.shuffle(array); */
public class Util {

  private static Random random;

  /** Code from method java.util.Collections.shuffle(); */
  public static void shuffle(int[] array) {
    if (random == null) {
      random = new Random();
    }
    int count = array.length;
    for (int i = count; i > 1; i--) {
      swap(array, i - 1, random.nextInt(i));
    }
  }

  private static void swap(int[] array, int i, int j) {
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }

  public static <T> void shuffle(T[] array) {
    if (random == null) {
      random = new Random();
    }
    int count = array.length;
    for (int i = count; i > 1; i--) {
      swap(array, i - 1, random.nextInt(i));
    }
  }

  public static <T> void shuffle(List<T> array) {
    if (random == null) {
      random = new Random();
    }
    int count = array.size();
    for (int i = count; i > 1; i--) {
      Collections.swap(array, i - 1, random.nextInt(i));
    }
  }

  private static <T> void swap(T[] array, int i, int j) {
    T temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }

  public static long sumOfPowers(long x) {
    long c = 0;
    while (x % 2 == 0) {
      c++;
      x /= 2;
    }
    for (long i = 3; i <= Math.sqrt(x); i += 2) {
      while (x % i == 0) {
        c++;
        x /= i;
      }
    }
    if (x > 2) {
      c++;
    }
    return c;
  }

  public static List<Integer> randomIntList(int len) {
    if (random == null) {
      random = new Random();
    }
    List<Integer> result = new ArrayList<>();
    for (int i = 0; i < len; i++) {
      result.add(i);
    }
    shuffle(result);
    return result;
  }

  public static int[] randomIntArray(int len) {
    if (random == null) {
      random = new Random();
    }
    int[] result = new int[len];
    for (int i = 0; i < len; i++) {
      result[i] = i;
    }
    shuffle(result);
    return result;
  }

  public static int[] randomIntArray(int len, int initial) {
    if (random == null) {
      random = new Random();
    }
    int[] result = new int[len];
    for (int i = 0; i < len; i++) {
      result[i] = i;
    }
    shuffle(result);
    return result;
  }

  // Function to find the factorial
  // of a number
  public static double fact(int a) {
    double f = 1.0;
    // Loop to find the factorial
    // of the given number
    for (int i = 2; i <= a; i++) f = f * i;
    return f;
  }

  // Function to find the number
  // of permutations possible
  // for a given String
  public static long permute(int n, int r) {
      return n < r ? 0 : (long)(fact(n) / fact(n - r));
  }

  // Function to find the total
  // number of combinations possible
  public static long findPermutations(int n) {
    long sum = 0, P;
    for (int r = 1; r <= n; r++) {
      P = permute(n, r);
      sum = sum + P;
    }
    return sum;
  }
}
