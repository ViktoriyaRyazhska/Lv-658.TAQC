package tasks;

import java.util.*;

public class Eighteenth {

                                                                                        //Help the bookseller


//    StockList = ABAR 200, CDXE 500, BKWR 250, BTSQ 890, DRTY 600
//    Categories = A, B, C, W
//    Expected output is (A : 20) - (B : 114) - (C : 50) - (W : 0)


    public static void stockSummary(HashMap<String, Integer> pairs, String[] categoriesValues) {
        if ((pairs.isEmpty()) || (categoriesValues.length <= 0)) {
            System.out.println("No data for making a report!");
        } else {
            for (String categoriesValue : categoriesValues) {
                if (pairs.containsKey(categoriesValue)) {
                    System.out.print("(" + categoriesValue + " : " + pairs.get(categoriesValue) + ") - ");
                } else {
                    System.out.print("(" + categoriesValue + " : 0)  ");
                }
            }
        }
    }


    public static HashMap<String, Integer> codeQuantityPairs(String[] firstLettersOfFirstArray, String[] listOfQuantities) {
        HashMap<String, Integer> pairs = new HashMap<>();
        for (int i = 0; i <= firstLettersOfFirstArray.length - 1; i++) {
            //   for (int j = 0; j < listOfQuantities.length; j++) {
            pairs.put(firstLettersOfFirstArray[i], Integer.valueOf(listOfQuantities[i]));
            if (i == firstLettersOfFirstArray.length - 1) {
                break;
            }
            if (pairs.containsKey(firstLettersOfFirstArray[i + 1])) {
                pairs.replace(firstLettersOfFirstArray[i], pairs.get(firstLettersOfFirstArray[i]) + Integer.parseInt(listOfQuantities[i + 1]));
                i++;
            }
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
        for (int i = 0; i < lstOfArt.length; i++) {
            firstLettersOfFirstArray[i] = String.valueOf(lstOfArt[i].charAt(0));
        }
        return firstLettersOfFirstArray;
    }


    public static String[] createListOfQuantities(String[] values) {
        String[] check;
        String str;
        String[] check1 = new String[values.length];
        for (int i = 0; i < values.length; i++) {
            check = values[i].split("\s");
            str = check[1];
            check1[i] = str;
        }
        return check1;
    }


}
