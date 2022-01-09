package tasks;

import java.util.Arrays;

public class TwentyFourth {

    public static long[] smallest(long n) {
        long[] result = new long[3];

        char[] numbers = Long.toString(n).toCharArray();

        Long tempNumbers = n;

        for (int l = 0; l < numbers.length; l++) {

            for (int m = 0; m < numbers.length; m++) {

                if (l == m) {
                    continue;
                }

                if (l < m) {
                    for (int i = l; i < m; i++) {

                        char temp = numbers[i];
                        numbers[i] = numbers[i + 1];
                        numbers[i + 1] = temp;
                    }
                }
                else if (l > m) {
                    for (int i = l; i > m; i--) {

                        char temp = numbers[i];
                        numbers[i] = numbers[i - 1];
                        numbers[i - 1] = temp;
                    }
                }


                if (Long.parseLong(Arrays.toString(numbers)
                        .replace(",", "")
                        .replace(" ", "")
                        .replace("[", "")
                        .replace("]", "")) < tempNumbers) {

                    result[0] = Long.parseLong(Arrays.toString(numbers)
                            .replace(",", "")
                            .replace(" ", "")
                            .replace("[", "")
                            .replace("]", ""));

                    tempNumbers = result[0];
                    result[1] = l;
                    result[2] = m;
                }

                numbers = Long.toString(n).toCharArray();
            }
        }

        return result;
    }
}
