package org.duna.jep431;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.SequencedSet;

public class SequencedSetDemo01 {
  public static void main(String[] args) {
    SequencedSet<Integer> sequencedSetNumbers = new LinkedHashSet<>(List.of(2, 3, 4));
    System.out.println("Sequenced set:");
    System.out.println(sequencedSetNumbers);

    System.out.println("Get the first and last item:");
    System.out.println(sequencedSetNumbers.getFirst());
    System.out.println(sequencedSetNumbers.getLast());

    sequencedSetNumbers.addFirst(5);
    sequencedSetNumbers.addLast(1);
    System.out.println("Add items to the beginning and end:");
    System.out.println(sequencedSetNumbers);

    SequencedSet<Integer> reversedSequence = sequencedSetNumbers.reversed();
    System.out.println("Reverse order:");
    System.out.println(reversedSequence);

    sequencedSetNumbers.removeFirst();
    sequencedSetNumbers.removeLast();
    System.out.println("Remove the first and last item:");
    System.out.println(sequencedSetNumbers);

    System.out.println("ConcurrentModificationException: ");
    for (Integer number : sequencedSetNumbers) {
      if (number.equals(2)) {
        sequencedSetNumbers.removeFirst();
      }
    }
  }
}
