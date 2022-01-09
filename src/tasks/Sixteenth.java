package tasks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Sixteenth {

    public static double mean(String town, String strng) {

        String[] townsAndRecords = strng.split("\n");

        Map<String, String> data = new HashMap<>();

        for (int i = 0; i < townsAndRecords.length; i++) {
            data.put(townsAndRecords[i].split(":")[0], townsAndRecords[i].split(":")[1]);
        }

        String rainfallsInTown = data.get(town);

        String[] rainfallsByMonths;

        try {
            rainfallsByMonths = rainfallsInTown.split(",");
        }catch (NullPointerException e) {
            System.out.println("There is no town with this name!");
            return -1;
        }

        double avg = Arrays.stream(rainfallsByMonths)
                .map(str -> str.substring(str.indexOf(" ")).replace(" ", ""))
                .mapToDouble(Double::parseDouble)
                .average()
                .orElse(-1);

        return avg;
    }

    public static double variance(String town, String strng) {

        String[] townsAndRecords = strng.split("\n");

        Map<String, String> data = new HashMap<>();

        for (int i = 0; i < townsAndRecords.length; i++) {
            data.put(townsAndRecords[i].split(":")[0], townsAndRecords[i].split(":")[1]);
        }

        String rainfallsInTown = data.get(town);

        String[] rainfallsByMonths;

        try {
            rainfallsByMonths = rainfallsInTown.split(",");
        }catch (NullPointerException e) {
            return -1;
        }

        double variance = Arrays.stream(rainfallsByMonths)
                .map(str -> str.substring(str.indexOf(" ")).replace(" ", ""))
                .mapToDouble(Double::parseDouble)
                .map(d -> Math.pow(d - mean(town, strng), 2))
                .average()
                .orElse(-1);

        return variance;
    }
}
