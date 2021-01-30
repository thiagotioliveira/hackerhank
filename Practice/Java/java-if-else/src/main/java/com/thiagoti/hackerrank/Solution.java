package com.thiagoti.hackerrank;

public class Solution {

  public static final String WEIRD = "Weird";

  public static final String NOT_WEIRD = "Not Weird";

  public static void main(String[] args) {

    Integer value = Integer.valueOf(args[0]);

    if (value < 1 || value > 100) {
      throw new RuntimeException();
    }

    if (value % 2 != 0) {
      System.out.print(WEIRD);
    } else if (value >= 2 && value <= 5) {
      System.out.print(NOT_WEIRD);
    } else if (value >= 6 && value <= 20) {
      System.out.print(WEIRD);
    } else if (value >= 20) {
      System.out.print(NOT_WEIRD);
    }

  }

}
