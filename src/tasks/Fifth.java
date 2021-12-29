package tasks;

public class Fifth {
    public static int[] count(int[] input) {
        if (input.length == 0) return new int[]{};
        int count = 0, sum = 0;
        for (int i : input) {
            if (i > 0) count++;
            if (i < 0) sum += i;
        }
        return new int[]{count, sum};

    }
}
