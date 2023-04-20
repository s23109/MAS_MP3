package Wielodziedziczenie;

public abstract class Uzytkownik_systemu implements IUzytkownik_systemu{

    String email;
    String adress;
    String name;

    boolean hasKlientAttached;

    public Uzytkownik_systemu(String email, String adress, String name) {
        this.email = email;
        this.adress = adress;
        this.name = name;

        this.hasKlientAttached = false;
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

    @Override
    public boolean hasClientAttached() {
        return hasKlientAttached;
    }
}
