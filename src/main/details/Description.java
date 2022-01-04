package details;

public class Description {

    public static void conditionOfTask1() {
        final String NAME_OF_TASK1 = "Keep Hydrated!";

        final String DESCRIPTION_OF_TASK1 = """
                Nathan loves cycling.
                Because Nathan knows it is important to stay hydrated, he drinks 0.5 litres of water per hour of cycling.
                You get given the time in hours and you need to return the number of litres Nathan will drink, rounded to the smallest value.""";

        System.out.println("Your task is: " + NAME_OF_TASK1);
        System.out.println("Description is: " + DESCRIPTION_OF_TASK1);
    }

    public static void conditionOfTask2() {
        final String NAME_OF_TASK2 = "Volume of a Cuboid";

        final String DESCRIPTION_OF_TASK2 = "Bob needs a fast way to calculate the volume of a cuboid with three values: length, width and the height of the cuboid. \n" +
                "Write a function to help Bob with this calculation.";

        System.out.println("Your task is: " + NAME_OF_TASK2);
        System.out.println("Description is: " + DESCRIPTION_OF_TASK2);
    }

    public static void conditionOfTask3() {
        final String NAME_OF_TASK3 = "Miles per gallon to kilometers per liter";

        final String DESCRIPTION_OF_TASK3 = """
                Sometimes, I want to quickly be able to convert miles per imperial gallon into kilometers per liter.
                Create an application that will display the number of kilometers per liter (output) based on the number of miles per imperial gallon (input).
                Make sure to round off the result to two decimal points. If the answer ends with a 0, it should be rounded off without the 0. So instead of 5.50, we should get 5.5.
                Some useful associations relevant to this kata: 1 Imperial Gallon = 4.54609188 litres 1 Mile = 1.609344 kilometres""";

        System.out.println("Your task is: " + NAME_OF_TASK3);
        System.out.println("Description is: " + DESCRIPTION_OF_TASK3);
    }

    public static void conditionOfTask4() {
        final String NAME_OF_TASK4 = "To square(root) or not to square(root)";

        final String DESCRIPTION_OF_TASK4 = """
                Write a method, that will get an integer array as parameter and will process every number from this array.
                Return a new array with processing every number of the input-array like this:
                If the number has an integer square root, take this, otherwise square the number.
                Example [4,3,9,7,2,1] -> [2,9,3,49,4,1]""";

        System.out.println("Your task is: " + NAME_OF_TASK4);
        System.out.println("Description is: " + DESCRIPTION_OF_TASK4);
    }

    public static void conditionOfTask5() {
        final String NAME_OF_TASK5 = "Count of positives / sum of negatives";

        final String DESCRIPTION_OF_TASK5 = """
                Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers. 0 is neither positive nor negative.
                If the input array is empty or null, return an empty array.
                For input [1,2,3,4,5,6,7,8,9,10,-11,-12,-13,-14,-15], you should return [10, -65]""";
        System.out.println("Your task is: " + NAME_OF_TASK5);
        System.out.println("Description is: " + DESCRIPTION_OF_TASK5);
    }

    public static void conditionOfTask6() {
        final String NAME_OF_TASK6 = "Convert a String to a Number!";

        final String DESCRIPTION_OF_TASK6 = """
                We need a function that can transform a string into a number. What ways of achieving this do you know?
                Note: Don't worry, all inputs will be strings, and every string is a perfectly valid representation of an integral number.
                Example "1234" --> 1234
                "605"  --> 605
                "1405" --> 1405
                "-7" --> -7""";

        System.out.println("Your task is: " + NAME_OF_TASK6);
        System.out.println("Description is: " + DESCRIPTION_OF_TASK6);
    }

    public static void conditionOfTask7() {
        final String NAME_OF_TASK7 = "Wilson primes";

        final String DESCRIPTION_OF_TASK7 = """
                Wilson primes satisfy the following condition. Let P represent a prime number.
                Then ((P-1)! + 1) / (P * P) should give a whole number.
                Your task is to create a function that returns true if the given number is a Wilson prime.""";

        System.out.println("Your task is: " + NAME_OF_TASK7);
        System.out.println("Description is: " + DESCRIPTION_OF_TASK7);
    }

