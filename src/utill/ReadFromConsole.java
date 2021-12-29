package utill;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFromConsole {
    static BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));

    public static int getTaskNumber() {
        System.out.print("Input number of task(Input 0 to exit): ");
        int number;
        try {
            number = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException | IOException e) {
            System.out.println(e.getMessage() + "   Enter only numbers!");
            number = getIntNumber();
        }
        return number;
    }

    public static float getFloatNumber() {
        float number;
        try {
            number = Float.parseFloat(reader.readLine());
        } catch (NumberFormatException | IOException e) {
            System.out.println(e.getMessage() + "   Enter only numbers!");
            number = getFloatNumber();
        }
        return number;
    }

    public static int getIntNumber() {
        System.out.print("Input number : ");
        int number;
        try {
            number = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException | IOException e) {
            System.out.println(e.getMessage() + "   Enter only numbers!");
            number = getIntNumber();
        }
        return number;
    }

    public static String[] getArrayOfWeather() {
        System.out.println("Please, choose the number of days");
        int size = getIntNumber() * 2;
        String[] weather = new String[size];
        for (int i = 0; i < WeatherConditions.getConditions().length; i++) {
            System.out.println(i + ":  " + WeatherConditions.getConditions()[i]);
        }
        System.out.println("Choose the number of appropriative weather condition to fill input data:");
        int numb;

        for (int i = 0; i < size; i++) {
            numb = ReadFromConsole.getIntNumber();

            switch (numb) {
                case (1) -> weather[i] = WeatherConditions.getConditions()[0].toString();
                case (2) -> weather[i] = WeatherConditions.getConditions()[1].toString();
                case (3) -> weather[i] = WeatherConditions.getConditions()[2].toString();
                case (4) -> weather[i] = WeatherConditions.getConditions()[3].toString();
                case (5) -> weather[i] = WeatherConditions.getConditions()[4].toString();
                case (6) -> weather[i] = WeatherConditions.getConditions()[5].toString();
                case (7) -> weather[i] = WeatherConditions.getConditions()[6].toString();
                default -> System.out.println("Incorrect input!");
            }

        }
        for (String el : weather) {
            System.out.println(el);
        }
        return weather;
    }
}
