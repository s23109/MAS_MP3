package Dynamic;

public class Bezrobotny extends Osoba {

    String powodZwolnienia;

    public Bezrobotny(String imie, String nazwisko, String powodZwolnienia) {
        super(imie, nazwisko);
        this.powodZwolnienia = powodZwolnienia;
    }


    public Bezrobotny(Zatrudniony zat , String powodZwolnienia){
        super(zat.imie, zat.nazwisko);
        this.powodZwolnienia = powodZwolnienia;
    }


    @Override
    public String toString() {
        return "Bezrobotny{" +
                "powodZwolnienia='" + powodZwolnienia + '\'' +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }


}
