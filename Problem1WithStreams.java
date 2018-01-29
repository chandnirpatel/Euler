import java.util.function.IntBinaryOperator;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class Problem1WithStreams {
    public static void main(String[] args) {
        final int MAX_MULTIPLE = 1000;
        final int MIN_MULTIPLE = 2;

        int sumOfMultiples = IntStream.range(MIN_MULTIPLE, MAX_MULTIPLE)
                .filter(getMultiplesOf5Or3())
                .reduce(0, addMultiples());

        System.out.println(sumOfMultiples);
    }

    private static IntPredicate getMultiplesOf5Or3() {
        return i -> i % 3 == 0 || i % 5 == 0;
    }

    private static IntBinaryOperator addMultiples() {
      return (x, y) -> x + y;
    }
}
