package service;

import java.util.Arrays;

public class Service {
    private final String SPACE_DELIMITER = " ";
    private final String COMMA_DELIMITER = ",";

    private MemRepository memRepository;

    private DataBaseRepository dataBaseRepository;

    public Service(MemRepository memRepository) {
        this.memRepository = memRepository;
    }

    public Service(DataBaseRepository dataBaseRepository) {
        this.dataBaseRepository = dataBaseRepository;
    }


    public void getOnlyName() {
        for (String string : memRepository.findAll()) {
            System.out.println(string.split(SPACE_DELIMITER)[0]);
        }
    }
    public void getOnlyDataBaseName() {
        for (String string : dataBaseRepository.findAll()) {
            System.out.println(string.split(COMMA_DELIMITER)[0]);
        }
    }



}
