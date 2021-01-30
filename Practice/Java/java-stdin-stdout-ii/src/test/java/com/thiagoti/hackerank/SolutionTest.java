package com.thiagoti.hackerank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.thiagoti.hackerrank.Solution;

public class SolutionTest {

  private final InputStream systemIn = System.in;

  private final PrintStream systemOut = System.out;

  private ByteArrayInputStream testIn;

  private ByteArrayOutputStream testOut;

  @BeforeEach
  public void setUpOutput() {
    testOut = new ByteArrayOutputStream();
    System.setOut(new PrintStream(testOut));
  }

  private void provideInput(String data) {
    testIn = new ByteArrayInputStream(data.getBytes());
    System.setIn(testIn);
  }

  private String getOutput() {
    return testOut.toString();
  }

  @AfterEach
  public void restoreSystemInputOutput() {
    System.setIn(systemIn);
    System.setOut(systemOut);
  }

  @Test
  public void test() {
    final String inputInt = "42";
    final String inputDouble = "3.1415";
    final String inputString = "Welcome to HackerRank's Java tutorials!";

    provideInput(String.format("%s\r\n%s\r\n%s\r\n", inputInt, inputDouble, inputString));
    Solution.main(new String[0]);
    assertEquals(
        String.format("String: %s\r\nDouble: %s\r\nInt: %s\r\n", inputString, inputDouble, inputInt),
        getOutput());
  }

}
