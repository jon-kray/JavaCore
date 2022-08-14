package zoo;

public class ZooResult {
    private String name;

    private int sizeAnimals;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSizeAnimals() {
        return sizeAnimals;
    }

    public void setSizeAnimals(int sizeAnimals) {
        this.sizeAnimals = sizeAnimals;
    }

    public ZooResult(String name, int sizeAnimals) {
        this.name = name;
        this.sizeAnimals = sizeAnimals;
    }
}
