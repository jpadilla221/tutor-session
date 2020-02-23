public class LastDigit {

/*  Given two non-negative int values, return true if they have the same last digit,
such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.*/
  public boolean lastDigit(int a, int b) {
    int lastDigitOfA = a % 10;
    int lastDigitOfB = b % 10;
    if (lastDigitOfA == lastDigitOfB) {
      return true;
    } else {
      return false;
    }
  }


 /* Given a string and a non-negative int n, return a larger string that is n copies of the original string.*/
  public String stringTimes(String str, int n) {

    String output = "";
    for (int i = 0; i < n; i++) {
      output = output + str;
    }
    return output;
  }

}



