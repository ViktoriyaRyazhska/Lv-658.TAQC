package tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

    // output result
    private static void output(int from, int to, int gap) {
        System.out.println("Result: " + findGap(gap, primes(from, to)));
    }

    // to verify input data
    private static boolean validate(int from, int to, int gap) {
        boolean flag = true;
        if (from <= 2) {
            flag = false;
            System.out.println("Error.. from-number must be > 2");
        }
        if (to < from) {
            flag = false;
            System.out.println("Error.. to-number must be >= from-number");
        }
        if (gap < 2) {
            flag = false;
            System.out.println("Error.. gap must be >= 2");
        }

        return flag;
    }

    // Only for tests
    public static List<Integer> getFindGap(int gap, List<Integer> numbers) {
        return findGap(gap, numbers);
    }

    public static List<Integer> getPrimes(int from, int to) {
        return primes(from, to);
    }
    // --------------



    public static void task(Scanner scanner) {
        System.out.print("Enter from-number ( > 2 )\n> ");
        int from = scanner.nextInt();
        System.out.print("Enter to-number ( >= from-number )\n> ");
        int to = scanner.nextInt();
        System.out.print("Enter the gap ( >= 2)\n> ");
        int gap = scanner.nextInt();
        if (validate(from, to, gap)) {
            output(from, to, gap);
        } else {
            task(scanner);
        }
    }
}
