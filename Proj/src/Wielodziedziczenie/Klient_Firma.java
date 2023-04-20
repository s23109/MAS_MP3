package Wielodziedziczenie;

public class Klient_Firma extends Uzytkownik_systemu implements IKlient{

    String nr_Regon;

    private Klient klientinfo;

    public Klient_Firma(String email, String adress, String name, String nr_Regon, String clientOpinion, int clientPurchases) throws Exception {
        super(email, adress, name);
        this.nr_Regon = nr_Regon;
        this.klientinfo = Klient.createKlient(clientOpinion,clientPurchases,this);
        this.hasKlientAttached = true;
    }

    public Klient_Firma(String email, String adress, String name, String nr_Regon, Klient klient){
        super(email, adress, name);
        this.nr_Regon = nr_Regon;

        this.klientinfo = klient;
        this.hasKlientAttached = true;

    }
    @Override
    public String getClientOpinon() {
        return klientinfo.clientOpinion;
    }

    @Override
    public int getClientPurchases() {
        return klientinfo.clientPurchases;
    }



}
