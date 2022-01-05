package com.company;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;


public class FormattingDecimalPlaces {
    public static void runTask8(BufferedReader reader)throws IOException{
//        conditionOfTask();
        boolean bool = true;
        while (bool){
            String a ="";
//            FormattingDecimalPlaces start = new FormattingDecimalPlaces(); // when use not static methods
            System.out.println("enter double number like 2,222 or 2222");
            try {
                final String i = reader.readLine();
                Double i1 = Double.parseDouble(i);
//                String res = start.FDP(i1); // when use not static methods
                System.out.println(FDP(i1));
                System.out.println("Thanks");
                bool=false;
            }
            catch (Exception ex){
                System.out.println("your value is wrong"+ex.getMessage());
            }
        }
    }
    public static String FDP(Double x){ // whitout static (when use not static methods)

        String x2 = Double.toString((Math.round(x*100))/100.00);
//        String x1 = String.format("%.2f",x);
        return x2;
    }
//
}
