package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountSalutes {
    private static long countSalutes(String linePeople) {

        long sumSalutes=0;
        for (char elem : linePeople.toCharArray())
        {
            if (elem == '>') {
                linePeople = linePeople.substring(linePeople.indexOf('>') + 1);
                long salutes = linePeople.chars().filter(ch -> ch == '<').count();
                sumSalutes = sumSalutes + salutes;
            }
        }
        return sumSalutes * 2;
    }

    public static long getCountSalutes(String linePeople) {
        return countSalutes(linePeople);
    }

    public static void task(BufferedReader br) throws IOException {
        System.out.println("Please, enter the line with people in '>---<---<' format" +
                ",\nwhere '>' is person who move to the right, '<' is person who move to the left: ");
        String line;
        line = br.readLine();

        String regex = "[><-]+";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(line);
        if (line == null) {
            throw new IllegalArgumentException("Error.. line is empty");
        }
        if (!m.matches()) {
            throw new IllegalArgumentException("You have entered forbidden characters...");
        }
        System.out.println("Number of salutes is: " + countSalutes(line));

    }
}
