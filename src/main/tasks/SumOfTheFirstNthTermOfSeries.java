package tasks;
import java.util.Scanner;

public class SumOfTheFirstNthTermOfSeries {
    public static String seriesSum(int n) {
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += 1.0 / (1 + 3 * i);
//            System.out.println(i);
        }
        return String.format("%.2f", sum);
    }

    public static void runTask11(BufferedReader reader) throws IOException {
        System.out.println("Type number 0-9:");
        boolean bool = true;
        while (bool){
            try{
                int i = Integer.parseInt(reader.readLine());
                System.out.println("Sum of following series upto nth term(parameter) "+seriesSum(i));
                System.out.println("Thanks");
                bool=false;
            }catch (Exception ex){
                System.out.println(ex.getMessage()+"Type only integer number 0-9:");
            }
        }

    }
}
