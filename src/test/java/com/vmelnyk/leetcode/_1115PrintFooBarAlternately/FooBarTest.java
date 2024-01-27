package com.vmelnyk.leetcode._1115PrintFooBarAlternately;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

import static org.junit.jupiter.api.Assertions.*;

class FooBarTest {

  @Test
  void foo() throws InterruptedException {
    AtomicBoolean running = new AtomicBoolean(true);

    Runnable printFoo =
            () -> {
              System.out.println("foo");
            };
    Runnable printBar =
            () -> {
              System.out.println("bar");
            };

    FooBar foo = new FooBar(4);

    ExecutorService service = Executors.newFixedThreadPool(2);

    List<Callable<Void>> tasks = new ArrayList<>();
    tasks.add(
            () -> {
              try {
                foo.foo(printFoo);
              } catch (InterruptedException e) {
                e.printStackTrace();
              }

              return null;
            });
    tasks.add(
            () -> {
              try {
                foo.bar(printBar);
              } catch (InterruptedException e) {
                e.printStackTrace();
              }

              return null;
            });

    service.invokeAll(tasks);

    Thread.sleep(3000);

    running.set(true);
    service.awaitTermination(5, TimeUnit.SECONDS);

    service.shutdown();

  }
}
