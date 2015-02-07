package eu.inginea.fizzbuzz;

/**
 *
 * @author media
 */
public class FizzBuzz {
    
    public static String generate(int toNumber) {
        if (toNumber == 1) {
            return "1";
        } else if (toNumber == 2) {
            return "1,2";
        }
        return "";
    }
    
}
