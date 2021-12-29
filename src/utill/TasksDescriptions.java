package utill;

public enum TasksDescriptions {
    FIRST("Nathan loves cycling.\n " +
            "Because Nathan knows it is important to stay hydrated, he drinks 0.5 litres of water per hour of cycling.\n" +
            "You get given the time in hours and you need to return the number of litres Nathan will drink, rounded to the smallest value.\n" +
            "For example:\n" +
            "time = 3 ----> litres = 1\n" +
            "time = 6.7---> litres = 3\n" +
            "time = 11.8--> litres = 5"),
    SECOND("Bob needs a fast way to calculate the volume of a cuboid with three values: length, width and the height of the cuboid.\n Write a function to help Bob with this calculation."),
    THIRD("Sometimes, I want to quickly be able to convert miles per imperial gallon into kilometers per liter.\n" +
            "Create an application that will display the number of kilometers per liter (output) based on the number of miles per imperial gallon (input).\n" +
            "Make sure to round off the result to two decimal points. If the answer ends with a 0, it should be rounded off without the 0. So instead of 5.50, we should get 5.5.\n" +
            "Some useful associations relevant to this kata: 1 Imperial Gallon = 4.54609188 litres 1 Mile = 1.609344 kilometres\n\n" +
            "Please, enter miles per gallon to convert into kilometers per liter : "),
    FOURTH("#To square(root) or not to square(root)\n" +
            "Write a method, that will get an integer array as parameter and will process every number from this array.\n" +
            "Return a new array with processing every number of the input-array like this:\n" +
            "If the number has an integer square root, take this, otherwise square the number.\n" +
            "[4,3,9,7,2,1] -> [2,9,3,49,4,1]\n" +
            "The input array will always contain only positive numbers and will never be empty or null.\n" +
            "\n" +
            "The input array should not be modified!"),
    FIFTH("Given an array of integers.\n" +
            "\n" +
            "Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers.\n" +
            "\n" +
            "If the input array is empty or null, return an empty array.\n" +
            "\n" +
            "Example\n" +
            "For input [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15], you should return [10, -65]."),
    SEVENTH("Wilson primes satisfy the following condition. Let P represent a prime number.\n" +
            "Then ((P-1)! + 1) / (P * P) should give a whole number.\n" +
            "Your task is to create a function that returns true if the given number is a Wilson prime.\n\n" +
            "Please, enter number, which you want to check: "),
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
    FIFTEENTH("This function involves the subtraction of a pair of similar numbers when x is near 0 \n"
            +"and the results are significantly erroneous in this region.\n"
            + " Using pow instead of sqrt doesn't give better results.\n"
            + "A \"good\" answer is 4.99999999999999875... * 1e-16.\n" +
            "Can you modify f(x) to give a good approximation of f(x) in the neighborhood of 0?"),
    NINETEENTH("Each morning a man walks to work, and each afternoon he walks back home.\n"
            + "If it is raining in the morning and he has an umbrella at home, he takes an umbrella for the journey\n"
            +"so he doesn't get wet, and stores it at work. Likewise, if it is raining in the afternoon \n"
            +"and he has an umbrella at work, he takes an umbrella for the journey home.\n"
            + "Given an array of the weather conditions, your task is to work out the minimum number of umbrellas he needs\n"
            +"to start with in order that he never gets wet. He can start with some umbrellas at home and some at work,\n"
            +"but the output is a single integer, the minimum total number.\n"
            + "The input is an array/list of consecutive half-day weather forecasts. So, e.g. the first value is the 1st day's morning weather\n"
            +"and the second value is the 1st day's afternoon weather. \n"
            +"The options are \"clear\", \"sunny\", \"cloudy\", \"rainy\", \"windy\" or \"thunderstorms\"."),
    EXIT("The End! Thank You!");
    private String description;

    private TasksDescriptions(String description) {
        this.description = description;
    }

    public void getDescription() {
        System.out.println(description);
    }
}
