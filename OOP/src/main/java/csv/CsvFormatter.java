package csv;

public class CsvFormatter {

    private final String DELIMITER_PERSONS = ";";
    private final String DELIMITER_FIELD = ",";
    private final String DELIMITER_KEY_VALUE = "=";
    private final int LIMIT = 2;


    /**
     * Данный метод принимает строку представленную в формате csv
     * и возвращает массив объектов по параметрам.
     * считается что строка передается в правильном формате.
     * @param csvString строка csv
     */
    public Person[] getPersonsFromCsvFile(String csvString) {
        String[] newString = csvString.split(DELIMITER_PERSONS);
        Person[] person = new Person[newString.length];
        int i = newString.length - 1;
        for (String persons : newString) {
            person[i--] = new Person(
                    persons.split(DELIMITER_FIELD)[0].split(DELIMITER_KEY_VALUE)[1],
                    persons.split(DELIMITER_FIELD)[1].split(DELIMITER_KEY_VALUE)[1]);


        }
        return person;
    }
}
