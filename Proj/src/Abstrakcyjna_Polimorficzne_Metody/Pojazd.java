package Abstrakcyjna_Polimorficzne_Metody;

public abstract class Pojazd {
    String Marka;
    String Model;

    Double price;

    public Pojazd(String marka, String model, Double price) {
        Marka = marka;
        Model = model;
        this.price = price;
    }

    public abstract Double getMarketPrice();

}
