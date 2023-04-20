package Wieloaspektowe;

public abstract class Typ_Paliwa {
    String nazwa_Paliwa;

    public Samochód samochód;

    public Typ_Paliwa(String nazwa_Paliwa, Samochód samochód) throws Exception {
        if (samochód.typPaliwa != null){
            throw new Exception("Samochód ma już przypisany obiekt Typ_Paliwa");
        }
        this.nazwa_Paliwa = nazwa_Paliwa;
        this.samochód = samochód;
        samochód.typPaliwa = this;
    }

    public String getNazwa_Paliwa() {
        return nazwa_Paliwa;
    }

    public String getTypPaliwaInfo(){
        return null;
    }

}