    public static void conditionOfTask8() {
        final String NAME_OF_TASK8 = "Formatting decimal places";

        final String DESCRIPTION_OF_TASK8 = """
                Each number should be formatted that it is rounded to two decimal places. You don't need to check whether the input is a valid number because only valid numbers are used in the tests.
                Example:   \s
                5.5589 is rounded 5.56  \s
                3.3424 is rounded 3.34""";

        System.out.println("Your task is: " + NAME_OF_TASK8);
        System.out.println("Description is: " + DESCRIPTION_OF_TASK8);
    }

    public static void conditionOfTask9() {
        final String NAME_OF_TASK9 = "Find numbers which are divisible by given number";

        final String DESCRIPTION_OF_TASK9 = "Complete the function which takes two arguments and returns all numbers which are divisible by the given divisor. First argument is an array of numbers and the second is the divisor.\n" +
                "Example divisibleBy([1,2,3,4,5,6], 2) == [2, 4, 6]";

        System.out.println("Your task is: " + NAME_OF_TASK9);
        System.out.println("Description is: " + DESCRIPTION_OF_TASK9);
    }

    public static void conditionOfTask10() {
        final String NAME_OF_TASK10 = "Looking for a benefactor";

        final String DESCRIPTION_OF_TASK10 = """
                The accounts of the 'Fat to Fit Club (FFC)' association are supervised by John as a volunteered accountant.
                The association is funded through financial donations from generous benefactors.
                John has a list of the first n donations: [14, 30, 5, 7, 9, 11, 15]
                He wants to know how much the next benefactor should give to the association so that the average of the first n + 1 donations should reach an average of 30.
                After doing the math he found 149. He thinks that he made a mistake. Could you help him?""";

        System.out.println("Your task is: " + NAME_OF_TASK10);
        System.out.println("Description is: " + DESCRIPTION_OF_TASK10);
    }

    public static void conditionOfTask11() {
        final String NAME_OF_TASK11 = "Sum of the first nth term of Series";

        final String DESCRIPTION_OF_TASK11 = """
                Your task is to write a function which returns the sum of following series upto nth term(parameter).
                Series: 1 + 1/4 + 1/7 + 1/10 + 1/13 + 1/16 +...
                Examples:(Input --> Output)
                1 --> 1 --> "1.00"
                2 --> 1 + 1/4 --> "1.25"
                5 --> 1 + 1/4 + 1/7 + 1/10 + 1/13 --> "1.57""";

        System.out.println("Your task is: " + NAME_OF_TASK11);
        System.out.println("Description is: " + DESCRIPTION_OF_TASK11);
    }

    public static void conditionOfTask12() {
        final String NAME_OF_TASK12 = "Build a pile of Cubes";

        final String DESCRIPTION_OF_TASK12 = """
                Your task is to construct a building which will be a pile of n cubes. The cube at the bottom will have a volume of n^3, the cube above will have volume of (n-1)^3 and so on until the top which will have a volume of 1^3.
                You are given the total volume m of the building. Being given m can you find the number n of cubes you will have to build?
                The parameter of the function findNb (find_nb, find-nb, findNb, ...) will be an integer m and you have to return the integer n such as n^3 + (n-1)^3 + ... + 1^3 = m if such a n exists or -1 if there is no such n.
                Examples:
                findNb(1071225) --> 45
                findNb(91716553919377) --> -1""";

        System.out.println("Your task is: " + NAME_OF_TASK12);
        System.out.println("Description is: " + DESCRIPTION_OF_TASK12);
    }

    public static void conditionOfTask13() {
        final String NAME_OF_TASK13 = "Easy balance checking";

        final String DESCRIPTION_OF_TASK13 = """
                You are given a (small) check book as a - sometimes - cluttered (by non-alphanumeric characters) string:

                "1000.00
                125 Market 125.45
                126 Hardware 34.95
                127 Video 7.45
                128 Book 14.32
                129 Gasoline 16.10"
                The first line shows the original balance. Each other line (when not blank) gives information: check number, category, check amount. (Input form may change depending on the language).
                First you have to clean the lines keeping only letters, digits, dots and spaces.
                Then return a report as a string (underscores show spaces -- don't put them in your solution. They are there so you can see them and how many of them you need to have):
                "Original_Balance:_1000.00
                125_Market_125.45_Balance_874.55
                126_Hardware_34.95_Balance_839.60
                127_Video_7.45_Balance_832.15
                128_Book_14.32_Balance_817.83
                129_Gasoline_16.10_Balance_801.73
                Total_expense__198.27
                Average_expense__39.65"
                On each line of the report you have to add the new balance and then in the last two lines the total expense and the average expense. So as not to have a too long result string we don't ask for a properly formatted result.""";

        System.out.println("Your task is: " + NAME_OF_TASK13);
        System.out.println("Description is: " + DESCRIPTION_OF_TASK13);
    }

