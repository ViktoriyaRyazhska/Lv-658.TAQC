package tasks;

public class Fifteenth {

    public static double f(double x) {
        double res = Math.sqrt(1 + x) - 1;
        return res;
    }

    public static void main(String[] args) {
        System.out.println(f(2.6e-08));
    }

}
