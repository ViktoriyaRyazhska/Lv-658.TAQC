package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;

public class LookingBenefactor {
    private static Double expectedAmountOfMoney(double[] arr, double averageAmountDonations ) {
        return averageAmountDonations*(arr.length+1) - Arrays.stream(arr).sum();
    }

    public static Double getExpectedAmountOfMoney(double[] arr, double averageAmountDonations ) {
        return expectedAmountOfMoney(arr, averageAmountDonations);
    }

    private static boolean validate(double[] arr, double averageAmountDonations) {
        boolean flag = true;
        if(Arrays.stream(arr).allMatch(i -> i < 0)) {
            flag = false;
            System.out.println("Amount of money mush have positive value");
        }
        return flag;
    }

    public static void task(BufferedReader br) {
        System.out.println("Please, enter the quantity of donations: ");
        int size = 0;
        try {
            size = Integer.parseInt(br.readLine());
            double[] array = new double[size];
            System.out.println("Enter donations: ");
            for (int i = 0; i < size; i++) {
                array[i] = Double.parseDouble(br.readLine());
            }

            System.out.println("Enter the suggested average amount of donations: ");

            int averageAmountDonations = Integer.parseInt(br.readLine());
            if (validate(array, averageAmountDonations)) {
                System.out.println("Next donation must be : "
                        + Math.ceil(expectedAmountOfMoney(array, averageAmountDonations)));
            } else {
                task(br);
            }
        } catch (IOException e) {
            System.out.println("Error.. try again");
            task(br);
        } catch (IllegalArgumentException e) {
            System.out.println("Error.. not a number");
            task(br);
        }
    }
}