    public static void conditionOfTask14() {
        final String NAME_OF_TASK14 = "Floating-point Approximation (I)";

        final String DESCRIPTION_OF_TASK14 = """
                Consider the function      
                f: x -> sqrt(1 + x) - 1 at x = 1e-15.
                We get: f(x) = 4.44089209850062616e-16 
                or something around that, depending on the language.
                This function involves the subtraction of a pair of similar numbers when x is near 0 and the results are significantly erroneous in this region. Using pow instead of sqrt doesn't give better results.               
                A "good" answer is 4.99999999999999875... * 1e-16. 
                Can you modify f(x) to give a good approximation of f(x) in the neighborhood of 0?""";

        System.out.println("Your task is: " + NAME_OF_TASK14);
        System.out.println("Description is: " + DESCRIPTION_OF_TASK14);
    }

    public static void conditionOfTask15() {
        final String NAME_OF_TASK15 = "Rainfall";

        final String DESCRIPTION_OF_TASK15 = """
                data and data1 are two strings with rainfall records of a few cities for months from January to December. The records of towns are separated by \\n. 
                The name of each town is followed by :.
                data and towns can be seen in "Your Test Cases:".
                Task:
                function: mean(town, strng) should return the average of rainfall for the city town and the strng data or data1 (In R and Julia this function is called avg).
                function: variance(town, strng) should return the variance of rainfall for the city town and the strng data or data1.
                Examples:
                mean("London", data), 51.19(9999999999996)\s
                variance("London", data), 57.42(833333333374)""";

        System.out.println("Your task is: " + NAME_OF_TASK15);
        System.out.println("Description is: " + DESCRIPTION_OF_TASK15);
    }

    public static void conditionOfTask16() {
        final String NAME_OF_TASK16 = "Ranking NBA teams";

        final String DESCRIPTION_OF_TASK16 = """
                You are given a string with results of NBA teams (see the data in "Sample Tests") separated by commas e.g:        
                r = Los Angeles Clippers 104 Dallas Mavericks 88,New York Knicks 101 Atlanta Hawks 112,Indiana Pacers 103 Memphis Grizzlies 112, Los Angeles Clippers 100 Boston Celtics 120.         
                A team name is composed of one, two or more words built with letters or digits: Atlanta Hawks, Philadelphia 76ers...
                Given a string of results and the name of a team (parameter : to_find) your function nba_cup (or nbaCup or ...) will return as a string       
                    - the name of the team followed by : and
                    - the number of matches won by the team
                    - the number of draws
                    - the number of matches lost by the team
                    - the total number of points scored by the team
                    - the total number of points conceded by the team
                and finally a kind of marks in our ranking system           
                    - a team marks 3 if it is a win
                    - a team marks 1 if it is a draw
                    - a team marks 0 if it is a loss.
                The return format is:           
                "Team Name:W=nb of wins;D=nb of draws;L=nb of losses;Scored=nb;Conceded=nb;Points=nb\"""";

        System.out.println("Your task is: " + NAME_OF_TASK16);
        System.out.println("Description is: " + DESCRIPTION_OF_TASK16);
    }

    public static void conditionOfTask17() {
        final String NAME_OF_TASK17 = "Help the bookseller!";

        final String DESCRIPTION_OF_TASK17 = """
                A bookseller has lots of books classified in 26 categories labeled A, B, ... Z. Each book has a code c of 3, 4, 5 or more characters. The 1st character of a code is a capital letter which defines the book category.
                In the bookseller's stocklist each code c is followed by a space and by a positive integer n (int n >= 0) which indicates the quantity of books of this code in stock.
                For example an extract of a stocklist could be:
                    L = {"ABART 20", "CDXEF 50", "BKWRK 25", "BTSQZ 89", "DRTYM 60"}.
                    or
                    L = ["ABART 20", "CDXEF 50", "BKWRK 25", "BTSQZ 89", "DRTYM 60"] or ....
                    
                You will be given a stocklist (e.g. : L) and a list of categories in capital letters e.g :
                    M = {"A", "B", "C", "W"}\s
                    or
                    M = ["A", "B", "C", "W"] or ...
                and your task is to find all the books of L with codes belonging to each category of M and to sum their quantity according to each category.
                For the lists L and M of example you have to return the string (in Haskell/Clojure/Racket a list of pairs):
                    (A : 20) - (B : 114) - (C : 50) - (W : 0)""";

        System.out.println("Your task is: " + NAME_OF_TASK17);
        System.out.println("Description is: " + DESCRIPTION_OF_TASK17);
    }

