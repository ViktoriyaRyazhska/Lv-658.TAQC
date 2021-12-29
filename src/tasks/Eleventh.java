package tasks;

import java.text.DecimalFormat;

public class Eleventh {
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static String seriesSum(int n) {
        double sum = 0;
        int increment = 1;

        for (int i = 1; i <= n; i++) {
            sum += 1.0 / increment;
            increment += 3;
        }
        return df.format(sum).replace(',', '.');
    }
}
