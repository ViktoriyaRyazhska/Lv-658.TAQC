package tasks;

public class TwentyFirst {
    public static int zeros(int z)
    {
        int count = 0;// формула ленджара
        for (int i = 5; z / i >= 1; i *= 5)
            count += z / i;
        return count;
    }
}
