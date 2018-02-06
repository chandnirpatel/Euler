import java.util.*;
public class Problem4 {
  public static void main(String args[]) {
    /* A palindromic number reads the same both ways. The largest palindrome
    *  made from the product of two 2-digit numbers is 9009 = 91 × 99.
    *  Find the largest palindrome made from the product of two 3-digit numbers.
    */
    int largestPalindrome = 0;
    for (int i = 100; i < 1000; i++) {
      for(int j = 100; j < 1000; j++) {
        int product = i * j;
        if (isPalindrome(product)) {
          largestPalindrome = Math.max(largestPalindrome, product);
        }
      }
    }
    System.out.println("The answer is " + largestPalindrome);
  }

  private static boolean isPalindrome(int number) {
    String numberAsString = String.valueOf(number);
    String reversedNumber = new StringBuilder(numberAsString).reverse().toString();
    return numberAsString.equals(reversedNumber);
  }
}
