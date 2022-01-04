package tasks;

import java.io.BufferedReader;
import java.io.IOException;

public class VolumeCuboid {

    private static double calculateVolume(double length, double width, double height) {
        double volume;
        volume = length * width * height;
        return volume;
    }

    private static boolean validate(double length, double width, double height) {
        boolean flag = true;
        if (length <= 0 || width <= 0 || height <= 0) {
            flag = false;
            System.out.println("Only Positive Numbers!");
        }
        return flag;
    }

    public static void task(BufferedReader br) {
        System.out.println("Please, enter length, width, height one by one:");
        try {
            double length = Double.parseDouble(br.readLine());
            double width = Double.parseDouble(br.readLine());
            double height = Double.parseDouble(br.readLine());
            if (validate(length, width,height)) {
                double volume = calculateVolume(length, width, height);
                System.out.printf("length = %.2f; width = %.2f; height = %.2f ----> volume = %.2f \n", length, width, height, volume);
            }
            else {
                task(br);
            }
        } catch (IOException e) {
            System.out.println("Error. Try again.");
            task(br);
        } catch (IllegalArgumentException e) {
            System.out.println("Just integers & No Letters Please!");
            task(br);
        }
    }
}