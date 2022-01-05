package tasks;

public class Tenth {

                                                                                    //Looking for a benefactor

//    Number of donations: 7
//    Donations:  14.0, 30.0, 5.0, 7.0, 9.0, 11.0, 15.0
//    New average: 30
//    Expected next donation is 149.0

//if dons = [14, 30, 5, 7, 9, 11, 15] then new_avg(dons, 30) --> 149

    public static double newAvg(double[] arr, double nAvg) {
        double result;
        result = (nAvg * (arr.length + 1) - sumOfElements(arr));
        return result;
    }

    public static double sumOfElements(double[] arr) {
        double sum = 0;
        for (double element : arr) {
            sum = sum + element;
        }
        return sum;
    }

}

