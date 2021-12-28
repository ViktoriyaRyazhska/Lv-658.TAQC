package tasks;
import java.io.BufferedReader;
import java.io.IOException;

public class BalanceChecking {

    private static double systemDouble(double d){
        int i =(int) Math.round(d*100);
        d=((double)i)/100;
        return d;
    }

    private static String deleteNotUsableSymbols(String cB){
        String input;
        input = cB.replaceAll("%", "");
        input = input.replaceAll(";", "");
        input = input.replaceAll("\\?", "");
        input = input.replaceAll("\\*", "");
        input = input.replaceAll("\\+", "");
        input = input.replaceAll("/", "");
        input = input.replaceAll(",", "");
        input = input.replaceAll("!", "");
        input = input.replaceAll("@", "");
        input = input.replaceAll("#", "");
        input = input.replaceAll("$", "");
        input = input.replaceAll("//^", "");
        input = input.replaceAll("&", "");
        return input;
    }

    private static String balance(String cB) {
        String input = deleteNotUsableSymbols(cB);
        String[]lines =input.split("\n");
        double balance= Double.valueOf(lines[0]);
        double sum = 0.0;
        String[] line;
        StringBuilder out= new StringBuilder();
        out.append("Original Balance: "+systemDouble(balance)).append("\n");
        for (int i = 1; i < lines.length; i++) {
            line = lines[i].split(" ");
            sum += Double.parseDouble(line[2]);
            out.append(line[0]).append(" ").append(line[1].replaceAll("[^\\p{L}\\p{Z}]", "")).append(" ").append(line[2]).append(" Balance ").append(systemDouble(balance = Double.sum(balance,-Double.parseDouble(line[2])))).append("\n");
        }
        double k = (lines.length)-1.0;
        out.append("Total expense ").append(systemDouble(sum)).append("\n");
        out.append("Average expense ").append(systemDouble(sum/k));
        return out.toString();
    }

    public static void task(BufferedReader br) {
        System.out.println("How much purchases are in check book?");
        try {
            int count = Integer.parseInt(br.readLine());
            if (count < 0) {
                throw new IllegalArgumentException("Only Positive Numbers & no Letters Please!");
            }
            System.out.println("Please, enter the check book:");
            StringBuilder check = new StringBuilder();
            String line = null;
            for (int i = 0; i < count + 1; i++) {
                line = br.readLine();
                check.append(line);
                check.append('\n');
            }
            String check1 = check.toString();
            System.out.println("\n--- Your balance ---\n" + balance(check1));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
//1000.00\n125 Market 125.45\n126 Hardware 34.95\n127 Video 7.45\n128 Book 14.32\n129 Gasoline 16.10