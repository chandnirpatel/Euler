import java.util.*;

public class Problem1 {
  /* Problem 1 from Project Euler
  *  If we list all the natural numbers below 10 that
  *  are multiples of 3 or 5, we get 3, 5, 6 and 9.
  *  The sum of these are multiples of 23.
  *  Find the sum of all multiples of 3 or 5 below 1000.
  */

  public static void main(String[] args) {
    final Integer MAX_MULTIPLE = 1000;
    final Integer MIN_MULTIPLE = 2;
    Collection<Integer> multiples = getMultiplesOfThreeOrFive(MIN_MULTIPLE, MAX_MULTIPLE);

    System.out.println(sumOfMultiples(multiples));
  }

  private static Set<Integer> getMultiplesOfThreeOrFive(Integer MIN_MULTIPLE, Integer MAX_MULTIPLE) {
    Set<Integer> multiples = new HashSet<Integer>();

    for(Integer testInteger = MIN_MULTIPLE; testInteger < MAX_MULTIPLE; testInteger++) {
      if (isMultipleOfThreeOrFive(testInteger)) {
        multiples.add(testInteger);
      }
    }

    return multiples;

  }

  private static boolean isMultipleOfThreeOrFive(int testInteger) {
    return testInteger % 3 == 0 || testInteger % 5 == 0;
  }

  private static Long sumOfMultiples(Collection<Integer> collection) {
    Long sum = 0L;
    for(Integer integer : collection) {
      sum += integer;
    }
    return sum;
  }
}
