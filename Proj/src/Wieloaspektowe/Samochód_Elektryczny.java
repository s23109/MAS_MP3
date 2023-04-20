package Wieloaspektowe;

public class Samochód_Elektryczny extends Typ_Paliwa {
    double zasieg;
    String czasLadowaniaWGodzinach;

    public Samochód_Elektryczny(String nazwa_Paliwa, Samochód samochód, double zasieg, String czasLadowaniaWGodzinach) throws Exception {
        super(nazwa_Paliwa, samochód);
        this.zasieg = zasieg;
        this.czasLadowaniaWGodzinach = czasLadowaniaWGodzinach;
    }

    @Override
    public String getTypPaliwaInfo() {
        return this.nazwa_Paliwa + " : Zasięg: " + this.zasieg + " | Czas Ładowania w H: " + this.czasLadowaniaWGodzinach;
    }
}
