package com.vmelnyk.leetcode._1195FizzBuzzMultithreaded;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.function.IntConsumer;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

  @Test
  void fizzBuzzMultiThreaded() throws InterruptedException {

    final long start = System.currentTimeMillis();
    final long capacity = 10;

    List<String> values = new ArrayList<>();

    FizzBuzz fizzBuzz = new FizzBuzz(15);

    List<Callable<Void>> tasks = new ArrayList<>();
    Runnable fizz = () -> {
        values.add("fizz");
        System.out.println("fizz");
    };
    Runnable buzz = () -> {
        values.add("buzz");
        System.out.println("buzz");
    };
    Runnable fizzbuzz = () -> {
        values.add("fizzbuzz");
        System.out.println("fizzbuzz");
    };
    IntConsumer number = n -> {
        values.add("" + n);
        System.out.println("" + n);
    };

    tasks.add(
        () -> {
          while (System.currentTimeMillis() - start < capacity) {
            try {
              fizzBuzz.fizz(fizz);
            } catch (InterruptedException e) {
              e.printStackTrace();
            }
          }
          System.out.println("fizz is completed!");
          return null;
        });
    tasks.add(
        () -> {
          while (System.currentTimeMillis() - start < capacity) {
            try {
              fizzBuzz.buzz(buzz);
            } catch (InterruptedException e) {
              e.printStackTrace();
            }
          }
          System.out.println("buzz is completed!");
          return null;
        });
    tasks.add(
        () -> {
          while (System.currentTimeMillis() - start < capacity) {
            try {
              fizzBuzz.fizzbuzz(fizzbuzz);
            } catch (InterruptedException e) {
              e.printStackTrace();
            }
          }
          System.out.println("fizzbuzz is completed!");
          return null;
        });
    tasks.add(
        () -> {
          while (System.currentTimeMillis() - start < capacity) {
            try {
              fizzBuzz.number(number);
            } catch (InterruptedException e) {
              e.printStackTrace();
            }
          }
          System.out.println("number is completed!");
          return null;
        });

    ExecutorService service = Executors.newFixedThreadPool(tasks.size());
    service.invokeAll(tasks);

    service.awaitTermination(2, TimeUnit.SECONDS);

    service.shutdown();

    System.out.println("Result=" + values);
  }
}
