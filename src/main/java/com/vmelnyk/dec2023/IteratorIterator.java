package com.vmelnyk.dec2023;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.StreamSupport;

public class IteratorIterator {

  public static <T> Iterator<T> flatten1(final Iterator<Iterator<T>> iterators) {
    return new Iterator<T>() {
      private Iterator<T> current = null;

      public boolean hasNext() {

        boolean hasNext = false;
        do {
          if (current == null || !current.hasNext()) {
            if (iterators.hasNext()) {
              current = iterators.next();
            } else {
              break;
            }
          }

          hasNext = current.hasNext();
        } while (!hasNext);

        return hasNext;
      }

      public T next() {
        return current.next();
      }
    };
  }

  public static <T> Iterator<T> flatten2(final Iterator<Iterator<T>> input) {
    return StreamSupport.stream(
            Spliterators.spliteratorUnknownSize(input, Spliterator.ORDERED), false)
        .flatMap(
            iterator ->
                StreamSupport.stream(
                    Spliterators.spliteratorUnknownSize(iterator, Spliterator.ORDERED), false))
        .iterator();
  }

  /* Sample use */
  public static void main(String... args) {
    Iterator<Integer> a = Arrays.asList(1, 2, 3, 4).iterator();
    Iterator<Integer> b = Arrays.asList(10, 11, 12).iterator();
    Iterator<Integer> b1 = new ArrayList<Integer>().iterator();
    Iterator<Integer> c = Arrays.asList(99, 98, 97).iterator();
    Iterator<Iterator<Integer>> iteratorIterator = Arrays.asList(a, b, c).iterator();

    Iterator<Integer> ii = flatten1(iteratorIterator);

    while (ii.hasNext()) {
      System.out.println(ii.next());
    }
  }
}
