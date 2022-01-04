package tasks;
import java.util.*;

import java.util.Scanner;
import java.util.ArrayList;


public class LookingForABenefactor {
    public static void main(String args[]) {

        System.out.println("are you ?:y/n");
        Scanner Scan = new Scanner(System.in);
        String input1 = Scan.nextLine();

        if(input1.equals("n")){
            System.out.println("exit");
        }else if(input1.equals("y")){
            boolean s = true;
            boolean ss = true;

            List<Integer> dons = new ArrayList<>();
            int navg = 0;
            while (ss) {
                while (s) {
                    try {
                        System.out.println("enter value for dons or press t and enter for navg or press q for exit:");
                        input1 = Scan.next();
                        if(input1.equals("q")){
                            System.out.println("exit");
                            s = false;
                        }else if(input1.equals("t")){
                            System.out.println("press value for navg or q for exit:");
                            int input2 = Scan.nextInt();
                            navg = input2;
                            s = false;
                        }else{
                            dons.add(Integer.parseInt(input1));
                            System.out.println(dons);
                        }
                    } catch (NumberFormatException ex) {
                        ex.printStackTrace();
                        System.out.println("ValueError or invalid_argument or argument-error or DomainError");
                    }

                }
//
                int SumOfDons = 0;
                for (int i : dons){
                    SumOfDons += i;
                }
                int newAvg = navg * (dons.size()+1) - SumOfDons;

                System.out.println(newAvg);
                ss=false;
            }
//
        }else{
            System.out.println("error");
        }


    }
}
