package Wielodziedziczenie;

public class Klient implements IKlient {


    String clientOpinion;

    int clientPurchases;


    public Klient(String clientOpinion, int clientPurchases) {
        this.clientOpinion = clientOpinion;
        this.clientPurchases = clientPurchases;
    }

    @Override
    public String getClientOpinon() {
        return null;
    }

    @Override
    public int getClientPurchases() {
        return 0;
    }
}

