package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class TheSmallest {
    static int FROM_INDEX_MIN;
    static int TO_INDEX_MIN;
    static int FROM_INDEX_MAX;
    static int TO_INDEX_MAX;

    // split number to chars
    private static List<Integer> numberToChars(int number) {
        List<Integer> chars = new LinkedList<Integer>();
        final int base = 10;

        while (number != 0) {
            chars.add(number % base);
            number /= base;
        }

        Collections.reverse(chars);

        return chars;
    }

    // array to number
    private static int charsToNumber(List<Integer> chars) {
        int number;
        StringBuilder numberString = new StringBuilder();

        for (int i: chars) {
            numberString.append(i);
        }

        number = Integer.parseInt(numberString.toString());

        return number;
    }

    // index of min char
    private static int minCharIndex(List<Integer> chars) {
        int index = chars.indexOf(Collections.min(chars));
        for (int i = chars.size() - 1; i >= 0; i--) {
            if (chars.get(i) == chars.get(index)) {
                index = i;
                break;
            }
        }

        return index;
    }

    // index of max char
    private static int maxCharIndex(List<Integer> chars) {
        int index = chars.indexOf(Collections.max(chars));

        return index;
    }

    // number made by moving min char to the start
    private static int numberMin(List<Integer> chars) {
        int number;
        int index = minCharIndex(chars);
        int i = 0;
        int j = 1;

        while (index == i) {
            do {
                if (index == -1) {
                    index++;
                    j++;
                }
                index = chars.indexOf(chars.get(index) + j);
            } while (index == -1);
            i++;
        }

        chars.add(i, chars.get(index));
        chars.remove(index + 1);
        FROM_INDEX_MIN = index;
        TO_INDEX_MIN = i;

        number = charsToNumber(chars);

        return number;
    }

    // number made by moving max char to the end
    private static int numberMax(List<Integer> chars) {
        int number;
        int index = maxCharIndex(chars);
        chars.add(chars.get(index));
        chars.remove(index);

        FROM_INDEX_MAX = index;
        TO_INDEX_MAX = chars.size() - 1;

        number = charsToNumber(chars);

        return number;
    }

    // compare numberMax and numberMin
    private static List<Integer> findMin(List<Integer> charsMax, List<Integer> charsMin) {
        List<Integer> result = new ArrayList<>();

        int numberMax = numberMax(charsMax);
        int numberMin = numberMin(charsMin);

        if (FROM_INDEX_MIN == 1) {
            FROM_INDEX_MIN = 0;
            TO_INDEX_MIN = 1;
        }

        if (numberMin < numberMax) {
            result.add(0, numberMin);
            result.add(1, FROM_INDEX_MIN);
            result.add(2, TO_INDEX_MIN);
        } else if (numberMin > numberMax) {
            result.add(0, numberMax);
            result.add(1, FROM_INDEX_MAX);
            result.add(2, TO_INDEX_MAX);
        } else if (numberMin == numberMax) {
            if (FROM_INDEX_MIN < FROM_INDEX_MAX) {
                result.add(0, numberMin);
                result.add(1, FROM_INDEX_MIN);
                result.add(2, TO_INDEX_MIN);
            } else {
                result.add(0, numberMax);
                result.add(1, FROM_INDEX_MAX);
                result.add(2, TO_INDEX_MAX);
            }
        }

        return result;
    }

    // validate input
    private static boolean validate(int number) {
        boolean flag = true;
        if (number <= 0) {
            flag = false;
            System.out.println("Error.. number must be positive");
        }

        return flag;
    }

    // output
    private static void output(List<Integer> result) {
        System.out.print("Result: " + result);
    }

    public static void task(BufferedReader reader) {
        System.out.print("Enter a positive number:\n> ");
        try {
            int number = Integer.parseInt(reader.readLine());
            if (validate(number)) {
                output(findMin(numberToChars(number), numberToChars(number)));
            }
        } catch (IOException e) {
            System.out.println("Error.. enter a number plz");
            task(reader);
        }


    }

}
