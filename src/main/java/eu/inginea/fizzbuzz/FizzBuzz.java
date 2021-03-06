package eu.inginea.fizzbuzz;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 *
 * @author media
 */
public class FizzBuzz {
    
    public static String generate(int toNumber) {
        return IntStream.rangeClosed(1, toNumber)
                .mapToObj(n -> {
                            StringBuilder r = new StringBuilder();
                            if (divisibleBy3(n)) r.append("Fizz");
                            if (divisibleBy5(n)) r.append("Buzz");
                            if (r.length() == 0) r.append(n);
                            return r.toString();
                })
                .reduce("", (r, s) -> r.length() > 0 ? r + "," + s : s);
    }

    private static boolean divisibleBy3(int n) {
        return n % 3 == 0;
    }
    private static boolean divisibleBy5(int n) {
        return n % 5 == 0;
    }
    
    
}
