package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HelpTheBookseller {
    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if (lstOfArt.length == 0) return "";
        final int space = lstOfArt[0].indexOf(" ");
        return Stream.of(lstOf1stLetter)
                .map(c -> c + " : " + Stream.of(lstOfArt)
                        .filter(a -> c.contentEquals(a.subSequence(0, 1)))
                        .map(a -> a.substring(space + 1))
                        .mapToInt(Integer::parseInt)
                        .sum())
                .map(s -> "(" + s + ")")
                .collect(Collectors.joining(" - "));
    }

    public static void runTask17(BufferedReader reader) throws IOException {
        try {
            System.out.println("Set list Of Art: ");
            final String lstOfArt = reader.readLine();
            String[] lstOfArtArray = lstOfArt.split("");
            System.out.println("Set list Of 1st letters: ");
            final String lstOf1stLetter = reader.readLine();
            final String[] lstOf1stLetterArray = lstOf1stLetter.split("");
            System.out.println(stockSummary(lstOfArtArray,lstOf1stLetterArray));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
