package Wieloaspektowe;

public class Samochód_Spalinowy extends Typ_Paliwa {

    double spalanieNaSto;
    double pojemnosc;

    public Samochód_Spalinowy(String nazwa_Paliwa, Samochód samochód, double spalanieNaSto, double pojemnosc) throws Exception {
        super(nazwa_Paliwa, samochód);
        this.spalanieNaSto = spalanieNaSto;
        this.pojemnosc = pojemnosc;
    }

    @Override
    public String getTypPaliwaInfo() {
        return this.nazwa_Paliwa + " : Pojemność: " + this.pojemnosc + " | Spalanie na 100km: " + this.spalanieNaSto;
    }


}
