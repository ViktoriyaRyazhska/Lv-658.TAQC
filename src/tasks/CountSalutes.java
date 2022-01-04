package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountSalutes {
    private static long countSalutes(String linePeople) {
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

    public static long getCountSalutes(String linePeople) {
        return countSalutes(linePeople);
    }

    private static boolean validate(String linePeople) {
        boolean flag = true;
        String regex = "[>_]+";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(linePeople);
        if (linePeople == null) { // && str.matches("[0-9.]+");) {
            flag = false;
            System.out.println("Error.. line is empty");
        }
        if (!m.matches()) {
            flag = false;
        }
        return flag;
    }


    public static void task(BufferedReader br) throws IOException {
        System.out.println("Please, enter the line with people in '>---<---<' format" +
                ",\nwhere '>' is person who move to the right, '<' is person who move to the left: ");
        String line = br.readLine();
        if(validate(line)) {
            System.out.println("Number of salutes is: " + countSalutes(line));
        }
        else {
            task(br);
        }
    }
}
