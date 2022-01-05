package tasks;
import java.util.ArrayList;
import java.util.Scanner;

public class FindNumbersWhichAreDivisibleByGivenNumber {
package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FindNumbersWhichAreDivisibleByGivenNumber {

        public static void runTask9(BufferedReader reader) throws IOException {

//            FindDivisibleBy test4 = new FindDivisibleBy();

            ArrayList first = new ArrayList();
            ArrayList second = new ArrayList();

            boolean bool = true;
            System.out.println("Type value for numbers arr or type 'q' for exit");
            while (bool){
                try{
                    String i = reader.readLine();
                    if(i.equals("q")){
                        System.out.println("exit");
                        bool=false;
                    }else if(i.equals("n")){
                        System.out.println("Type value for divisor arr");
                        String j = reader.readLine();
                        second.add(Integer.parseInt(j));
                        bool=false;
                    }else{
                        System.out.println("Type value for numbers arr or 'n' for divisor" +
                                " or type 'q' for exit ");
                        first.add(Integer.parseInt(i));
                    }
                }catch (Exception ex){
                    System.out.println(ex.getMessage()+"Type only integer number of 'q' or 'n'");
                }

            }
//            ArrayList res = test4.funct(first,second);
//            System.out.println(res);
            System.out.println(funct(first,second));
        }

        public ArrayList funct(List <Integer> x, ArrayList y){
            ArrayList z= new ArrayList<>();
//        List <Integer> z;
            boolean bool = true;
            try{
                x.stream().filter(i-> i%2==0).forEach(i -> z.add(i));
            }catch (Exception ex){
                System.out.println(ex.getMessage());
            }
            return z;
        }
    }
