import Abstrakcyjna_Polimorficzne_Metody.*;
import Overlapping.Konto;
import Overlapping.Typ_Konta;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        System.out.println("ABSTRACT + POLI_METHOD");

        Samolot samolot = new Samolot("PLANE","ASD", 1000.0,1999);
        Samochód samochód = new Samochód("CAR", "ASD", 12300.0 , 300000f);

        //Pojazd pojazd = new Pojazd() ;

        System.out.println("Samolot: " + samolot.getMarketPrice());
        System.out.println("Samochód: " + samochód.getMarketPrice());

        System.out.println("==================================");
        // Overlapping za pomocą ,,zastąpienia hierarchii'' jedną klasą
        System.out.println("OVERLAPPING");
        Konto kontoKli = new Konto("kli","aa", 200.0,Typ_Konta.Klient);
        Konto kontoPrac = new Konto("prac","asd",Typ_Konta.Pracownik);
        Konto all = new Konto("all","all", List.of(Typ_Konta.Klient,Typ_Konta.Pracownik));

        all.getTypes();
        //System.out.println(kontoPrac.getStan_konta());
        try {
            Konto tempacc = kontoKli.getKonto("prac");
            System.out.println("Balance of prac " + tempacc.getStan_konta() );
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            Konto tempacc = kontoPrac.getKonto("kli");
            System.out.println("Balance of kli " + tempacc.getStan_konta() );
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("==================================");

        System.out.println("Wielodziedziczenie");

    }
}