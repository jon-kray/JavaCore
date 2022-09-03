package houses;

public class House {

    private Fundament fundament;

    private Residents[] residents;


    public House(Fundament fundament) {
        this.fundament = fundament;
    }

    public Fundament getFundament() {
        return fundament;
    }

    public Residents[] getResidents() {
        return residents;
    }

    public void setResidents(Residents[] residents) {
        this.residents = residents;
    }
}
