package utill;

public enum TasksDescriptions {
    FIRST("Nathan loves cycling.\n "+
            "Because Nathan knows it is important to stay hydrated, he drinks 0.5 litres of water per hour of cycling.\n" +
            "You get given the time in hours and you need to return the number of litres Nathan will drink, rounded to the smallest value.\n" +
            "For example:\n"+
            "time = 3 ----> litres = 1\n" +
            "time = 6.7---> litres = 3\n" +
            "time = 11.8--> litres = 5"),
    SECOND("Bob needs a fast way to calculate the volume of a cuboid with three values: length, width and the height of the cuboid.\n Write a function to help Bob with this calculation."),
    THIRD("Sometimes, I want to quickly be able to convert miles per imperial gallon into kilometers per liter.\n" +
            "Create an application that will display the number of kilometers per liter (output) based on the number of miles per imperial gallon (input).\n" +
            "Make sure to round off the result to two decimal points. If the answer ends with a 0, it should be rounded off without the 0. So instead of 5.50, we should get 5.5.\n" +
            "Some useful associations relevant to this kata: 1 Imperial Gallon = 4.54609188 litres 1 Mile = 1.609344 kilometres\n\n"+
            "Please, enter miles per gallon to convert into kilometers per liter : "),
    FOURTH("#To square(root) or not to square(root)\n" +
            "Write a method, that will get an integer array as parameter and will process every number from this array.\n" +
            "Return a new array with processing every number of the input-array like this:\n" +
            "If the number has an integer square root, take this, otherwise square the number.\n" +
            "[4,3,9,7,2,1] -> [2,9,3,49,4,1]\n" +
            "The input array will always contain only positive numbers and will never be empty or null.\n" +
            "\n" +
            "The input array should not be modified!\n\n"),
    FIFTH("Given an array of integers.\n" +
            "\n" +
            "Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers.\n" +
            "\n" +
            "If the input array is empty or null, return an empty array.\n" +
            "\n" +
            "Example\n" +
            "For input [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15], you should return [10, -65]."),
    SIXTH("CONVERT A STRING TO A NUMBER \n" +
            "Would you like to transform a string into a number?"),
    SEVENTH("Wilson primes satisfy the following condition. Let P represent a prime number.\n" +
            "Then ((P-1)! + 1) / (P * P) should give a whole number.\n" +
            "Your task is to create a function that returns true if the given number is a Wilson prime.\n\n" +
            "Please, enter number, which you want to check: "),
    EIGHTH("Each number should be formatted that it is rounded to two decimal places. You don't need to check whether\n" +
            "the input is a valid number because only valid numbers are used in the tests.\n" +
            "Example:\n" +
            "5.5589 is rounded 5.56\n" +
            "3.3424 is rounded 3.34\n\n"),
    TENTH("""
            LOOKING FOR A BENEFACTOR\s
            Would you like to help an accountant John to calculate how much the next benefactor\s
            should give to the association so that the average of the first n + 1 donations should reach the average?"""),
    ELEVENTH("Your task is to write a function which returns the sum of following series upto nth term(parameter).\n" +
            "Series: 1 + 1/4 + 1/7 + 1/10 + 1/13 + 1/16 +...\n" +
            "Rules:\n" +
            "You need to round the answer to 2 decimal places and return it as String.\n" +
            "If the given value is 0 then it should return 0.00\n" +
            "You will only be given Natural Numbers as arguments.\n" +
            "Examples:(Input --> Output)\n" +
            "1 --> 1 --> \"1.00\"\n" +
            "2 --> 1 + 1/4 --> \"1.25\"\n" +
            "5 --> 1 + 1/4 + 1/7 + 1/10 + 1/13 --> \"1.57\""),
    TWELVETH("Vasya Pupkin just started learning Java and C#. At first, he decided to write simple program that\n" +
            "was supposed to sum up two small numbers (numbers and their sum fit in a byte), but it didn't work.\n" +
            "Vasya was too sad to find out what is wrong. Help him to correct the mistake.\n\n"),
    FOURTEENTH("""
            EASY BALANCE CHECKING\s
            Would you like to see the following report. The first line shows the original balance.\s
            Each other line (when not blank) gives information: check number, category, check amount.
             On each line of the report you will see the new balance\s
            and then in the last two lines the total expense and the average expense."""),
    FIFTEENTH("This function involves the subtraction of a pair of similar numbers when x is near 0 \n"
            + "and the results are significantly erroneous in this region.\n"
            + " Using pow instead of sqrt doesn't give better results.\n"
            + "A \"good\" answer is 4.99999999999999875... * 1e-16.\n" +
            "Can you modify f(x) to give a good approximation of f(x) in the neighborhood of 0?"),
    SIXTEENTH("'data' and 'data1' are two strings with rainfall records of a few cities for months from January to December.\n" +
            "The records of towns are separated by \\n. The name of each town is followed by :.\n" +
            "'data' and 'towns' can be seen in \"Your Test Cases:\".\n" +
            "Task:\n" +
            "function: mean(town, strng) should return the average of rainfall for the city 'town' and the 'strng' 'data' or 'data1' (In R and Julia this function is called avg).\n" +
            "function: variance(town, strng) should return the variance of rainfall for the city town and the strng data or data1.\n" +
            "Examples:\n" +
            "mean(\"London\", data), 51.19(9999999999996) \n" +
            "variance(\"London\", data), 57.42(833333333374)\n" +
            "Notes:\n" +
            "if functions mean or variance have as parameter town a city which has no records return -1 or -1.0 (depending on the language)\n\n"),
    EIGHTEENTH("HELP THE BOOKSELLER \n" +
            "Would you like to help the bookseller to put in order a book stocklist?"),
    NINETEENTH("Each morning a man walks to work, and each afternoon he walks back home.\n"
            + "If it is raining in the morning and he has an umbrella at home, he takes an umbrella for the journey\n"
            + "so he doesn't get wet, and stores it at work. Likewise, if it is raining in the afternoon \n"
            + "and he has an umbrella at work, he takes an umbrella for the journey home.\n"
            + "Given an array of the weather conditions, your task is to work out the minimum number of umbrellas he needs\n"
            + "to start with in order that he never gets wet. He can start with some umbrellas at home and some at work,\n"
            + "but the output is a single integer, the minimum total number.\n"
            + "The input is an array/list of consecutive half-day weather forecasts. So, e.g. the first value is the 1st day's morning weather\n"
            + "and the second value is the 1st day's afternoon weather. \n"
            + "The options are \"clear\", \"sunny\", \"cloudy\", \"rainy\", \"windy\" or \"thunderstorms\"."),
    TWENTIETH("The prime numbers are not regularly spaced. For example from 2 to 3 the gap is 1. From 3 to 5 the gap is 2.\n" +
            "From 7 to 11 it is 4. Between 2 and 50 we have the following pairs of 2-gaps primes: 3-5, 5-7, 11-13, 17-19, 29-31, 41-43\n" +
            "We will write a function gap with parameters:\n" +
            "g (integer >= 2) which indicates the gap we are looking for\n" +
            "m (integer > 2) which gives the start of the search (m inclusive)\n" +
            "n (integer >= m) which gives the end of the search (n inclusive)\n" +
            "n won't go beyond 1100000.\n" +
            "In the example above gap(2, 3, 50) will return [3, 5] or (3, 5) or {3, 5} which is the first pair between 3 and 50 with a 2-gap.\n" +
            "So this function should return the first pair of two prime numbers spaced with a gap of g between the limits m, n if these\n" +
            "numbers exist otherwise `nil or null or None or Nothing (or ... depending on the language).\n" +
            "Examples:\n" +
            "gap(2, 5, 7) --> [5, 7] or (5, 7) or {5, 7}\n" +
            "gap(2, 5, 5) --> nil. In C++ {0, 0}. In F# [||]. In Kotlin, Dart and Prolog return []`\n" +
            "gap(4, 130, 200) --> [163, 167] or (163, 167) or {163, 167}\n" +
            "([193, 197] is also such a 4-gap primes between 130 and 200 but it's not the first pair)\n" +
            "gap(6,100,110) --> nil or {0, 0} or ... : between 100 and 110 we have 101, 103, 107, 109\n" +
            "but 101-107is not a 6-gap because there is 103in between and 103-109is not a 6-gap because there is 107in between.\n\n"),
    TWENTYSECOND("PERIMETER OF SQUARES IN A RECTANGLE \n" +
            "Would you like to get the sum of the perimeters of all the squares in a rectangle when there are n + 1 squares?"),
    TWENTYTHIRD("Consider the sequence U(n, x) = x + 2x**2 + 3x**3 + .. + nx**n where x is a real number and n a positive integer.\n" +
            "When n goes to infinity and x has a correct value (ie x is in its domain of convergence D), U(n, x) goes to a finite limit m depending on x.\n" +
            "Usually given x we try to find m. Here we will try to find x (x real, 0 < x < 1) when m is given (m real, m > 0).\n" +
            "Let us call solve the function solve(m) which returns x such as U(n, x) goes to m when n goes to infinity.\n" +
            "Examples:\n" +
            "solve(2.0) returns 0.5 since U(n, 0.5) goes to 2 when n goes to infinity.\n" +
            "solve(8.0) returns 0.7034648345913732 since U(n, 0.7034648345913732) goes to 8 when n goes to infinity."),
    TWENTYFOURTH("You have a positive number n consisting of digits. You can do at most one operation: Choosing the\n" +
            "index of a digit in the number, remove this digit at that index and insert it back to another or at the same\n" +
            "place in the number in order to find the smallest number you can get.\n" +
            "Task:\n" +
            "Return an array or a tuple or a string depending on the language (see \"Sample Tests\") with\n" +
            "the smallest number you got\n" +
            "the index i of the digit d you took, i as small as possible\n" +
            "the index j (as small as possible) where you insert this digit d to have the smallest number.\n" +
            "Examples:\n" +
            "smallest(261235) --> [126235, 2, 0] or (126235, 2, 0) or \"126235, 2, 0\"\n" +
            "126235 is the smallest number gotten by taking 1 at index 2 and putting it at index 0\n" +
            "smallest(209917) --> [29917, 0, 1] or ...\n" +
            "[29917, 1, 0] could be a solution too but index `i` in [29917, 1, 0] is greater than \n" +
            "index `i` in [29917, 0, 1].\n" +
            "29917 is the smallest number gotten by taking 2 at index 0 and putting it at index 1 which gave 029917 which is the number 29917.\n" +
            "smallest(1000000) --> [1, 0, 6]\n\n"),
    NINTH("Complete the function which takes two arguments and returns all numbers which are divisible by the given divisor. First argument is an array of numbers and the second is the divisor.\n" +
            "\n" +
            "Example\n" +
            "divisibleBy([1, 2, 3, 4, 5, 6], 2) == [2, 4, 6]"),
    THIRTEEN("Your task is to construct a building which will be a pile of n cubes. The cube at the bottom will have a volume of n^3, the cube above will have volume of (n-1)^3 and so on until the top which will have a volume of 1^3.\n" +
            "\n" +
            "You are given the total volume m of the building. Being given m can you find the number n of cubes you will have to build?\n" +
            "\n" +
            "The parameter of the function findNb (find_nb, find-nb, findNb, ...) will be an integer m and you have to return the integer n such as n^3 + (n-1)^3 + ... + 1^3 = m if such a n exists or -1 if there is no such n.\n" +
            "\n" +
            "Examples:\n" +
            "findNb(1071225) --> 45\n" +
            "\n" +
            "findNb(91716553919377) --> -1"),
    TWENTY_FIRST("Write a program that will calculate the number of trailing zeros in a factorial of a given number.\n" +
            "\n" +
            "N! = 1 * 2 * 3 * ... * N"),

