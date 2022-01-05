package tasks;

public class Sixth {

                                                                             //Convert a String to a Number

//String input is "-7"
//Expected integer output is -7

    public static Integer conversion(String str) {
        Integer number;
        try {
            number = Integer.valueOf(str);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage() + "   Enter only integer numbers!");
            number = conversion(str);
        }
        return number;
    }
}
