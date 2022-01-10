package utill;
class PositiveNumberException extends Exception {
    public PositiveNumberException(String str) {
        super(str);
    }
}
public class CustomException {
    static void validatePositive(float number) throws PositiveNumberException {
        if (number < 0) {
            throw new PositiveNumberException("Your number is negative!");
        }
    }
}
