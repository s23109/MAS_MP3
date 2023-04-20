package Dynamic;

public class Zatrudniony extends Osoba{

    int pensja;

    public Zatrudniony(String imie, String nazwisko, int pensja) {
        super(imie, nazwisko);
        this.pensja = pensja;
    }

    public Zatrudniony(Bezrobotny bezrobotny , int pensja){
        super(bezrobotny.imie,bezrobotny.nazwisko);
        this.pensja = pensja;
    }
    @Override
    public String toString() {
        return "Zatrudniony{" +
                "pensja=" + pensja +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }
}
