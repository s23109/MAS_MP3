package Overlapping;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;

public class Konto {
    private EnumSet<Typ_Konta> typ_kontas = EnumSet.of(Typ_Konta.Public);
    private static List<Konto> extend = new ArrayList<>();
    String login;
    String hasło;

    Optional<Double> stan_konta;


    public Konto(String login, String hasło, double stan_konta, Typ_Konta typKonta) {
        this.login = login;
        this.hasło = hasło;
        this.stan_konta = Optional.of(stan_konta);
        this.typ_kontas.add(typKonta);
        extend.add(this);
    }

    public Konto(String login, String hasło, double stan_konta, List<Typ_Konta> typKonta) {
        this.login = login;
        this.hasło = hasło;
        this.stan_konta = Optional.of(stan_konta);
        this.typ_kontas.addAll(typKonta);
        extend.add(this);
    }

    public Konto(String login, String hasło,List<Typ_Konta> typKonta) {
        this.login = login;
        this.hasło = hasło;
        this.stan_konta = Optional.empty();
        this.typ_kontas.addAll(typKonta);
        extend.add(this);
    }

    public Konto(String login, String hasło,Typ_Konta typKonta) {
        this.login = login;
        this.hasło = hasło;
        this.stan_konta = Optional.empty();
        this.typ_kontas.add(typKonta);
        extend.add(this);
    }

    public Konto getKonto (String login) throws Exception {
        if (this.typ_kontas.contains(Typ_Konta.Pracownik)){
            return extend.stream().filter(e -> e.login.equals(login)).findFirst().orElse(null);
        }else {
            throw new Exception("Access Denied");
        }
    }

    public double getStan_konta(){
        return stan_konta.orElse(0.0);
    }

    public List<Konto> getExtend () throws Exception{
        if (this.typ_kontas.contains(Typ_Konta.Pracownik)){
            return extend;
        }else {
            throw new Exception("Access Denied");
        }
    }

    public void getTypes (){
        System.out.println("Types for account login: " + this.login);
        for (Typ_Konta t: typ_kontas) {
            System.out.println(t);
        }
    }


}
