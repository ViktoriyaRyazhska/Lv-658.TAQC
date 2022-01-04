package tasks;

import java.io.BufferedReader;
import java.io.IOException;

public class VolumeOfACuboid {

    public static float volumeOfCuboid(float length, float width, float height) {
        return length * width * height;
    }

    public static void runTask2(BufferedReader reader) throws IOException {
        try {
            System.out.println("Set length ");
            final float length = Float.parseFloat(reader.readLine());
            if (length <= 0) {
                throw new IllegalArgumentException("Wrong value: Set a non-negative number");
            }
            System.out.println("Set width ");
            final float width = Float.parseFloat(reader.readLine());
            if (width <= 0) {
                throw new IllegalArgumentException("Wrong value: Set a non-negative number");
            }
            System.out.println("Set height ");
            final float height = Float.parseFloat(reader.readLine());
            if (height <= 0) {
                throw new IllegalArgumentException("Wrong value: Set a non-negative number");
            }
            System.out.println("Volume of a Cuboid: " + volumeOfCuboid(length, width, height));
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
