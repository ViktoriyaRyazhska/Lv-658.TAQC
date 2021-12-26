package tasks;

import javax.management.InvalidAttributeValueException;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;

public class LookingBenefactor {
    private static Double lookingForBenefactor(double[] arr, int n ) {
        return n*(arr.length+1) - Arrays.stream(arr).sum();
    }

    public static void task(BufferedReader br) {
        try {
            System.out.println("Please, enter the quantity of donations: ");
            int size = Integer. parseInt(br.readLine());

            double[] array = new double[size];
            System.out.println("Enter donations: ");
            for(int i=0; i<size; i++)
            {
                array[i]=Double.parseDouble(br.readLine());
            }

            System.out.println("Enter the suggested average amount of donations: ");

            int averageAmountDonations = Integer. parseInt(br.readLine());
            if(Math.ceil(lookingForBenefactor(array,averageAmountDonations)) <= 0)
                throw new InvalidAttributeValueException("Last donation has forbiden value...");
            else
                System.out.println("Next donation must be : "
                        + Math.ceil(lookingForBenefactor(array,averageAmountDonations)));

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidAttributeValueException e) {
            System.out.println(e.getMessage());
        }
    }
}
