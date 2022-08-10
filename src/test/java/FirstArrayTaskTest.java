import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FirstArrayTaskTest {
    @Test
    public void testEvenNumber() {
        int[] numbers = new int[5];
        numbers[0] = 13;
        numbers[1] = 16;
        numbers[2] = 8;
        numbers[3] = 2;
        numbers[4] = 9;
        int expectedResult = 3;
        int result = FirstArrayTask.getCountEvenNumbers(numbers);
        Assert.assertEquals(expectedResult, result);
    }
}