    public static void conditionOfTask18() {
        final String NAME_OF_TASK18 = "Gap in Primes";

        final String DESCRIPTION_OF_TASK18 = """
                The prime numbers are not regularly spaced. For example from 2 to 3 the gap is 1. From 3 to 5 the gap is 2. From 7 to 11 it is 4. 
                Between 2 and 50 we have the following pairs of 2-gaps primes: 3-5, 5-7, 11-13, 17-19, 29-31, 41-43
                We will write a function gap with parameters:
                     - g (integer >= 2) which indicates the gap we are looking for              
                     - m (integer > 2) which gives the start of the search (m inclusive)           
                     - n (integer >= m) which gives the end of the search (n inclusive)            
                n won't go beyond 1100000.
                Examples:
                gap(2, 5, 7) --> [5, 7] or (5, 7) or {5, 7}      
                gap(2, 5, 5) --> nil. In C++ {0, 0}. In F# [||]. In Kotlin, Dart and Prolog return []`            
                gap(4, 130, 200) --> [163, 167] or (163, 167) or {163, 167}""";

        System.out.println("Your task is: " + NAME_OF_TASK18);
        System.out.println("Description is: " + DESCRIPTION_OF_TASK18);
    }

    public static void conditionOfTask19() {
        final String NAME_OF_TASK19 = "Trailing zeros in factorial";

        final String DESCRIPTION_OF_TASK19 = """
                Write a program that will calculate the number of trailing zeros in a factorial of a given number.
                N! = 1 * 2 * 3 * ... * N
                Be careful 1000! has 2568 digits...
                Examples
                zeros(6) = 1
                # 6! = 1 * 2 * 3 * 4 * 5 * 6 = 720 --> 1 trailing zero 
                zeros(12) = 2
                # 12! = 479001600 --> 2 trailing zeros""";

        System.out.println("Your task is: " + NAME_OF_TASK19);
        System.out.println("Description is: " + DESCRIPTION_OF_TASK19);
    }

    public static void conditionOfTask20() {
        final String NAME_OF_TASK20 = "Perimeter of squares in a rectangle";

        final String DESCRIPTION_OF_TASK20 = """
                The drawing shows 6 squares the sides of which have a length of 1, 1, 2, 3, 5, 8. It's easy to see that the sum of the perimeters of these squares is :
                4 * (1 + 1 + 2 + 3 + 5 + 8) = 4 * 20 = 80
                Could you give the sum of the perimeters of all the squares in a rectangle when there are n + 1 squares disposed in the same manner as in the drawing:
                Examples:
                perimeter(5)  should return 80
                perimeter(7)  should return 216""";

        System.out.println("Your task is: " + NAME_OF_TASK20);
        System.out.println("Description is: " + DESCRIPTION_OF_TASK20);
    }

    public static void conditionOfTask21() {
        final String NAME_OF_TASK21 = "Which x for that sum?";

        final String DESCRIPTION_OF_TASK21 = """
                Consider the sequence U(n, x) = x + 2x**2 + 3x**3 + .. + nx**n where x is a real number and n a positive integer.
                When n goes to infinity and x has a correct value (ie x is in its domain of convergence D), U(n, x) goes to a finite limit m depending on x.
                Usually given x we try to find m. Here we will try to find x (x real, 0 < x < 1) when m is given (m real, m > 0).
                Let us call solve the function solve(m) which returns x such as U(n, x) goes to m when n goes to infinity.
                Examples:
                solve(2.0) returns 0.5 since U(n, 0.5) goes to 2 when n goes to infinity.
                solve(8.0) returns 0.7034648345913732 since U(n, 0.7034648345913732) goes to 8 when n goes to infinity.
                Note:
                You pass the tests if abs(actual - expected) <= 1e-12""";

        System.out.println("Your task is: " + NAME_OF_TASK21);
        System.out.println("Description is: " + DESCRIPTION_OF_TASK21);
    }
}

