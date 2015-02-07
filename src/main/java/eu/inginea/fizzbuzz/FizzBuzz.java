package eu.inginea.fizzbuzz;

import java.util.stream.IntStream;

/**
 *
 * @author media
 */
public class FizzBuzz {
    
    public static String generate(int toNumber) {
        if (toNumber < 1) {
            return "";
        } else {
            return IntStream.rangeClosed(2, toNumber)
                    .mapToObj(n -> divisibleBy3and5(n) ? "FizzBuzz"
                                : divisibleBy3(n) ? "Fizz"
                                : divisibleBy5(n) ? "Buzz"
                                : String.valueOf(n)
                    )
                    .reduce("1", (r, s) -> r + "," + s);
        }
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
