package tasks;

import java.text.DecimalFormat;

public class Fifteenth {
    public static DecimalFormat formatter = new DecimalFormat("0.######################");

    public static double f(double x) {
        double res = Math.expm1(Math.log1p(x) / 2);
        return Double.parseDouble((formatter.format(res).replace(',','.')));
    }
}
