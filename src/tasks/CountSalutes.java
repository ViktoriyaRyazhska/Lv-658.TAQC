package tasks;

import java.io.BufferedReader;
import java.io.IOException;

public class CountSalutes {
    public static long countSalutes(String linePeople) {
        char temp;
        long salutes=0;
        long sumSalutes=0;

        for (int i = 0; i < linePeople.length(); i++) {
            temp = linePeople.charAt(i);
            if (temp == '>') {
                linePeople = linePeople.substring(linePeople.indexOf('>') + 1);
                salutes = linePeople.chars().filter(ch -> ch == '<').count();
                sumSalutes = sumSalutes + salutes;
            }
        }
        return sumSalutes * 2;
    }

    public static void task(BufferedReader br) {
        try {
            System.out.println("Please, enter the line with people in '>---<---<' format" +
                    ",\nwhere '>' is person who move to the right, '<' is person who move to the left: ");
            String line = br.readLine();
            System.out.println("Number of salutes is: " + countSalutes(line));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
