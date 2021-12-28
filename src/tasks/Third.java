package tasks;

import java.text.DecimalFormat;

public class Third {
    final static double converter = 1.609344/4.54609181; //0.35400605
    private static final DecimalFormat df = new DecimalFormat("#.##");

    public static float mpgToKPM(final float mpg) {
        return Float.parseFloat(df.format(mpg*converter).replace(',','.'));
    }
}
