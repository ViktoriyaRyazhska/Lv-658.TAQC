package tasks;

import java.text.DecimalFormat;

public class Fifteenth {
    public static DecimalFormat formatter = new DecimalFormat("#.###########E00");

    public static double f(double x) {
        double res = Math.sqrt(1 + x) - 1;
        System.out.println(formatter.format(res));
        return res;
    }
}
