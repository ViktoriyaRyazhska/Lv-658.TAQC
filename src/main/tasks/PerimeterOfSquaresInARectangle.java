package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigInteger;

public class PerimeterOfSquaresInARectangle {
    public static BigInteger perimeter(BigInteger n) {

        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        BigInteger c = BigInteger.ONE;
        BigInteger sum = BigInteger.ZERO;

        for(int i = 0; i <= n.intValue(); i++) {
            a = b;
            b = c;
            c = a.add(b);
            sum = sum.add(a);
        }

        return sum.multiply(BigInteger.valueOf(4));
    }

    public static void main(String[] args) {
        System.out.println(perimeter(BigInteger.valueOf(5)));
    }
    public static void runTask20(BufferedReader reader) throws IOException {
        try {
            System.out.println("Set number");
            final int number = Integer.parseInt(reader.readLine());
            if (number < 0) {
                throw new IllegalArgumentException("Wrong value: Set a non-negative number");
            }
            System.out.println("Perimeter " + perimeter(BigInteger.valueOf(number)));
        } catch (NumberFormatException e) {
            System.out.println("Wrong value: Set digits");
            runTask20(reader);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            runTask20(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


