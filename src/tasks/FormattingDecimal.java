package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.DecimalFormat;

public class FormattingDecimal {
    private static Double formatting( double number) {
        DecimalFormat df = new DecimalFormat("####0.00");
        return  Double.valueOf(df.format(number));
    }

    public static Double getFormatting(double number) {
        return formatting(number);
    }

    public static void task(BufferedReader br) throws IOException {
        System.out.println("Please, enter number:");
        double inputNumber = 0;

        inputNumber = Double.parseDouble(br.readLine());
        if (inputNumber % 1 == 0) {
           throw new IllegalArgumentException("Error.. number must be double, you inputed integer");
        }
        Double formattingNumber = formatting(inputNumber);
        System.out.println("Result is:" + formattingNumber);

    }
}
