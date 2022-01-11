package tasks;

import java.util.Arrays;
import java.util.List;

public class Nineteenth {
    public static List<String> takeUmbrella = Arrays.asList("thunderstorms", "rainy");

    public static int minUmbrellas(String[] weather) {
        int homeCounter = 0;
        int workCounter = 0;
        for (int i = 0; i < weather.length; i++) {
            if (takeUmbrella.contains(weather[i])) {
                if (i % 2 == 0) {
                    homeCounter++;
                } else {
                    workCounter++;
                }
            }
        }
        if (homeCounter == workCounter && homeCounter != 0) {
            return 1;
        } else
            return Math.abs(homeCounter - workCounter);
    }
}
