package org.duna.jep444;

import java.time.Duration;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class VirtualThreadsDemo02 {
  public static void main(String[] args) {
    //It will run 10k tasks on virtual threads taking less than 1 second on modern CPUs.
    try (var taskExecutor = Executors.newVirtualThreadPerTaskExecutor()) {
      IntStream.range(0, 10_000).forEach(n ->
        taskExecutor.submit(() -> {
          Thread.sleep(Duration.ofSeconds(1));
          return n;
        })
      );
    }
  }
}
