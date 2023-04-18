import Abstrakcyjna_Polimorficzne_Metody.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        Samolot samolot = new Samolot("PLANE","ASD", 1000.0,1999);
        Samochód samochód = new Samochód("CAR", "ASD", 12300.0 , 300000f);

        System.out.println("Samolot: " + samolot.getMarketPrice());
        System.out.println("Samochód: " + samochód.getMarketPrice());

    }
}