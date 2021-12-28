package tasks;

import runapp.RunApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VolumeOfACuboid {

    public static float volumeOfCuboid(float length, float width, float height) {
        return length * width * height;
    }

    public static void conditionOfTask() {
        System.out.println("Bob needs a fast way to calculate the volume of a cuboid with three values: length, width and the height of the cuboid.\n" +
                " Write a function to help Bob with this calculation.");
    }


    public static void runTask2(BufferedReader reader) throws IOException {
        conditionOfTask();
        try {
            System.out.println("Set length ");
            final float length = Float.parseFloat(new BufferedReader(new InputStreamReader(System.in)).readLine());
            if (length < 0) {
                throw new IllegalArgumentException("Wrong value: Set a non-negative number");
            }
            System.out.println("Set width ");
            final float width = Float.parseFloat(new BufferedReader(new InputStreamReader(System.in)).readLine());
            if (width < 0) {
                throw new IllegalArgumentException("Wrong value: Set a non-negative number");
            }
            System.out.println("Set height ");
            final float height = Float.parseFloat(new BufferedReader(new InputStreamReader(System.in)).readLine());
            if (height < 0) {
                throw new IllegalArgumentException("Wrong value: Set a non-negative number");
            }
            System.out.println("Volume of a Cuboid " + volumeOfCuboid(length, width, height));
            RunApp.repeat(reader);
        } catch (NumberFormatException e) {
            System.out.println("Wrong value: Set digits");
            runTask2(reader);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            runTask2(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
