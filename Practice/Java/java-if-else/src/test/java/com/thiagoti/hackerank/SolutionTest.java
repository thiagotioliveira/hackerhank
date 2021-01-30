package com.thiagoti.hackerank;

import static com.thiagoti.hackerrank.Solution.NOT_WEIRD;
import static com.thiagoti.hackerrank.Solution.WEIRD;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
  public void test_Weird() {
    provideInput("3");
    Solution.main(new String[0]);
    assertEquals(WEIRD, getOutput());
  }

  @Test
  public void test_Not_Weird() {
    provideInput("24");
    Solution.main(new String[0]);
    assertEquals(NOT_WEIRD, getOutput());
  }

  @Test
  public void test_constraint() {
    assertThrows(RuntimeException.class, () -> {
      provideInput("0");
      Solution.main(new String[0]);
    });
  }

}
