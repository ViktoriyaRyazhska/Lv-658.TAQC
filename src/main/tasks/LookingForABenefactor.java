package tasks;
import java.util.*;

import java.util.Scanner;
import java.util.ArrayList;


public class LookingForABenefactor {
    public static void runTask10(BufferedReader reader) throws IOException {

        Test4 test4 = new Test4();

        List <Integer> first = new ArrayList();
        List <Integer> second = new ArrayList();

        boolean bool = true;
        while (bool){
            System.out.println("Type your choice, donation or 'q' for exit or 'n' for set average");
            String i = reader.readLine();
            if(i.equals("q")){
                System.out.println("exit");
                bool=false;
            }else if(i.equals("n")){
                System.out.println("Please type average value");
                String j = reader.readLine();
                second.add(Integer.parseInt(j));
                bool=false;
            }else{
                System.out.println("Please type your donation ");
                first.add(Integer.parseInt(i));
            }
        }
        System.out.println("Last donation should be "+test4.funct(first,second)+". Thanks");
    }

    public List funct(List <Integer> x, List <Integer> y){
        List z= new ArrayList<>();

        try{
            Integer SumOfDons = x.stream()
                    .reduce(0, Integer::sum);
            int newAvg = y.get(0) * (x.size()+1) - SumOfDons;
            z.add(newAvg);
        }catch (Exception ex){
            System.out.println(ex.getMessage()+"error");
        }
        return z;
    }
}
