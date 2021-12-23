package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;

    public class IsDivisible {
        public static int[] divisibleBy(int[] numbers, int div) {
            return Arrays.stream(numbers).filter(i -> (i % div) == 0).toArray();
        }

        public static void task(BufferedReader br) {
            System.out.println("Please, enter number`s quantity:");
            try {
                int size = Integer.parseInt(br.readLine());

                System.out.println("Please, enter numbers:");
                int[] array = new int[size];
                for (int i = 0; i < size; i++) {
                    array[i] = Integer.parseInt(br.readLine());
                }

                System.out.println("Please, enter divisor:");
                int divisor = Integer.parseInt(br.readLine());

                int[] arrayRes = divisibleBy(array, divisor);
                System.out.println("Result is:");
                System.out.println(Arrays.toString(arrayRes));


            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
