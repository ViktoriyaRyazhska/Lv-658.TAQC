package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;

public class LookingBenefactor {
    private static Double expectedAmountOfMoney(double[] arr, double averageAmountDonations) {
        return averageAmountDonations * (arr.length + 1) - Arrays.stream(arr).sum();
    }
    private static double[] arrayInput(BufferedReader br, int sizeOfArray, double[] array) throws IOException {
        for (int i = 0; i < sizeOfArray; i++) {
            array[i] = Double.parseDouble(br.readLine());
        }
        return array;
    }

    public static Double getExpectedAmountOfMoney(double[] arr, double averageAmountDonations) {
        return expectedAmountOfMoney(arr, averageAmountDonations);
    }


    public static void task(BufferedReader br) throws IOException {
        System.out.println("Please, enter the quantity of donations: ");
        int size = Integer.parseInt(br.readLine());
        double[] array = new double[size];
        System.out.println("Enter donations: ");
        arrayInput(br, size, array);
        if (Arrays.stream(array).allMatch(i -> i < 0)) {
            throw new IllegalArgumentException("Amount of money mush have positive value");
        }
        System.out.println("Enter the suggested average amount of donations: ");
        int averageAmountDonations = Integer.parseInt(br.readLine());
        double lastDonat = Math.ceil(expectedAmountOfMoney(array, averageAmountDonations));
        if(lastDonat<0) {
            throw new IllegalArgumentException("Your expectations are not great enough.");
        }
        System.out.println("Next donation must be : " + lastDonat);

    }
}
