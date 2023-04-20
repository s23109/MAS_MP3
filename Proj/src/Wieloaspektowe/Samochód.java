package Wieloaspektowe;

public abstract class Samochód {

    String nazwa;

    int iloscMiejscSiedzacych;

    public Typ_Paliwa typPaliwa;

    public Samochód(String nazwa, int iloscMiejscSiedzacych, Typ_Paliwa typPaliwa) throws Exception {
        if (typPaliwa.samochód != null){
            throw new Exception("Typ_Paliwa ma już przypisany obiekt Samochód");
        }

        this.nazwa = nazwa;
        this.iloscMiejscSiedzacych = iloscMiejscSiedzacych;
        this.typPaliwa = typPaliwa;
        typPaliwa.samochód = this;
    }

    public String getBasicInfo(){
        return null;
    }


}
