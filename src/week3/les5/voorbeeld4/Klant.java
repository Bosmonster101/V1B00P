package week3.les5.voorbeeld4;

public class Klant {
    private String naam;
    private String adres;
    private String plaats;

    public Klant(String naam, String adres, String plaats) {
        this.naam = naam;
        this.adres = adres;
        this.plaats = plaats;
    }

    public String toString(){
        String s =naam+" woont op "+adres+" in "+plaats;
        return s;
    }
}
