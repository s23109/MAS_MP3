package Wielodziedziczenie;

public class Klient  {


    String clientOpinion;

    int clientPurchases;


    private Klient(String clientOpinion, int clientPurchases) {
        this.clientOpinion = clientOpinion;
        this.clientPurchases = clientPurchases;
    }




    public static Klient createKlient(String clientOpinion, int clientPurchases, Uzytkownik_systemu uzytkownikSystemu) throws Exception {
        if (uzytkownikSystemu==null){
            throw new Exception("Obiekt klient musi mieć przypisanego użytkownika");
        }

        if (uzytkownikSystemu.hasClientAttached()){
            throw new Exception("Obiekt ma już przypisany atrybuty obiektu klient");
        }

        return new Klient(clientOpinion,clientPurchases);

    }

}

