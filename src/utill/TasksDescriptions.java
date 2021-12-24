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
            "The input array should not be modified!"),
    EXIT("The End! Thank You!");
    private String description;
    private TasksDescriptions( String description)
    {
        this.description = description;
    }

    public void getDescription() {
        System.out.println(description);    }
}
