package tasks;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

public class Fourteenth {

                                                                                        //Easy balance checking

//    Input string: 1000.00
//    125 Market !=:125.45 \n126 Hardware =34.95 \n127 Video! 7.45 \n128 Book :14.32 \n129 Gasoline ::16.10
//    Expected output:
//            "Original_Balance:_1000.00
//            125_Market_125.45_Balance_874.55
//            126_Hardware_34.95_Balance_839.60
//            127_Video_7.45_Balance_832.15
//            128_Book_14.32_Balance_817.83
//            129_Gasoline_16.10_Balance_801.73
//            Total_expense__198.27
//            Average_expense__39.65"

    public static String[] getElementsOfCheckBookFromUserInput(String str) {
        String[] arr = new String[1];
        arr[0] = " No data for making a report";
        if (!str.equals(""))
            return str.split(Pattern.quote("\\n"));
        return arr;
    }

    public static String[] deleteRedundantSymbolsFromArr(String[] values) {
        ArrayList<String> cleanedValues = new ArrayList<>(Arrays.asList(values));
        cleanedValues.replaceAll(e -> e.replaceAll("[^.a-zA-Z0-9\s]", ""));
        String[] arrayOfCleanedValues = new String[cleanedValues.size()];
        cleanedValues.toArray(arrayOfCleanedValues);
        return arrayOfCleanedValues;
    }


    public static String[] createCheckAmountList(String[] values) {
        String[] check;
        String str;
        String[] check2 = new String[values.length];
        for (int i = 0; i < values.length; i++) {
            check = values[i].split("\s");
            str = check[2];
            check2[i] = str;
        }
        return check2;
    }


    public static String getOriginalBalance(double originalBalance) {
        if (originalBalance <= 0) return ("Please enter only positive numbers!");
        final DecimalFormat df = new DecimalFormat("0.00");
        return "\"Original Balance: " + df.format(originalBalance).replace(',', '.');
    }


    public static String[] getNewBalance(double[] checkAmount, double originalBalance) {
        final DecimalFormat df = new DecimalFormat("0.00");
        String[] readyBalance = new String[checkAmount.length];
        double previousBalance = 0;
        double newBalance;
        double nextBalance;
        for (double v : checkAmount) {
            newBalance = originalBalance - v;
            previousBalance = newBalance;
            String strFirst = "Balance " + df.format(newBalance).replace(',', '.');
            readyBalance[0] = strFirst;
            break;
        }
        for (int i = 0; i < checkAmount.length - 1; i++) {
            nextBalance = previousBalance - checkAmount[i + 1];
            previousBalance = nextBalance;
            String strNext = "Balance " + df.format(nextBalance).replace(',', '.');
            readyBalance[i + 1] = strNext;
        }
        return readyBalance;
    }

    public static String calculateTotalAndAverageExpenses(double[] checkAmount) {
        double total = 0;
        final DecimalFormat df = new DecimalFormat("0.00");
        for (double v : checkAmount) {
            total = total + v;
        }
        String strTotal = "Total expense  " + df.format(total).replace(',', '.');

        double average = 0;
        for (int i = 0; i < checkAmount.length; i++) {
            average = total / checkAmount.length;
        }
        String strAverage = "Average expense  " + df.format(average).replace(',', '.') + "\"";
        return strTotal + "\n" + strAverage;
    }
}


