package tasks;

public class Sixth {

                                                                                //Convert a String to a Number

//String input is "-7"
//Expected integer output is -7

    public static String conversion(String str) {
        if (str.contains(".") || (str.contains(","))) return "Please, enter only integer numbers!";
        else if (!str.matches("[-0-9]+")) return "Please, enter only numbers without any redundant symbols!";
        int number = Integer.parseInt(str);
        return "The converted number is " + number;
    }

}
