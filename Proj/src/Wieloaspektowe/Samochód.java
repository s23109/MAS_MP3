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

    public Samochód(String nazwa, int iloscMiejscSiedzacych, Typ_Paliwa_Enum typPaliwaEnum, Object param1, Object param2, Object param3) throws Exception {
        this.nazwa = nazwa;
        this.iloscMiejscSiedzacych = iloscMiejscSiedzacych;

        if (typPaliwaEnum.equals(Typ_Paliwa_Enum.Elektryczny)){
            if (param1.getClass() == String.class && param2.getClass() == Double.class && param3.getClass() == String.class){
                this.CreateTypPaliwa_Elektryczny((String) param1, (Double) param2, (String) param3);
            }else {
                throw  new Exception("Złe typy danych");
            }


        } else if (typPaliwaEnum.equals(Typ_Paliwa_Enum.Spalinowy)) {
            if (param1.getClass() == String.class && param2.getClass() == Double.class && param3.getClass() == Double.class){
                this.CreateTypPaliwa_Spalinowy((String) param1, (Double) param2, (Double) param3);
            }else {
                throw  new Exception("Złe typy danych");
            }
        } else {
            throw  new Exception("Zły typ paliwa");
        }



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

    public Typ_Paliwa getTypPaliwa () throws Exception {
        if (this.typPaliwa == null){
            throw new Exception("Samochód nie ma przypisanego typu paliwa");
        }
        return  this.typPaliwa;
    }
}
