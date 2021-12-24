package utill;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadFromConsole {
    public static int getTaskNumber()
    {
         BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.print("Input number of task(Input 0 to exit): ");
        int number ;
        try {
            number = Integer.parseInt(reader.readLine());
        }
        catch (NumberFormatException | IOException e)
        {
            System.out.println(e.getMessage() + "   Enter only numbers!");
            number = getTaskNumber();
        }
        return number;
    }
}
