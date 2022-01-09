package taskstest;

public class LookingForABenefactorTest {
    @Test
    public void Test4T(){
        LookingForABenefactor T4T = new LookingForABenefactor();
        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();

        x.add(1);
        x.add(2);
        x.add(3);
        y.add(2);
        List res = T4T.funct(x,y);
        Assert.assertEquals("[2]",res.toString());
    }
    private static void testing(long actual, long expected) {
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void Test4T2(){
        LookingForABenefactor T4T = new LookingForABenefactor();
        List x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();

        x.add(14);
        x.add(30);
        x.add(5);
        x.add(7);
        x.add(9);
        x.add(11);
        x.add(15);

        y.add(30);

        List res = T4T.funct(x,y);
        Assert.assertEquals("[149]",res.toString());
    }

}
