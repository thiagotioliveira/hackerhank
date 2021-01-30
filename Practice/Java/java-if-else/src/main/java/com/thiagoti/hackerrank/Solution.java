package com.thiagoti.hackerrank;

import java.util.Scanner;

public class Solution {

  public static final String WEIRD = "Weird";

  public static final String NOT_WEIRD = "Not Weird";

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    final int N = scanner.nextInt();

    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
    scanner.close();

    if (N < 1 || N > 100) {
      throw new RuntimeException();
    }

    if (N % 2 != 0) {
      System.out.print(WEIRD);
    } else if (N >= 2 && N <= 5) {
      System.out.print(NOT_WEIRD);
    } else if (N >= 6 && N <= 20) {
      System.out.print(WEIRD);
    } else if (N >= 20) {
      System.out.print(NOT_WEIRD);
    }

  }

}
