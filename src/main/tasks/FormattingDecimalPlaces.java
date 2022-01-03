package tasks;
import java.util.Scanner;


public class FormattingDecimalPlaces {

    public static void main(String args[]){
        String a ="";
        Test4 start = new Test4();
        Scanner scn = new Scanner(System.in);
        System.out.println("enter double number like 2,222 or 2222");

        String i = scn.nextLine();
        try {
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
}
