package classes.avto;

import java.util.Collection;

public class Auto {

    private String model;
    private String carBrand;
    private String transmission;
    private int numberOfSeats;

    public Auto(String model, String carBrand, String transmission, int numberOfSeats) {
        this.model = model;
        this.carBrand = carBrand;
        this.transmission = transmission;
        this.numberOfSeats = numberOfSeats;
    }

    public String getModel(String e) {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "model='" + model + '\'' +
                ", carBrand='" + carBrand + '\'' +
                ", transmission='" + transmission + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                '}';
    }


}

