package com.vmelnyk.leetcode._1116PrintZeroEvenOdd;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.IntConsumer;

import static org.junit.jupiter.api.Assertions.*;

class ZeroEvenOddTest {

  @Test
  void zeroEvenOdd() throws InterruptedException {
    List<Integer> values = new ArrayList<>();
    final IntConsumer print =
        value -> {
          values.add(value);
          //System.out.println(value);
        };
    final IntConsumer printZero =
        value -> {
          System.out.println("printZero=" + value);
          print.accept(value);
        };
    final IntConsumer printEven =
        value -> {
          System.out.println("printEven=" + value);
          print.accept(value);
        };
    final IntConsumer printOdd =
        value -> {
          System.out.println("printOdd=" + value);
          print.accept(value);
        };

    final int n = 10;
    ZeroEvenOdd foo = new ZeroEvenOdd(n);

    List<Callable<Void>> tasks = new ArrayList<>();
    tasks.add(
        () -> {
          try {
            foo.zero(printZero);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
          System.out.println("Print Zeroes is completed!");
          return null;
        });
    tasks.add(
        () -> {
          try {
            foo.even(printEven);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
          System.out.println("Print Evens is completed!");
          return null;
        });
    tasks.add(
        () -> {
          try {
            foo.odd(printOdd);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
          System.out.println("Print Odds is completed!");
          return null;
        });

    ExecutorService service = Executors.newFixedThreadPool(tasks.size());
    service.invokeAll(tasks);

//    Thread.sleep(3000);

    service.awaitTermination(2, TimeUnit.SECONDS);

    service.shutdown();
  }
}
