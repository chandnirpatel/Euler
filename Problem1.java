import java.util.*;

public class Problem1 {
  /* Problem 1 from Project Euler
  *  If we list all the natural numbers below 10 that
  *  are multiples of 3 or 5, we get 3, 5, 6 and 9.
  *  The sum of these are multiples of 23.
  *  Find the sum of all multiples of 3 or 5 below 1000.
  */

  public static void main(String[] args) {
    Integer valueToFactor = 1000;
    Set<Integer> multiples = new HashSet<Integer>();
    for(int testFactor = 2; testFactor < valueToFactor; testFactor++) {
      if (testFactor % 3 == 0 || testFactor % 5 == 0) {
        multiples.add(testFactor);
      }
    }

    Integer sumOfFactors = 0;
    for(Integer factor : multiples) {
      sumOfFactors += factor;
    }

    System.out.println(sumOfFactors);

  }
}
