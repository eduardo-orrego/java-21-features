package org.duna.jep431;

import java.util.LinkedHashMap;
import java.util.SequencedMap;

public class SequencedMapDemo01 {
  public static void main(String args[]) {
    SequencedMap<Integer, String> sequenceMapNames = new LinkedHashMap<>();
    sequenceMapNames.put(2, "Eduardo");
    sequenceMapNames.put(3, "Luis");
    sequenceMapNames.put(4, "Patricia");
    sequenceMapNames.put(5, "Irene");
    sequenceMapNames.put(6, "Ulises");
    System.out.println("Sequenced Map:");
    System.out.println(sequenceMapNames);

    System.out.println("Get the first and last item:");
    System.out.println(sequenceMapNames.firstEntry());
    System.out.println(sequenceMapNames.lastEntry());

    sequenceMapNames.putFirst(7, "Doroteo");
    sequenceMapNames.putLast(1, "Simona");
    System.out.println("Add items to the beginning and end:");
    System.out.println(sequenceMapNames);

    SequencedMap<Integer, String> reversedSequenceMap = sequenceMapNames.reversed();
    System.out.println("Reverse order:");
    System.out.println(reversedSequenceMap);

    sequenceMapNames.pollFirstEntry();
    sequenceMapNames.pollLastEntry();
    System.out.println("Remove the first and last item:");
    System.out.println(sequenceMapNames);

    System.out.println("ConcurrentModificationException: ");
    for (String nome : sequenceMapNames.values()) {
      if (nome.contains("Luis")) {
        sequenceMapNames.pollFirstEntry();
      }
    }
  }

}
