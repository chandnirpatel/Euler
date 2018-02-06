import java.util.*;

public class Problem3 {
  /* The prime factors of 13195 are 5, 7, 13 and 29.
  *  What is the largest prime factor of the number 600851475143?
  */
  public static void main(String[] args) {
    long numberToFactor = 600_851_475_143L;
    long maxPrime = 0L;

    for (long testFactor = 2; testFactor <= numberToFactor; testFactor++ ) {
      while (numberToFactor % testFactor == 0) {
        maxPrime = testFactor;
        numberToFactor = numberToFactor / testFactor;
      }
    }

    System.out.println("max prime factor of 600851475143 is " + maxPrime);
  }
}
