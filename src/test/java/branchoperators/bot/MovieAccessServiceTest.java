package branchoperators.bot;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MovieAccessServiceTest {
    @Test
    public void accessMovie(){
        int age = -1;
        String expectedResult = "Incorrect age, check the user with the given age" ;
        String result =  MovieAccessService.accessMovie(age);
        Assert.assertEquals(expectedResult, result);
    }

}