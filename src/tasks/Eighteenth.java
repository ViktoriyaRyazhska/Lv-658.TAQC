package tasks;

import java.util.*;

public class Eighteenth {

                                                                                        //Help the bookseller


//    StockList = ABAR 200, CDXE 500, BKWR 250, BTSQ 890, DRTY 600
//    Categories = A, B, C, W
//    Expected output is (A : 20) - (B : 114) - (C : 50) - (W : 0)

    public static StringBuilder stockSummary(HashMap<String, Integer> pairs, String[] categoriesValues) {
        StringBuilder str = new StringBuilder();
        if ((pairs.isEmpty()) || (categoriesValues.length <= 1)) {
            str.append("No data for making a report!");
            return str;
        } else {
            for (int i = 0; i <= categoriesValues.length - 1; i++) {
                if (pairs.containsKey(categoriesValues[i]) && i + 1 != categoriesValues.length) {
                    str.append("(").append(categoriesValues[i]).append(" : ").append(pairs.get(categoriesValues[i])).append(") - ");
                } else if (pairs.containsKey(categoriesValues[i]) && i + 1 == categoriesValues.length) {
                    str.append("(").append(categoriesValues[i]).append(" : ").append(pairs.get(categoriesValues[i])).append(")");
                } else if (!pairs.containsKey(categoriesValues[i]) && i + 1 != categoriesValues.length) {
                    str.append("(").append(categoriesValues[i]).append(" : 0) - ");
                } else if (!pairs.containsKey(categoriesValues[i]) && i + 1 == categoriesValues.length) {
                    str.append("(").append(categoriesValues[i]).append(" : 0)");
                }
            }
        }
        return str;
    }


    public static HashMap<String, Integer> codeQuantityPairs(String[] firstLettersOfFirstArray, String[] listOfQuantities) {
        HashMap<String, Integer> pairs = new HashMap<>();
        try {
            for (int i = 0; i <= firstLettersOfFirstArray.length - 1; i++) {
                pairs.put(firstLettersOfFirstArray[i], Integer.valueOf(listOfQuantities[i]));
                if (i == firstLettersOfFirstArray.length - 1) {
                    break;
                }
                if (pairs.containsKey(firstLettersOfFirstArray[i + 1])) {
                    pairs.replace(firstLettersOfFirstArray[i], pairs.get(firstLettersOfFirstArray[i]) + Integer.parseInt(listOfQuantities[i + 1]));
                    i++;
                }
            }
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage() + " No data for making a report!");
        }
        return pairs;
    }

    public static String[] getElementsOfStockListFromUserInput(String str) {
        return str.split(", ");
    }

    public static String[] getCategoriesListFromUserInput(String str) {
        return str.split(", ");
    }


    public static String[] getFirstLettersFromStockList(String[] lstOfArt) {
        String[] firstLettersOfFirstArray = new String[lstOfArt.length];
        String[] arr = new String[1];
        try {
            arr[0] = "No data for making a report!";
            if (lstOfArt.length <= 0) return arr;
            else
                for (int i = 0; i < lstOfArt.length; i++) {
                    firstLettersOfFirstArray[i] = String.valueOf(lstOfArt[i].charAt(0));
                }
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e.getMessage() + " No data for making a report!");
        }
        return firstLettersOfFirstArray;
    }

    public static String[] createListOfQuantities(String[] values) {
        String[] check;
        String str;
        String[] check1 = new String[values.length];
        try {
            for (int i = 0; i < values.length; i++) {
                check = values[i].split("\s");
                str = check[1];
                check1[i] = str;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage() + " No data for making a report!");
        }
        return check1;
    }
}
