package utill;

import tasks.Tenth;

import javax.management.InvalidAttributeValueException;
import java.io.*;

public class ReadFromConsole {
    static BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));

    public static int getTaskNumber() {
        System.out.print("Input number of task (Input 0 to exit): ");
        int number;
        try {
            number = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException | IOException e) {
            System.out.println(e.getMessage() + "   Enter only numbers!");
            number = getTaskNumber();
        }
        return number;
    }

    public static int getIntNumber() {
        System.out.print("Input number of task (Input 0 to exit): ");
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

    public static double getDoubleNumber() {
        double number;
        try {
            number = Double.parseDouble(reader.readLine());
        } catch (NumberFormatException | IOException e) {
            System.out.println(e.getMessage() + "   Enter only double numbers or exponential view!");
            number = getDoubleNumber();
        }
        return number;
    }

    public static double getParametersForVolume() {
        double number;
        try {
            number = Double.parseDouble(reader.readLine().replace(",", "."));
        } catch (NumberFormatException | IOException e) {
            System.out.println(e.getMessage() + "   Enter only numbers!");
            number = getParametersForVolume();
        }
        return number;
    }

    public static String getStringToConvert() {
        System.out.print("Please, enter string of numbers, which you want to convert: ");
        String str;
        try {
            str = reader.readLine();
        } catch (IOException e) {
            System.out.println(e.getMessage() + "   Enter only letters!");
            str = getStringToConvert();
        }
        return str;
    }

    public static int getNumberOfDonations() {
        System.out.println("John, please enter the number of donations you would like to calculate: ");
        int number;
        try {
            number = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException | IOException e) {
            System.out.println(e.getMessage() + "   Enter only numbers!");
            number = getIntNumber();
        }
        return number;
    }

    public static double getAverageNumber() {
        System.out.println("John, please enter the average number you would like to calculate: ");
        double navg;
        try {
            navg = Double.parseDouble(reader.readLine().replace(",", "."));
        } catch (NumberFormatException | IOException e) {
            System.out.println(e.getMessage() + "   Enter only numbers!");
            navg = getAverageNumber();
        }
        return navg;
    }

    public static void getNextDonation() {
        try {
            int size = getNumberOfDonations();
            double[] arr = new double[size];
            System.out.println("Enter donations: ");
            for (int i = 0; i < size; i++) {
                arr[i] = Double.parseDouble(reader.readLine().replace(",", "."));
            }
            double averageAmountDonations = getAverageNumber();
            if (Math.ceil(Tenth.newAvg(arr, averageAmountDonations)) <= 0)
                throw new InvalidAttributeValueException("VALUE ERROR! The expected donation has negative value. ");
            else
                System.out.println("Next donation from the benefactor to the association should be: "
                        + Math.ceil(Tenth.newAvg(arr, averageAmountDonations)));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidAttributeValueException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String getCheckBook() {
        System.out.print("Please, enter your check book: ");
        String checkBook;
        try {
            checkBook = reader.readLine();
        } catch (IOException e) {
            System.out.println(e.getMessage() + "   Enter only letters!");
            checkBook = getCheckBook();
        }
        return checkBook;
    }

    public static String getStockList() {
        System.out.print("Please, enter your stock list: ");
        String stockList;
        try {
            stockList = reader.readLine();
        } catch (IOException e) {
            System.out.println(e.getMessage() + "   Enter only letters!");
            stockList = getCheckBook();
        }
        return stockList;
    }

    public static String getListOfCategories() {
        System.out.print("Please, enter all categories, books of which you would like to find: ");
        String stockList;
        try {
            stockList = reader.readLine();
        } catch (IOException e) {
            System.out.println(e.getMessage() + "   Enter only letters!");
            stockList = getCheckBook();
        }
        return stockList;
    }

    public static int getNumberOfSquares() {
        System.out.print("Please, enter the number of squares, perimeter of which you want to receive: ");
        int number;
        try {
            number = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException | IOException e) {
            System.out.println(e.getMessage() + "   Enter only numbers!");
            number = getIntNumber();
        }
        return number;
    }

}
