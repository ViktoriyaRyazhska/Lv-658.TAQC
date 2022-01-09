package com.company;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

import java.util.Scanner;
import java.util.ArrayList;
public class EasyBalanceChecking {

    String b1 = "1000.00!=\n125 Market !=:125.45\n126 Hardware =34.95\n127 Video! 7.45\n128 Book :14.32\n129 Gasoline ::16.10";
    String b1sol = "Original Balance: 1000.00\\r\\n125 Market 125.45 Balance 874.55\\r\\n126 Hardware 34.95 Balance 839.60\\r\\n127 Video 7.45 Balance 832.15\\r\\n128 Book 14.32 Balance 817.83\\r\\n129 Gasoline 16.10 Balance 801.73\\r\\nTotal expense  198.27\\r\\nAverage expense  39.65";

    public static String balance(String book) {
        String t = book.replaceAll("([^\\n. \\da-zA-Z])", "");
        String[] arr = t.split("[\\n]+");
        double current = Double.parseDouble(arr[0]);
        double total = 0;
        int count = 0;
        StringBuilder result = new StringBuilder();
        result.append("Original Balance: ").append(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            count++;
            String[] line = arr[i].split("[ ]+");
            current -= Double.parseDouble(line[2]);
            total += Double.parseDouble(line[2]);
            String u = String.format("\\r\\n%s %s %s Balance %.2f", line[0], line[1], line[2], current);
            result.append(u);
        }
        result.append(String.format("\\r\\nTotal expense  %.2f\\r\\nAverage expense  %.2f", total, total / count));
        return result.toString();
    }

    public static void runTask14(BufferedReader reader) throws IOException {
        EasyBalanceChecking t4t = new EasyBalanceChecking();
        try {
            String book = "1000.00 125 Market 125.45 126 Hardware 34.95 127 Video 7.45 128 Book 14.32 129 Gasoline 16.10";

            System.out.println("Enter check book as a - sometimes - cluttered (by non-alphanumeric characters) string:");
            final String getString = reader.readLine();
            System.out.println("Number is: " + balance(t4t.b1));
        } catch (NumberFormatException e) {
            System.out.println("Wrong value: Set digits");
            runTask14(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }