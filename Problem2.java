import java.util.*;
public class Problem2 {
  public static void main(String[] args) {
    final long MAX_FIB_NUMBER = 4_000_000L;
    long sumOfEvenFibNumbers = 0L;
    List<Long> evenFibNumbers = new ArrayList<>();

    for (long firstTerm = 1L, secondTerm = 2L; secondTerm <= MAX_FIB_NUMBER;) {
      if (secondTerm % 2 == 0) {
        evenFibNumbers.add(secondTerm);
      }

      long sum = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = sum;
    }

    for (long fibNumber : evenFibNumbers) {
      sumOfEvenFibNumbers += fibNumber;
    }

    System.out.println("The answer is " + sumOfEvenFibNumbers);
  }
}
