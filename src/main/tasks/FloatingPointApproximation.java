package tasks;

public class FloatingPointApproximation {
    public static double floatPoint(double x) {
        return x / (1 + Math.sqrt(1 + x));
    }

    public static void runTask14(BufferedReader reader) throws IOException{
        boolean bool=true;
        while (bool){
            try{
                System.out.println("Type Double like 2,33 of Int like 4");
                Double i = Double.parseDouble(reader.readLine());
                System.out.println(floatPoint(i));
                bool=false;
            }catch (Exception ex){
                System.out.println(ex.getMessage()+"Sorry, try one more time");
                System.out.println("Type Double like 2,33 of Int like 4");
            }
        }

    }
}
