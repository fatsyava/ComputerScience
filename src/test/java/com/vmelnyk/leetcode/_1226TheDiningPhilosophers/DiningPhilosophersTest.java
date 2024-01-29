package com.vmelnyk.leetcode._1226TheDiningPhilosophers;

import org.junit.jupiter.api.Test;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class DiningPhilosophersTest {

  @Test
  void wantsToEat() throws InterruptedException {
    final int n = 5;
    final int period = 15000;

    List<Runnable> pickLeftForks = new ArrayList<>();
    List<Runnable> pickRightForks = new ArrayList<>();
    List<Runnable> eatForks = new ArrayList<>();
    List<Runnable> putLeftForks = new ArrayList<>();
    List<Runnable> putRightForks = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      int fork = i;
      pickLeftForks.add(
          () -> {
            System.out.println("Philosopher " + fork + " picks left hand fork!");
          });
      pickRightForks.add(
          () -> {
            System.out.println("Philosopher " + fork + " picks right hand fork!");
          });
      eatForks.add(
          () -> {
            System.out.println("Philosopher " + fork + " eats!");
            try {
              Thread.sleep((int) (400 + Math.random() * 400));
            } catch (InterruptedException e) {
              throw new RuntimeException(e);
            }
          });
      putLeftForks.add(
          () -> {
            System.out.println("Philosopher " + fork + " puts left fork back!");
          });
      putRightForks.add(
          () -> {
            System.out.println("Philosopher " + fork + " puts right fork back!");
          });
    }

    DiningPhilosophers diningPhilosophers = new DiningPhilosophers(n);

    final long start = System.currentTimeMillis();
    List<Callable<Void>> tasks = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      int fork = i;
      tasks.add(
          () -> {
            while (System.currentTimeMillis() - start < period) {
              diningPhilosophers.wantsToEat(
                  fork,
                  pickLeftForks.get(fork),
                  pickRightForks.get(fork),
                  eatForks.get(fork),
                  putLeftForks.get(fork),
                  putRightForks.get(fork));
            }
            return null;
          });
    }

    tasks.add(
        () -> {
          while (System.currentTimeMillis() - start < period) {
            System.out.println("Thread's deadlock detection!");

            ThreadMXBean bean = ManagementFactory.getThreadMXBean();
            long[] threadIds =
                bean.findDeadlockedThreads(); // Returns null if no threads are deadlocked.

            if (threadIds != null) {
              System.out.println(
                  "Detected " + Arrays.toString(threadIds) + " threads deadlock(s).");

              /*ThreadInfo[] infos = bean.getThreadInfo(threadIds);

              for (ThreadInfo info : infos) {
                StackTraceElement[] stack = info.getStackTrace();
                // Log or store stack trace information.
              }*/
            }

            Thread.sleep(5000);
          }
          return null;
        });

    ExecutorService service = Executors.newFixedThreadPool(tasks.size());
    service.invokeAll(tasks);

    service.awaitTermination(2, TimeUnit.SECONDS);

    service.shutdown();
  }
}
