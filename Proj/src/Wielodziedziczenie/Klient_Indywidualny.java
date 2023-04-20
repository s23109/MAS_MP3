package Wielodziedziczenie;

public class Klient_Indywidualny extends Uzytkownik_systemu implements IKlient{

    String nrPesel;

    private Klient klientinfo;

    public Klient_Indywidualny(String email, String adress, String name, String nrPesel, String clientOpinion, int clientPurchases) throws Exception {
        super(email, adress, name);
        this.nrPesel = nrPesel;
        this.klientinfo = Klient.createKlient(clientOpinion,clientPurchases,this);
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
