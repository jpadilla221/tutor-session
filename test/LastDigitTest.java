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
}