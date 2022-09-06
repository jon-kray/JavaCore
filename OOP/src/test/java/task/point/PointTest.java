package task.point;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {
    @Test
    public void distancePoint() {
        Point firstPoint = new Point(1, 2);
        Point secondPoint = new Point(3, 6);
        double result = firstPoint.distance(secondPoint);
        double expectedFromFirstToSecond = 4.47213595499958;
        Assert.assertEquals(expectedFromFirstToSecond, result, 0.01);
        System.out.println(result);
    }

}