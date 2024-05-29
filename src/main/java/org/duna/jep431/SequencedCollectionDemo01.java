package org.duna.jep431;

import java.util.ArrayList;
import java.util.SequencedCollection;

public class SequencedCollectionDemo01 {
  public static void main(String[] args){
    SequencedCollection<String> sequenceNames = new ArrayList<>();
    sequenceNames.add("Eduardo");
    sequenceNames.add("Luis");
    sequenceNames.add("Patricia");
    sequenceNames.add("Irene");
    sequenceNames.add("Ulises");
    System.out.println("Sequenced collection:\n"+sequenceNames);

    System.out.println("Get the first and last item:");
    System.out.println(sequenceNames.getFirst());
    System.out.println(sequenceNames.getLast());

    sequenceNames.addFirst("Doroteo");
    sequenceNames.addLast("Simona");
    System.out.println("Add items to the beginning and end:\n"+sequenceNames);

    SequencedCollection<String> reversedSequence = sequenceNames.reversed();
    System.out.println("Reverse order:\n"+reversedSequence);

    sequenceNames.removeFirst();
    sequenceNames.removeLast();
    System.out.println("Remove the first and last item:\n"+sequenceNames);

    System.out.println("ConcurrentModificationException: ");
    for (String nome : sequenceNames) {
      if (nome.contains("Luis")) {
        sequenceNames.removeFirst();
      }
    }

  }
}
