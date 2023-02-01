package service;

import java.util.Arrays;

public class Service {
    private final String SPACE_DELIMITER = " ";
    private final String COMMA_DELIMITER = ",";

    private ServiceRepository serviceRepository;



    public Service(ServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }


    public void getOnlyName() {
        for (String string : serviceRepository.findAll()) {
            System.out.println(string.split(SPACE_DELIMITER)[0]);
        }
    }
    public void getOnlyDataBaseName() {
        for (String string : serviceRepository.findAll()) {
            System.out.println(string.split(COMMA_DELIMITER)[0]);
        }
    }

}
