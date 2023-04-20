package Wieloaspektowe;

public class Samochód_Spalinowy extends Typ_Paliwa {

    double spalanieNaSto;
    double pojemnosc;

    public static Samochód_Spalinowy CreateSamochódSpalinowy (String nazwa_Paliwa, Samochód samochód, double spalanieNaSto, double pojemnosc) throws Exception {
        if (samochód.typPaliwa != null){
            throw new Exception("Samochód ma już przypisany typ paliwa");
        }
        Samochód_Spalinowy samochódSpalinowy = new Samochód_Spalinowy(nazwa_Paliwa,samochód,spalanieNaSto,pojemnosc);
        return samochódSpalinowy;

    }

    private Samochód_Spalinowy(String nazwa_Paliwa, Samochód samochód, double spalanieNaSto, double pojemnosc){
        this.nazwa_Paliwa = nazwa_Paliwa;
        this.samochód = samochód;
        samochód.typPaliwa = this;
        this.spalanieNaSto = spalanieNaSto;
        this.pojemnosc = pojemnosc;
    }

    @Override
    public String getTypPaliwaInfo() {
        return this.nazwa_Paliwa + " : Pojemność: " + this.pojemnosc + " | Spalanie na 100km: " + this.spalanieNaSto;
    }


}
