package tasks;

public class First {
    public static String count(double time) {
        if(time<0) return "Please enter positive number";
            int liters = (int) Math.floor(time * 0.5);
            return "" + liters;
    }
}
