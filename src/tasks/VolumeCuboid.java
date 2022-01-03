package tasks;

import java.io.BufferedReader;
import java.io.IOException;

public class VolumeCuboid {

    public static double calculateVolume(double length, double width, double height) {
        double volume;
        volume = length * width * height;
        return volume;
    }

    public static void task(BufferedReader br) {
        System.out.println("Please, enter sizes:");
        try {
            double length = Double.parseDouble(br.readLine());
            double width = Double.parseDouble(br.readLine());
            double height = Double.parseDouble(br.readLine());
            double volume = calculateVolume(length, width, height);
            if (length < 0 || width < 0 || height < 0) {
                throw new IllegalArgumentException("Only Positive Numbers & no Letters Please!");
            }
            System.out.printf("length = %f; width = %f; height = %f ----> volume = %f", length, width, height, volume);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }




}
