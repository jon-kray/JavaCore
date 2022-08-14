package zoo;

import java.util.Arrays;

public class zoo {

    private double price;

    private String title;

    private Animal[] animals;

    public zoo(double price, String title, Animal[] animals) {
        this.price = price;
        this.title = title;
        this.animals = animals;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    @Override
    public String toString() {
        return "zoo{" +
                "price=" + price +
                ", title='" + title + '\'' +
                ", animals=" + Arrays.toString(animals) +
                '}';
    }
}
