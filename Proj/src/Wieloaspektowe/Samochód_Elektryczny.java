package Wieloaspektowe;

public class Samochód_Elektryczny extends Typ_Paliwa {
    double zasieg;
    String czasLadowaniaWGodzinach;

    public static Samochód_Elektryczny CreateSamochódElektryczny (String nazwa_Paliwa, Samochód samochód, double zasieg, String czasLadowaniaWGodzinach) throws Exception {
        if (samochód.typPaliwa != null){
            throw new Exception("Samochód ma już przypisany typ paliwa");
        }

        Samochód_Elektryczny samochódElektryczny = new Samochód_Elektryczny(nazwa_Paliwa,samochód,zasieg,czasLadowaniaWGodzinach);
        return samochódElektryczny;
    }

    private Samochód_Elektryczny(String nazwa_Paliwa, Samochód samochód, double zasieg, String czasLadowaniaWGodzinach){
        this.nazwa_Paliwa = nazwa_Paliwa;
        this.samochód= samochód;
        samochód.typPaliwa = this;
        this.zasieg = zasieg;
        this.czasLadowaniaWGodzinach = czasLadowaniaWGodzinach;
    }

    @Override
    public String getTypPaliwaInfo() {
        return this.nazwa_Paliwa + " : Zasięg: " + this.zasieg + " | Czas Ładowania w H: " + this.czasLadowaniaWGodzinach;
    }
}
