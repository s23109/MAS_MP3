package Wieloaspektowe;

public class Samochód_Ciężarowy extends Samochód{

    int dmc;

    public Samochód_Ciężarowy(String nazwa, int iloscMiejscSiedzacych, Typ_Paliwa_Enum typPaliwaEnum, Object param1, Object param2, Object param3, int dmc) throws Exception {
        super(nazwa, iloscMiejscSiedzacych, typPaliwaEnum, param1, param2, param3);
        this.dmc = dmc;
    }
    
    @Override
    public String getBasicInfo() {
        return "Samochód Ciężarowy: " + this.nazwa + " Ilość Miejsc Siedzących: "  + this.iloscMiejscSiedzacych +" DMC: " + this.dmc + " \nDane o typie paliwa: " + this.typPaliwa.getTypPaliwaInfo();
    }
    
}
