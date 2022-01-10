package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;

public class LookingBenefactor {
    private static Double expectedAmountOfMoney(double[] arr, double averageAmountDonations) {
        return averageAmountDonations * (arr.length + 1) - Arrays.stream(arr).sum();
    }

    public static Double getExpectedAmountOfMoney(double[] arr, double averageAmountDonations) {
        return expectedAmountOfMoney(arr, averageAmountDonations);
    }

    public static void task(BufferedReader br) throws IOException {
        System.out.println("Please, enter the quantity of donations: ");
        int size = Integer.parseInt(br.readLine());

        double[] array = new double[size];
        System.out.println("Enter donations: ");
        for (int i = 0; i < size; i++) {
            array[i] = Double.parseDouble(br.readLine());
        }
        if (Arrays.stream(array).allMatch(i -> i < 0)) {
            throw new IllegalArgumentException("Amount of money mush have positive value");
        }

        System.out.println("Enter the suggested average amount of donations: ");
        int averageAmountDonations = Integer.parseInt(br.readLine());
        System.out.println("Next donation must be : "
                    + Math.ceil(expectedAmountOfMoney(array, averageAmountDonations)));

    }
}
