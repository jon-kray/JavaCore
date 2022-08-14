package classes.avto;

public class AutoService {

    /**
     * Данный метод возвращает автомобили марки BMW
     * @param autos все автомобили
     * @return массив автомобилей БМВ.
     */

    public Auto[] getOnlyBmwCars(Auto[] autos, String carBrand) {

        int count = 0;

        for (Auto auto : autos) {
            if (auto.getCarBrand().equals(carBrand)) {
                count++;
            }

        }
        Auto[] result = new Auto[count];

        for (Auto auto : autos) {
            if (auto.getCarBrand().equals(carBrand)) {
                count--;
                result[count] = auto;
            }
        }


        return result;
    }

    /**
     * Принято считать что если автомобиль двух-местный, то он из спорт-класса
     * Данный метод возвращает автомобили спорт-класса
     * @param autos все автомобили
     * @return автомобили спорт-класса
     */
    public Auto[] getSportCars(Auto[] autos, int numberOfSeats) {

        int count = 0;

        for (Auto auto : autos){
            if (auto.getNumberOfSeats() == 2){
                count++;
            }

        }
        Auto[] result = new Auto[count];

        for (Auto auto : autos){
            if (auto.getNumberOfSeats() == 2){
                count--;
                result[count] = auto;
            }
        }
        return result;
    }

    /**
     * Данный метод возвращает автомобили только с автоматической коробкой передач
     * @param autos все автомобили
     * @return автомобили с автоматической коробкой передач.
     */
    public Auto[] getOnlyAutomaticTypeCars(Auto[] autos, String typeTransmission) {

        int count = 0;

        for (Auto auto : autos) {
            if (auto.getTransmission().equals(typeTransmission)) {
                count++;
            }

        }
        Auto[] result = new Auto[count];

        for (Auto auto : autos) {
            if (auto.getTransmission().equals(typeTransmission)) {
                count--;
                result[count] = auto;
            }
        }
        return result;
    }

    /**
     * Данный метод возвращает автомобили Мерседес Е класс
     * @param autos все автомобили
     * @return все автомобили Мерседес Е класса.
     */

    public Auto[] getOnlyMercedesE(Auto[] autos, String carBrand, String model) {

        int count = 0;

        for (Auto auto : autos) {
            if (auto.getCarBrand().equals("mercedes") && auto.getModel("").contains("e")) {
                count++;
            }

        }
        Auto[] result = new Auto[count];

        for (Auto auto : autos) {
            if (auto.getCarBrand().equals("mercedes") && auto.getModel("").contains("e")) {
                count--;
                result[count] = auto;
            }
        }
        return result;
    }
}




