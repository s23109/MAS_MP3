package Wieloaspektowe;

public abstract class Samochód {

    String nazwa;

    int iloscMiejscSiedzacych;

    Typ_Paliwa typPaliwa;

    public Samochód(String nazwa, int iloscMiejscSiedzacych, Typ_Paliwa typPaliwa) throws Exception {
        if (typPaliwa.samochód != null){
            throw new Exception("Typ_Paliwa ma już przypisany obiekt Samochód");
        }

        this.nazwa = nazwa;
        this.iloscMiejscSiedzacych = iloscMiejscSiedzacych;
        this.typPaliwa = typPaliwa;
        typPaliwa.samochód = this;
    }

    public Samochód(String nazwa, int iloscMiejscSiedzacych) {
        this.nazwa = nazwa;
        this.iloscMiejscSiedzacych = iloscMiejscSiedzacych;

    }

    public void CreateTypPaliwa_Spalinowy(String nazwa_Paliwa, double spalanieNaSto, double pojemnosc) throws Exception {
        if (this.typPaliwa != null){
            throw new Exception("Samochód ma już typ paliwa");
        }
        Samochód_Spalinowy samochódSpalinowy = Samochód_Spalinowy.CreateSamochódSpalinowy(nazwa_Paliwa,this,spalanieNaSto,pojemnosc);

        this.typPaliwa = samochódSpalinowy;

    }

    public void CreateTypPaliwa_Elektryczny (String nazwa_Paliwa, double zasieg, String rodzajBaterii) throws Exception {
        if (this.typPaliwa != null){
            throw new Exception("Samochód ma już typ paliwa");
        }
        Samochód_Elektryczny samochódElektryczny = Samochód_Elektryczny.CreateSamochódElektryczny(nazwa_Paliwa,this,zasieg,rodzajBaterii);

        this.typPaliwa = samochódElektryczny;

    }


    public String getBasicInfo(){
        return null;
    }


}
