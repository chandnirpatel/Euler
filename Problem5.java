import java.util.*;

public class Problem5 {
  /* 2520 is the smallest number that can be divided by each of the numbers
  *  from 1 to 10 without any remainder.What is the smallest positive number
  *  that is evenly divisible by all of the numbers from 1 to 20?
  */

    public static void main(String[] args) {
        final Integer MAX_NUMBER = 20;

        Map<Integer, Integer> superSetOfPrimeFactors = new HashMap<>();
        for (int i = 2; i <= MAX_NUMBER; i++) {
            List<Integer> primeFactors = getPrimeFactorization(i);
            superSetOfPrimeFactors = updateSuperSetOfPrimeFactors(primeFactors, superSetOfPrimeFactors);
        }

        Double answer = 1.0;
        for (Integer factor : superSetOfPrimeFactors.keySet()) {
            answer *= Math.pow(factor, superSetOfPrimeFactors.get(factor));
        }
        System.out.printf("The answer is: %.0f", answer);
    }

    private static List<Integer> getPrimeFactorization(int numberToFactor) {
        List<Integer> primeFactors = new ArrayList<>();
        for (int testFactor = 2; testFactor <= numberToFactor; testFactor++) {
            while (numberToFactor % testFactor == 0) {
                primeFactors.add(testFactor);
                numberToFactor = numberToFactor / testFactor;
            }
        }
        return primeFactors;
    }

    private static Map<Integer, Integer> updateSuperSetOfPrimeFactors(List<Integer> factors, Map<Integer, Integer> masterList) {
        Map<Integer, Integer> factorMap = makeFactorMap(factors);
        if (masterList == null) {
            return factorMap;
        }

        for (Integer factor : factorMap.keySet()) {
            if (masterList.containsKey(factor)) {
                masterList.replace(factor, Math.max(masterList.get(factor), factorMap.get(factor)));
            } else {
                masterList.put(factor, factorMap.get(factor));
            }
        }
        return masterList;

    }

    private static Map<Integer, Integer> makeFactorMap(List<Integer> factors) {
        HashMap<Integer, Integer> factorMap = new HashMap<>();
        for (Integer factor : factors) {

            if (factorMap.containsKey(factor)) {
                factorMap.replace(factor, factorMap.get(factor) + 1);
            } else {
                factorMap.put(factor, 1);
            }
        }
        return factorMap;
    }

}
