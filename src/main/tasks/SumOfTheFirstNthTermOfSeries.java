package tasks;
import java.unit.Scanner;

public class SumOfTheFirstNthTermOfSeries {
    public static String seriesSum(int n) {
        float result = 1.0f;
        float baseNum = 1.0f;
        if (n <= 0) result = 0;
        else {
            for (int i = 1; i < n; i++) {
                baseNum = baseNum + 3;
                result += 1.0 / baseNum;
            }
        }
        return String.format("%.2f", result);
    }

    public static void main(String args[]){
        System.out.println("press number 0-9:");
        Scanner Scan = new Scanner(System.in);
        int input1 = Scan.nextInt();
        System.out.println(seriesSum(input1));

    }
}
