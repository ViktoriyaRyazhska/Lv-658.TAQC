package com.company;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;


public class FormattingDecimalPlaces {
    public static void conditionOfTask() {
        System.out.println("Each number should be formatted that it is rounded to " +
                "two decimal places. You don't need to check whether the input is a valid " +
                "number because only valid numbers are used in the tests." );
    }


    public static void runTask8(BufferedReader reader)throws IOException{
        conditionOfTask();
        String a ="";
        FormattingDecimalPlaces start = new FormattingDecimalPlaces();
        Scanner scn = new Scanner(System.in);
        System.out.println("enter double number like 2,222 or 2222");

//        String i = scn.nextLine();
        try {
            final String i = reader.readLine();
            Double i1 = Double.parseDouble(i);
            String res = start.FDP(i1);
            System.out.println(res);
        }
        catch (Exception ex){
            System.out.println("your value is wrong"+ex.getMessage());
        }
    }
    public String FDP(Double x){
        boolean bool = true;
        String x1 = String.format("%.2f",x);
        return x1;
    }
//
}
