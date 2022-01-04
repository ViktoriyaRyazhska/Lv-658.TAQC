package tasks;
import java.util.ArrayList;
import java.util.Scanner;

public class FindNumbersWhichAreDivisibleByGivenNumber {
package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

    public class FindDivisibleBy {
        public static void conditionOfTask() {
            System.out.println("Complete the function which takes two arguments and returns all " +
                    "numbers which are divisible by the given divisor. First argument is " +
                    "an array of numbers and the second is the divisor." );
        }
        public static void runTask9(BufferedReader reader) throws IOException {
            conditionOfTask();
            FindDivisibleBy test4 = new FindDivisibleBy();

            ArrayList first = new ArrayList();
            ArrayList second = new ArrayList();

            boolean bool = true;
            while (bool){
                System.out.println("enter value");
                String i = reader.readLine();
                if(i.equals("q")){
                    System.out.println("exit");
                    bool=false;
                }else if(i.equals("n")){
                    System.out.println("enter val fot second arr");
                    String j = reader.readLine();
                    second.add(Integer.parseInt(j));
                    bool=false;
                }else{
                    System.out.println("enter val fot first arr");
                    first.add(Integer.parseInt(i));
                }
//            System.out.println(test4.funct(first,second));
            }
            ArrayList res = test4.funct(first,second);
            System.out.println(res);
        }

        public ArrayList funct(ArrayList x, ArrayList y){
            ArrayList z= new ArrayList<>();
            boolean bool = true;
            try{
                for(int i=0;i<=x.size();i++){
                    String x1 = x.get(i).toString();
                    String y1 = y.get(0).toString();
                    int x2 = Integer.parseInt(x1);
                    int y2 = Integer.parseInt(y1);
                    if(x2%y2==0){
                        z.add(x2);
                    }
                }
            }catch (Exception ex){
                System.out.println(ex.getMessage());
            }
            return z;
        }
    }

}
