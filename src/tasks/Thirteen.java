package tasks;

public class Thirteen {
    public static Object countAmount(long m) {
        long total = 0;
        int counter = 0;

        while (total < m) {
            counter++;
            total = total + (long) Math.pow(counter, 3);
        }
        if(m<0) {
            return "You can enter only positive numbers!";
        }
        else if (m == total) return counter;
        else return -1;
    }
}
