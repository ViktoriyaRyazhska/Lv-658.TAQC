package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.DecimalFormat;

public class FormattingDecimal {
    private static Double formatting( double number) {
        DecimalFormat df = new DecimalFormat("####0.00");
        return  Double.valueOf(df.format(number));
    }

    public static Double getFormatting(double number)
    {
        return formatting(number);
    }

    private static boolean validate(double n) {
        boolean flag = true;
        if (n % 1 == 0) {
            flag = false;
            System.out.println("Error.. number must be double, you inputed integer");
        }
       return flag;
    }
    public static void task(BufferedReader br) throws IOException {
        System.out.println("Please, enter numbers:");
        double inputNumber = Double.parseDouble(br.readLine());
        if(validate(inputNumber)) {
            Double formattingNumber = formatting(inputNumber);
            System.out.println("Result is:" + formattingNumber);
        }
        else
        {
            task(br);
        }
    }
}
