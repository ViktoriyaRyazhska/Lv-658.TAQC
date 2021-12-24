package utill;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFromConsole {
    static BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));

    public static int getIntNumber()
    {
        System.out.print("Input number of task(Input 0 to exit): ");
        int number ;
        try {
            number = Integer.parseInt(reader.readLine());
        }
        catch (NumberFormatException | IOException e)
        {
            System.out.println(e.getMessage() + "   Enter only numbers!");
            number = getIntNumber();
        }
        return number;
    }

    public static float getFloatNumber()
    {
        float number ;
        try {
            number = Float.parseFloat(reader.readLine());
        }
        catch (NumberFormatException | IOException e)
        {
            System.out.println(e.getMessage() + "   Enter only numbers!");
            number = getFloatNumber();
        }
        return number;
    }
}
