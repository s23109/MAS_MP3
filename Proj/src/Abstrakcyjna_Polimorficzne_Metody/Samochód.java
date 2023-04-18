package Abstrakcyjna_Polimorficzne_Metody;

public class Samochód extends Pojazd{

    Float przebieg;

    public Samochód(String marka, String model, Double price, Float przebieg) {
        super(marka, model, price);
        this.przebieg = przebieg;
    }

    @Override
    public Double getMarketPrice() {
        return (this.price)/(this.przebieg / 200000);
    }

}
