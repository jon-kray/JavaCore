import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SecondArrayTaskTest {
    @Test

    public void fullSize(){
        int[] firstArray = new int[10];
        int[] secondArray = new int[15];
        int expectedResult = 25;
        int result = SecondArrayTask.fullSize(firstArray, secondArray);
        Assert.assertEquals(expectedResult, result);


    }



}