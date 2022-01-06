package tasks;

public class Thirteen {
    public static long countAmount(long m) {
        long total = 0;
        int counter = 0;

        while (total < m) {
            counter++;
            total = total + (long) Math.pow(counter, 3);
        }

        if (m == total)
            return counter;
        return -1;
    }
}
