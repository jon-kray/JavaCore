package zoo;

public class ZooService {

    public long getAveragePriceByZoos(zoo[] zoos){

        double allPrices = 0;

       for (zoo zoo : zoos) {
           allPrices = allPrices + zoo.getPrice();
            
       }
       long result = Math.round(allPrices / zoos.length);
       return result;
    }
    public ZooResult getNameByTheBiggestZoos(zoo[] zoos) {

        String title = "";
        int countAnimalsInZoo = 0;

        for (zoo zoo : zoos) {
            int animalSize = zoo.getAnimals().length;
            if(animalSize > countAnimalsInZoo){
                countAnimalsInZoo = animalSize;
                title = zoo.getTitle();

            }
        }
        return new ZooResult(title, countAnimalsInZoo);
    }


}
