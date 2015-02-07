package eu.inginea.fizzbuzz;

import java.util.stream.IntStream;

/**
 *
 * @author media
 */
public class FizzBuzz {
    
    public static String generate(int toNumber) {
        return IntStream.rangeClosed(1, toNumber)
                .mapToObj(n -> (divisibleBy3and5(n) ? "FizzBuzz"
                            : divisibleBy3(n) ? "Fizz"
                            : divisibleBy5(n) ? "Buzz"
                            : String.valueOf(n))
                )
                .reduce("", (r, s) -> r.length() > 0 ? r + "," + s : s);
    }

    private static boolean divisibleBy3and5(int n) {
        return divisibleBy3(n) && divisibleBy5(n);
    }
    private static boolean divisibleBy3(int n) {
        return n % 3 == 0;
    }
    private static boolean divisibleBy5(int n) {
        return n % 5 == 0;
    }
    
    
}
