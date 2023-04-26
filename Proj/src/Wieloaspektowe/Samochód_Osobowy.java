package Wieloaspektowe;

public class Samochód_Osobowy extends Samochód{

        int maksymalnaPredkosc ;

    public Samochód_Osobowy(String nazwa, int iloscMiejscSiedzacych, Typ_Paliwa_Enum typPaliwaEnum, Object param1, Object param2, Object param3, int maksymalnaPredkosc) throws Exception {
        super(nazwa, iloscMiejscSiedzacych, typPaliwaEnum, param1, param2, param3);
        this.maksymalnaPredkosc = maksymalnaPredkosc;
    }



    @Override
    public String getBasicInfo() {
        return "Samochód Osobowy: " + this.nazwa + " Ilość Miejsc Siedzących: "  + this.iloscMiejscSiedzacych+ " Maksymalna prędkość: " + this.maksymalnaPredkosc +" \nDane o typie paliwa: " + this.typPaliwa.getTypPaliwaInfo();
    }



}
