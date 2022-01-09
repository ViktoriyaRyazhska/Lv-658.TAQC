package tasks;

public class Eighth {

    public static double TwoDecimalPlaces(double number) {
        number = Math.round(number*100);
        return number/100;
    }
}
