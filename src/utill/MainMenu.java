package utill;
import tasks.*;

import java.util.Arrays;
import java.util.HashMap;
import static tasks.Ninth.divideBy;

public class MainMenu {

    public static void main(String[] args) {
        int numb;
        do {
            numb = ReadFromConsole.getTaskNumber();
            switch (numb) {
                case (0) -> TasksDescriptions.EXIT.getDescription();
                case (1) -> {
                    TasksDescriptions.FIRST.getDescription();
                    float time = ReadFromConsole.getFloatNumber();
                    System.out.println(First.count(time));
                }
                case (2) -> {
                    TasksDescriptions.SECOND.getDescription();
                    System.out.println("Bob, please, enter the length of cuboid:");
                    double length = ReadFromConsole.getParametersForVolume();
                    System.out.println("Bob, please, enter the width of cuboid:");
                    double width = ReadFromConsole.getParametersForVolume();
                    System.out.println("Bob, please, enter the height of cuboid:");
                    double height = ReadFromConsole.getParametersForVolume();
                    System.out.println("The volume of the cuboid is " + Second.getVolume(length, width, height));
                }
                case (3) -> {
                    TasksDescriptions.THIRD.getDescription();
                    System.out.println(Third.mpgToKPM(ReadFromConsole.getFloatNumber()));
                }
                case (4) -> TasksDescriptions.FOURTH.getDescription();
                case (5) -> {
                    TasksDescriptions.FIFTH.getDescription();
                    System.out.println("Input array length");
                    int arrayLength = ReadFromConsole.getIntNumber();
                    int[] array = new int[arrayLength];
                    for (int i = 0; i < arrayLength; i++) {
                        System.out.println("Input value " + i);
                        array[i] = ReadFromConsole.getIntNumber();
                    }
                    System.out.println(Arrays.toString(Fifth.count(array)));
                }
                case (6) -> {
                    TasksDescriptions.SIXTH.getDescription();
                    String str = ReadFromConsole.getStringToConvert();
                    System.out.println("The string number is \"" + str + "\"");
                    System.out.println(Sixth.conversion(str));
                }
                case (7) -> {
                    TasksDescriptions.SEVENTH.getDescription();
                    System.out.println(Seventh.am_i_wilson(ReadFromConsole.getFloatNumber()) ? "Yes" : "No");
                }
                case (10) -> {
                    TasksDescriptions.TENTH.getDescription();
                    ReadFromConsole.getNextDonation();
                }
                case (11) -> {
                    TasksDescriptions.ELEVENTH.getDescription();
                    System.out.println(Eleventh.seriesSum(ReadFromConsole.getIntNumber()));
                }
                case (14) -> {
                    TasksDescriptions.FOURTEENTH.getDescription();
                    try {
                        double originalBalance = ReadFromConsole.getOriginalBalance();
                        String str = ReadFromConsole.getCheckBook();
                        String[] values = Fourteenth.deleteRedundantSymbolsFromArr(Fourteenth.getElementsOfCheckBookFromUserInput(str));
                        String[] checkAmounts = Fourteenth.createCheckAmountList(values);
                        double[] doubleValues = Arrays.stream(checkAmounts)
                                .mapToDouble(Double::parseDouble)
                                .toArray();
                        System.out.println(Fourteenth.getOriginalBalance(originalBalance));
                        for (int i = 0; i < values.length; i++) {
                            //  for (int j = 0; j < doubleValues.length; j++) {
                            System.out.println((Fourteenth.deleteRedundantSymbolsFromArr(values))[i] + " "
                                    + ((Fourteenth.getNewBalance(doubleValues, originalBalance))[i]));
                        }
                        System.out.println(Fourteenth.calculateTotalAndAverageExpenses(doubleValues));
                        System.out.println();
                    } catch (NumberFormatException e) {
                        System.out.println(e.getMessage() + "   Enter not empty string!");
                    }
                }
                case (15) -> {
                    TasksDescriptions.FIFTEENTH.getDescription();
                    System.out.println("Enter double number with exponential part(e.g 1e-16): ");
                    double number = ReadFromConsole.getDoubleNumber();
                    Fifteenth.f(number);
                }
                case (18) -> {
                    TasksDescriptions.EIGHTEENTH.getDescription();
                    String[] stockListValues = Eighteenth.getElementsOfStockListFromUserInput(ReadFromConsole.getStockList());
                    String[] firstLettersFromStockList = Eighteenth.getFirstLettersFromStockList(stockListValues);
                    String[] categoriesValues = Eighteenth.getCategoriesListFromUserInput(ReadFromConsole.getListOfCategories());
                    String[] bookQuantities = Eighteenth.createListOfQuantities(stockListValues);
                    HashMap<String, Integer> pairs = Eighteenth.codeQuantityPairs(firstLettersFromStockList, bookQuantities);
                    System.out.print("Your result looks like:  ");
                    System.out.println(Eighteenth.stockSummary(pairs,categoriesValues));
                    System.out.println();
                }
                case (19) -> {
                    TasksDescriptions.NINETEENTH.getDescription();
                    System.out.println("Count of needed umbrellas is "
                            + Nineteenth.minUmbrellas(ReadFromConsole.getArrayOfWeather()));
                }
                case (22) -> {
                    TasksDescriptions.TWENTYSECOND.getDescription();
                    System.out.println(TwentySecond.perimeter(ReadFromConsole.getNumberOfSquares()));
                }
                case (23) -> {
                    TasksDescriptions.TWENTYTHIRD.getDescription();
                    System.out.println("Enter double m: ");
                    System.out.println(Twentythird.solve(ReadFromConsole.getDoubleNumber()));
                }
                case (9) -> {
                    TasksDescriptions.NINTH.getDescription();
                    System.out.println("Input array length");
                    int arrayLength = ReadFromConsole.getIntNumber();
                    int[] array = new int[arrayLength];
                    for (int i = 0; i < arrayLength; i++) {
                        System.out.println("Input value "+ i);
                        array[i] = ReadFromConsole.getIntNumber();
                    }
                    System.out.println("Input divisor");
                    int divisor = ReadFromConsole.getIntNumber();
                    System.out.println(Arrays.toString(divideBy(array,divisor)));
                }
                case(13)->{
                    TasksDescriptions.THIRTEEN.getDescription();
                    System.out.println("Enter the total volume of building: ");
                    long totalVolume = ReadFromConsole.getIntNumber();
                    System.out.print("Number of cubes: "+Thirteen.countAmount(totalVolume));
                }
                case(21)->{
                    TasksDescriptions.TWENTY_FIRST.getDescription();
                    System.out.println("Enter the number: ");
                    int z = ReadFromConsole.getIntNumber();
                    System.out.println(TwentyFirst.zeros(z));
                }

                default -> System.out.println("Incorrect input!");
            }

        }while (numb !=0);
    }
}
