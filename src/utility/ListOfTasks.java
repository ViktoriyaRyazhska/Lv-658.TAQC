package utility;

public class ListOfTasks {
    private static String firstList() {
        String list = "1. ArtificialRain\n" +
                "2. LookingBenefactor\n" +
                "3. TrailingZeros\n" +
                "4. StringToNumber\n" +
                "5. TheSmallest\n" +
                "6. PerimeterSquares\n" +
                "7. KeepHydrated\n" +
                "8. MilesToKilometers\n" +
                "9. WillsonPrimes";

        return list;
    }

    private static String secondList() {
        String list = "1. Rainfall\n" +
                "2. FormattingDecimal\n" +
                "3. SquareRoot\n" +
                "4. VolumeCuboid\n" +
                "5. WhichX\n" +
                "6. BuildCubes\n" +
                "7. Vasya\n" +
                "8. BalanceChecking\n" +
                "9. SumOfTerm";

        return list;
    }

    private static String thirdList() {
        String list = "1. GapPrimes\n" +
                "2. HelpBookseller\n" +
                "3. CountPositive\n" +
                "4. IsDivisible\n" +
                "5. RankingNBA\n" +
                "6. FloatingPoint";

        return list;
    }

    public static String getFirstList() {
        return firstList();
    }

    public static String getSecondList() {
        return secondList();
    }

    public static String getThirdList() {
        return thirdList();
    }

}
