package string;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilsTest {
    @Test
    public void getTheBiggestString() {
        String[] strings = {
                "Картина, бумага, перо",
                "Абстракция, инкапсуляция",
                "Наследования, полиморфизм",
                "Кинотеатр, попкорн",
        };
        BigString bigString = StringUtils.getTheBiggestStringFromArray(strings);
        Assert.assertEquals(25,bigString.getLength());
        Assert.assertEquals("Наследования, полиморфизм",bigString.getValue());


    }
    @Test
    public void whenEmptyArrayString() {
        String[] strings = {};
        BigString bigString = StringUtils.getTheBiggestStringFromArray(strings);
        Assert.assertNull(bigString);

    }
}

