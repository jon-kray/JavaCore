package zoo;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZooServiceTest {
    @Test
    public void getAveragePriceByZoos(){
        zoo safari = new zoo(1000, "Safari", new Animal[]{
                new Animal("Жираф"),
                new Animal("Обезьяна"),
                new Animal("Тигр"),
                new Animal("Крокодил")
        }
        );
        zoo river = new zoo(1200, "River", new Animal[]{
                new Animal("Кинг конг"),
                new Animal("Макака"),
                new Animal("Алигатор")
        }
        );
        zoo tuula = new zoo(1500, "Tuula", new Animal[]{
                new Animal("Годзилла"),
                new Animal("Лев"),
                new Animal("Слон"),
                new Animal("Медведь"),
                new Animal("Козел")
        }
        );
        zoo[] zoos = {safari, river, tuula};

        ZooService zooService = new ZooService();


       long result = zooService.getAveragePriceByZoos(zoos);
        Assert.assertEquals(1233, result);


    }
    @Test
    public void getTheBiggestZoos(){
        zoo safari = new zoo(1000, "Safari", new Animal[]{
                new Animal("Жираф"),
                new Animal("Обезьяна"),
                new Animal("Тигр"),
                new Animal("Крокодил")
        }
        );
        zoo river = new zoo(1200, "River", new Animal[]{
                new Animal("Кинг конг"),
                new Animal("Макака"),
                new Animal("Алигатор")
        }
        );
        zoo tuula = new zoo(1500, "Tuula", new Animal[]{
                new Animal("Годзилла"),
                new Animal("Лев"),
                new Animal("Слон"),
                new Animal("Медведь"),
                new Animal("Козел")
        }
        );
        zoo[] zoos = {safari, river, tuula};
        ZooService zooService = new ZooService();
        ZooResult result = zooService.getNameByTheBiggestZoos(zoos);
        String expectedTitle = "Tuula";
        int expectedAnimalSize = 5;
        System.out.println(result.getName());
        System.out.println(result.getSizeAnimals());
        Assert.assertEquals(expectedTitle, result.getName());
        Assert.assertEquals(expectedAnimalSize, result.getSizeAnimals());


    }

}