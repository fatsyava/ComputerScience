package com.vmelnyk.leetcode._1114PrintInOrder;

import org.junit.jupiter.api.Test;

import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class FooTest {

  @Test
  void foo() throws InterruptedException {
    Runnable printFirst =
        () -> {
          System.out.println("first");
        };
    Runnable printSecond =
        () -> {
          System.out.println("second");
        };
    Runnable printThird =
        () -> {
          System.out.println("third");
        };

    Foo foo = new Foo();

    ExecutorService service = Executors.newFixedThreadPool(6);

    List<Callable<Void>> tasks = new ArrayList<>();
      tasks.add(
              () -> {
                  try {
                      foo.first(printFirst);
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }

                  return null;
              });
      tasks.add(
              () -> {
                  try {
                      foo.second(printSecond);
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }

                  return null;
              });
      tasks.add(
              () -> {
                  try {
                      foo.third(printThird);
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }

                  return null;
              });
      tasks.add(
              () -> {
                  try {
                      foo.first(printFirst);
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }

                  return null;
              });
      tasks.add(
              () -> {
                  try {
                      foo.second(printSecond);
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }

                  return null;
              });
      tasks.add(
              () -> {
                  try {
                      foo.third(printThird);
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }

                  return null;
              });

      service.invokeAll(tasks);

      service.awaitTermination(5, TimeUnit.SECONDS);

      service.shutdown();

  }
}
