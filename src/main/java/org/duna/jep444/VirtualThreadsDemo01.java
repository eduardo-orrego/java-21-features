package org.duna.jep444;

public class VirtualThreadsDemo01 {
  public static void main(String[] args) throws InterruptedException {
    var virtualThread = Thread.startVirtualThread(() -> {
      System.out.println("JEP 436 Virtual Threads (Second Preview)");
    });

    virtualThread.join();
  }
}
