package Wieloaspektowe;

public class Samochód_Ciężarowy extends Samochód{

    int dmc;

    public Samochód_Ciężarowy(String nazwa, int iloscMiejscSiedzacych, int dmc) {
        super(nazwa, iloscMiejscSiedzacych);
        this.dmc = dmc;
    }


    @Override
    public String getBasicInfo() {
        return "Samochód Ciężarowy: " + this.nazwa + " Ilość Miejsc Siedzących: "  + this.iloscMiejscSiedzacych +" DMC: " + this.dmc + " \nDane o typie paliwa: " + this.typPaliwa.getTypPaliwaInfo();
    }
    
}
