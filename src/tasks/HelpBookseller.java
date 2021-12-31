package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.summingInt;

public class HelpBookseller {

    private static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if (lstOfArt.length > 0 && lstOf1stLetter.length > 0) {
            var counts = stream(lstOfArt).collect(groupingBy(s -> s.substring(0, 1), summingInt(s -> Integer.parseInt(s.split(" ")[1]))));
            return stream(lstOf1stLetter).map(s -> "(" + s + " : " + counts.getOrDefault(s, 0) + ")").collect(joining(" - "));
        }
        return "";
    }

    public static void task(BufferedReader br) {
        try {
            System.out.println("Enter stocklist: ");
            List<String> lstOfArt = new ArrayList<String>();
            String response = new String();
            for (int i = 0; i < 5; i++) {
                String stock = br.readLine();
                lstOfArt.add(stock);
            }
            String[] simplelstOfArt = new String[lstOfArt.size()];
            lstOfArt.toArray(simplelstOfArt);

            System.out.println("Enter list of categories: ");
            List<String> lstOf1stLetter = new ArrayList<String>();
            for (int i = 0; i < 2; i++) {
                String letter = br.readLine();
                lstOf1stLetter.add(letter);
            }
            String[] simplelstOf1stLetter = new String[lstOf1stLetter.size()];
            lstOf1stLetter.toArray(simplelstOf1stLetter);
            System.out.println(stockSummary(simplelstOfArt, simplelstOf1stLetter));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
