package Wieloaspektowe;

public class Samochód_Osobowy extends Samochód{

        int maksymalnaPredkosc ;

    public Samochód_Osobowy(String nazwa, int iloscMiejscSiedzacych, int maksymalnaPredkosc) {
        super(nazwa, iloscMiejscSiedzacych);
        this.maksymalnaPredkosc = maksymalnaPredkosc;
    }

    @Override
    public String getBasicInfo() {
        return "Samochód Osobowy: " + this.nazwa + " Ilość Miejsc Siedzących: "  + this.iloscMiejscSiedzacych+ " Maksymalna prędkość: " + this.maksymalnaPredkosc +" \nDane o typie paliwa: " + this.typPaliwa.getTypPaliwaInfo();
    }



}
