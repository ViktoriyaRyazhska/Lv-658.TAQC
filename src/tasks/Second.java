package tasks;

public class Second {

                                                                                        //Volume of a cuboid

//    Length - 6.3
//    Width - 2
//    Height - 5
//    Expected output is 63.0

    public static String getVolume(final double length, final double width, final double height) {
        double res = length * width * height;
        if (length <= 0 || width <= 0 || height <= 0) return "You should enter only positive values!";
        return "Volume of a cuboid is " + Math.ceil(res);
    }

}
