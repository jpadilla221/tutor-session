import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LastDigitTest {

  int testVarA = 4;
  int testVarB = 24;

  LastDigit lastDigit = new LastDigit();


  @Test
  void lastDigit() {
    assertEquals(true, lastDigit.lastDigit(testVarA, testVarB));
  }


  @Test
  void stringTimes() {
  String input = "roger";
  int input2 = 2;
  String expected = "rogerroger";
  assertEquals(expected, lastDigit.stringTimes(input, input2));

  }

  @Test
  void frontTimes() {
    String input = "chocolate";
   int input2 = 3;
   String expected = "chochocho";
   assertEquals(expected, lastDigit.frontTimes(input,input2));
  }
}