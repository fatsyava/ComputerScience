package com.vmelnyk.leetcode._1117BuildingH2O;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class H2OTest {

  @Test
  void h20() throws InterruptedException {

    final long start = System.currentTimeMillis();
    final long capacity = 5;

    List<Character> values = new ArrayList<>();

    H2O foo = new H2O();

    List<Callable<Void>> tasks = new ArrayList<>();
    Runnable hydrogen =
        () -> {
          values.add('H');
        };
    Runnable oxygen =
        () -> {
          values.add('O');
        };

    tasks.add(
        () -> {
          while (System.currentTimeMillis() - start < capacity) {
            try {
              foo.hydrogen(hydrogen);
            } catch (InterruptedException e) {
              e.printStackTrace();
            }
          }
            System.out.println("Hydrogen is completed!");
          return null;
        });
    tasks.add(
        () -> {
          while (System.currentTimeMillis() - start < capacity) {
            try {
              foo.oxygen(oxygen);
            } catch (InterruptedException e) {
              e.printStackTrace();
            }
          }
          System.out.println("Oxygen is completed!" );
          return null;
        });
    tasks.add(
        () -> {
          while (System.currentTimeMillis() - start < capacity) {
            try {
              foo.hydrogen(hydrogen);
            } catch (InterruptedException e) {
              e.printStackTrace();
            }
          }
          System.out.println("Hydrogen is completed!" );
          return null;
        });

    ExecutorService service = Executors.newFixedThreadPool(tasks.size());
    service.invokeAll(tasks);

    service.awaitTermination(2, TimeUnit.SECONDS);

    service.shutdown();

    System.out.println("Result=" + values);
  }
}
