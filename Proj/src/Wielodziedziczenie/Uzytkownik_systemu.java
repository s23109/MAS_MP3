package Wielodziedziczenie;

public class Uzytkownik_systemu implements IUzytkownik_systemu{

    String email;
    String adress;
    String name;

    public Uzytkownik_systemu(String email, String adress, String name) {
        this.email = email;
        this.adress = adress;
        this.name = name;
    }

    @Override
    public String getContactEmail() {
        return email;
    }

    @Override
    public String getKlientAdress() {
        return adress;
    }

    @Override
    public String getClientName() {
        return name;
    }
}
