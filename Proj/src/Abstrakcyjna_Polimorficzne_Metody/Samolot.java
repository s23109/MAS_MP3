package Abstrakcyjna_Polimorficzne_Metody;

import java.time.Year;
import java.util.Date;

public class Samolot extends Pojazd{

    public int rok_Produkcji;

    public Samolot(String marka, String model, Double price, int rok_Produkcji) {
        super(marka, model, price);
        this.rok_Produkcji = rok_Produkcji;
    }

    @Override
    public Double getMarketPrice() {
        if (rok_Produkcji<2000){
            return (this.price / 2);
        }

        return this.price;
    }
}
