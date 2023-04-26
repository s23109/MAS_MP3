import Abstrakcyjna_Polimorficzne_Metody.*;
import Dynamic.Bezrobotny;
import Dynamic.Osoba;
import Dynamic.Zatrudniony;
import Overlapping.Konto;
import Overlapping.Typ_Konta;
import Wieloaspektowe.Samochód_Ciężarowy;
import Wieloaspektowe.Samochód_Elektryczny;
import Wieloaspektowe.Samochód_Osobowy;
import Wieloaspektowe.Typ_Paliwa_Enum;
import Wielodziedziczenie.Klient;
import Wielodziedziczenie.Klient_Firma;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        System.out.println("ABSTRACT + POLI_METHOD");

        Pojazd samolot = new Samolot("PLANE","ASD", 1000.0,1999);
        Pojazd samochód = new Samochód("CAR", "ASD", 12300.0 , 300000f);

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

        Klient_Firma klientFirma = null;


        try {
            klientFirma = new Klient_Firma("ss@ss.s", "adress", "Firmm", "123", "aaa", 123);

            System.out.println(klientFirma.getClientPurchases());
            Klient klient =  Klient.createKlient("asd",252,klientFirma);

            System.out.println(klientFirma.getClientPurchases());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("==================================");

        System.out.println("Wieloaspektowe");

        Samochód_Osobowy samochódOsobowy = null;
        try {
            samochódOsobowy = new Samochód_Osobowy("asd",123, Typ_Paliwa_Enum.Spalinowy, "asd",1.0,1.0,123);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        System.out.println(samochódOsobowy.getBasicInfo());

        System.out.println("==================================");

        System.out.println("Dynamiczne");

        Osoba bezrobotny = new Bezrobotny("Imie","Nazw","Pow_Zwol");

        System.out.println(bezrobotny);
        System.out.println(bezrobotny.getClass());

        bezrobotny = new Zatrudniony((Bezrobotny)bezrobotny,123);

        System.out.println(bezrobotny);
        System.out.println(bezrobotny.getClass());

        bezrobotny = new Bezrobotny((Zatrudniony) bezrobotny, "ASD");

        System.out.println(bezrobotny);
        System.out.println(bezrobotny.getClass());





    }
}