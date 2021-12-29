package tasks;

public class BuildAPileOfCubes {
}
    public static long findNb(long m) {
        long mm = 0;
        long n = 0;
        while(mm < m){
            n = n + 1;
            mm = mm + n * n * n;
        }
        if(mm == m){
            return n;
        }
        return -1;
    }

    public static void main(String args[]){
        System.out.println("enter you volume :");
        Scanner Scan = new Scanner(System.in);
        int input1 = Scan.nextInt();
//        findNb(10);
        System.out.println(findNb(input1));
    }
