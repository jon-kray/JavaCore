package service;

public class MemRepository implements ServiceRepository{
    public String[] findAll() {
        return new String[] {"Nikita Nesterenko", "Danila Orbanin", "Andrey Zaikovich"};
    }
}
