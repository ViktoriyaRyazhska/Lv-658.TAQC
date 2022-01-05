package tasks;

public class Second {

                                                                                        //Volume of a cuboid

//    Length - 6.3
//    Width - 2
//    Height - 5
//    Expected output is 63.0

    public static double getVolume(final double length, final double width, final double height) {
        if (length <= 0 || width <= 0 || height <= 0) return 0;
        return length * width * height;
    }

}
