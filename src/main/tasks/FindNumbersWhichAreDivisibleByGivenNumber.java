package tasks;
import java.util.ArrayList;
import java.util.Scanner;

public class FindNumbersWhichAreDivisibleByGivenNumber {
    public static void main(String Arr[]) {
        System.out.println("are you ready to start y/n:");

        Scanner Scan = new Scanner(System.in);
        String input1 = Scan.nextLine();
        if(input1.equals("n")){
            System.out.println("Exit!!!");
        }else if(input1.equals("y")) {

            ArrayList x = new ArrayList();
            ArrayList y = new ArrayList();
            boolean s = true;
            boolean ss = true;

            while (ss) {
                while (s) {
                    try {
                        System.out.println("enter value1 or press t and enter value2 or press q for exit:");
                        input1 = Scan.next();
                        if (input1.equals("q")) {
                            System.out.println("exit");
                            s = false;
                        } else if (input1.equals("N")) {
                            System.out.println("exit");
                            s = false;
                        } else if (input1.equals("t")) {
                            System.out.println("press value for Y or q for exit:");
                            int input2 = Scan.nextInt();
                            y.add(input2);
                            s = false;
                        } else {
                            System.out.println("press value for X or q for exit:");
                            x.add(input1);
                        }
//                        System.out.println(input1);
//                        System.out.println(x);
//                        System.out.println(y);

                    } catch (NumberFormatException ex) {
                        ex.printStackTrace();
                    }
                }
                ArrayList result = new ArrayList();
                for (int i = 0; i < x.size(); i++) {
                    String xx1 = x.get(i).toString();
                    String yy1 = y.get(0).toString();
                    int x1 = Integer.parseInt(xx1);
                    int y1 = Integer.parseInt(yy1);
//                    System.out.println(i + "  " + x1 + " " + y1);
                    if (x1 % y1 == 0) {
                        result.add(x1);
                    }
                    System.out.println(result);
                }
                ss = false;
            }
        }else{
            System.out.println("error");
        }


    }

}
