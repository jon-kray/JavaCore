package classes.avto;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class AutoServiceTest {
    private Auto[] autos = {
            new Auto("m5", "bmw", "at", 2),
            new Auto("e 34", "mersedes", "mech", 4),
            new Auto("rio", "kia", "at", 4),
            new Auto("g 63", "mersedes", "at", 2),
            new Auto("e 200", "mersedes", "at", 4)
    };

    @Test
    public void getOnlyBmwCar() {


        AutoService autoService = new AutoService();
        Auto[] resultArray = autoService.getOnlyBmwCars(autos, "bmw");
        Arrays.stream(resultArray).forEach(System.out::println);

    }


   @Test
    public void getSportCars() {


        AutoService autoService = new AutoService();
        Auto[] resultArray = autoService.getSportCars(autos, 2);
        Arrays.stream(resultArray).forEach(System.out::println);

    }
    @Test
    public void getOnlyAutomaticTypeCars() {
        AutoService autoService = new AutoService();
        Auto[] resultArray = autoService.getOnlyAutomaticTypeCars(autos, "at");
        Arrays.stream(resultArray).forEach(System.out::println);


    }
    @Test
    public void getOnlyMercedesE() {
        AutoService autoService = new AutoService();
        Auto[] resultArray = autoService.getOnlyMercedesE(autos, "mercedes", "e");
        Arrays.stream(resultArray).forEach(System.out::println);
    }
}















