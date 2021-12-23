package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.DecimalFormat;

public class FormattingDecimal {
    public static Double formatting( double number) {
        DecimalFormat df = new DecimalFormat("####0.00");
        return  Double.valueOf(df.format(number));
    }
    public static void task(BufferedReader br) {
        try {
            System.out.println("Please, enter numbers:");
            double inputNumber = Double.parseDouble(br.readLine());
            Double formattingNumber = formatting(inputNumber);
            System.out.println("Result is:");
            System.out.println(formattingNumber);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
