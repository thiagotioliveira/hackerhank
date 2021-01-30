package com.thiagoti.hackerank;

import static com.thiagoti.hackerrank.Solution.NOT_WEIRD;
import static com.thiagoti.hackerrank.Solution.WEIRD;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.thiagoti.hackerrank.Solution;

public class SolutionTest {

  private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

  @BeforeEach
  public void setUp() {
    System.setOut(new PrintStream(outputStreamCaptor));
  }

  @Test
  public void test_Weird() {
    Solution.main(new String[] { "3" });
    assertEquals(WEIRD, outputStreamCaptor.toString());
  }

  @Test
  public void test_Not_Weird() {
    Solution.main(new String[] { "24" });
    assertEquals(NOT_WEIRD, outputStreamCaptor.toString());
  }

  @Test
  public void test_constraint() {
    assertThrows(RuntimeException.class, () -> Solution.main(new String[] { "0" }));
  }

}
