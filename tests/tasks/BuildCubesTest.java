package tasks;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.IOException;

public class BuildCubesTest {

    @DataProvider(name = "Test-Data-for-FindNb")
    public Object[][] dataProviderPositive() {
        return new Object[][]{
                {4183059834009L, 2022},
                {1071225, 45},
                {135440716410000L, 4824},
                {24723578342962L, -1},
                {91716553919377L, -1}};
    }

    @Test(dataProvider = "Test-Data-for-FindNb")
    public void testPositiveFindNb(long input, int result) {
        Assert.assertEquals(BuildCubes.getFindNb(input), result);
    }

    @Mock
    BufferedReader reader = Mockito.mock(BufferedReader.class);

    @DataProvider(name = "Test-Data-for-Task")
    public Object[][] dataProviderTask() {
        return new Object[][]{
                {4183059834009L},
                {1071225},
                {91716553919377L}};
    }

    @Test(dataProvider = "Test-Data-for-Task")
    public void taskTestBC(long m) throws IOException {
        Mockito.when(reader.readLine()).thenReturn(String.valueOf(m), null);
        BuildCubes.task(reader);
    }
}