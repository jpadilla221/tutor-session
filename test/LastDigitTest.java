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
}