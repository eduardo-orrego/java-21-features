package org.duna.jep440;

public class RecordPatternDemo01 {
  record Point(int x, int y) { }

  public static void main(String[] args){
    Point point = new Point(1,2);
    printSum(point);
  }

  public static void printSum(Object o) {
    if (o instanceof Point(int x, int y)) {
      System.out.println(x + y);
    }
  }
}