    EXIT("The End! Thank You!"),
    RAINFALL_DATA("Rome:Jan 81.2,Feb 63.2,Mar 70.3,Apr 55.7,May 53.0,Jun 36.4,Jul 17.5,Aug 27.5,Sep 60.9,Oct 117.7,Nov 111.0,Dec 97.9" +
            "\n" +
            "London:Jan 48.0,Feb 38.9,Mar 39.9,Apr 42.2,May 47.3,Jun 52.1,Jul 59.5,Aug 57.2,Sep 55.4,Oct 62.0,Nov 59.0,Dec 52.9" +
            "\n" +
            "Paris:Jan 182.3,Feb 120.6,Mar 158.1,Apr 204.9,May 323.1,Jun 300.5,Jul 236.8,Aug 192.9,Sep 66.3,Oct 63.3,Nov 83.2,Dec 154.7" +
            "\n" +
            "NY:Jan 108.7,Feb 101.8,Mar 131.9,Apr 93.5,May 98.8,Jun 93.6,Jul 102.2,Aug 131.8,Sep 92.0,Oct 82.3,Nov 107.8,Dec 94.2" +
            "\n" +
            "Vancouver:Jan 145.7,Feb 121.4,Mar 102.3,Apr 69.2,May 55.8,Jun 47.1,Jul 31.3,Aug 37.0,Sep 59.6,Oct 116.3,Nov 154.6,Dec 171.5" +
            "\n" +
            "Sydney:Jan 103.4,Feb 111.0,Mar 131.3,Apr 129.7,May 123.0,Jun 129.2,Jul 102.8,Aug 80.3,Sep 69.3,Oct 82.6,Nov 81.4,Dec 78.2" +
            "\n" +
            "Bangkok:Jan 10.6,Feb 28.2,Mar 30.7,Apr 71.8,May 189.4,Jun 151.7,Jul 158.2,Aug 187.0,Sep 319.9,Oct 230.8,Nov 57.3,Dec 9.4" +
            "\n" +
            "Tokyo:Jan 49.9,Feb 71.5,Mar 106.4,Apr 129.2,May 144.0,Jun 176.0,Jul 135.6,Aug 148.5,Sep 216.4,Oct 194.1,Nov 95.6,Dec 54.4" +
            "\n" +
            "Beijing:Jan 3.9,Feb 4.7,Mar 8.2,Apr 18.4,May 33.0,Jun 78.1,Jul 224.3,Aug 170.0,Sep 58.4,Oct 18.0,Nov 9.3,Dec 2.7" +
            "\n" +
            "Lima:Jan 1.2,Feb 0.9,Mar 0.7,Apr 0.4,May 0.6,Jun 1.8,Jul 4.4,Aug 3.1,Sep 3.3,Oct 1.7,Nov 0.5,Dec 0.7");
    private String description;

    private TasksDescriptions(String description) {
        this.description = description;
    }

    public void getDescription() {
        System.out.println(description);
    }

    public String takeDescription() {
        return description;
    }
}
