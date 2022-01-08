package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class GapPrimes {

    // create list of prime numbers int gap [from, to]
    private static List<Integer> primes(int from, int to) {
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = from; i <= to; i++) {
            numbers.add(i);
        }
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = numbers.get(i) - 1; j > 1; j--) {
                if (numbers.get(i) % j == 0) {
                    numbers.remove(i);
                    i--;
                    break;
                }
            }
        }

        return numbers;
    }

    // find two prime numbers with step(gap)
    private static List<Integer> findGap(int gap, List<Integer> numbers) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < numbers.size() - 1; i++) {
            if (Math.abs(numbers.get(i) - numbers.get(i + 1)) == gap) {
                result.add(numbers.get(i));
                result.add(numbers.get(i + 1));
                break;
            }
        }

        return result;
    }


    private static String output(int from, int to, int gap) {
        String result = "Result: " + findGap(gap, primes(from, to));

        return result;
    }

    public static String getOutput(int from, int to, int gap){
        return output(from, to, gap);
    }

    public static void task(BufferedReader reader) throws IOException, IllegalArgumentException {
        System.out.print("Enter from-number ( > 2 )\n> ");
        int from = Integer.parseInt(reader.readLine());
        if (from <= 2) {
            throw new IllegalArgumentException("Error.. from-number must be > 2");
        }

        System.out.print("Enter to-number ( >= from-number )\n> ");
        int to = Integer.parseInt(reader.readLine());
        if (to < from) {
            throw new IllegalArgumentException("Error.. to-number must be >= from-number");
        }

        System.out.print("Enter the gap ( >= 2)\n> ");
        int gap = Integer.parseInt(reader.readLine());
        if (gap < 2) {
            throw new IllegalArgumentException("Error.. gap must be >= 2");
        }

        output(from, to, gap);
    }
}
