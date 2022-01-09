package tasks;

import java.io.BufferedReader;
import java.io.IOException;

public class VolumeCuboid {

    private static double calculateVolume(double length, double width, double height) {
        double volume;
        volume = length * width * height;
        return volume;
    }


    public static double getCalculateVolume(double length, double width, double height) {
        return calculateVolume(length,width,height);
    }

        public static void task(BufferedReader br) throws IOException {
        System.out.println("Please, enter length, width, height one by one:");

        double length = Double.parseDouble(br.readLine());
        double width = Double.parseDouble(br.readLine());
        double height = Double.parseDouble(br.readLine());
        if (length <= 0 || width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Only Positive Numbers!");
        }
        double volume = calculateVolume(length, width, height);
        System.out.printf("length = %.2f; width = %.2f; height = %.2f ----> volume = %.2f \n", length, width, height, volume);


    }
}
