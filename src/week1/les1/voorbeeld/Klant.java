package week1.les1.voorbeeld;


public class Klant {
    //atributen
    private String naam;
    private String adres;
    private String plaats;

    //constructor
    public Klant(String nm, String adr, String pl) {
        naam= nm;
        adres=adr;
        plaats= pl;
    }

    //getters: methoden om waarden van atributen op te vragen

    public String getNaam() {
        return naam;
    }

    public String getAdres() {
        return adres;
    }

    public String getPlaats() {
        return plaats;
    }

    //toString methode
    public String toString() {
        String s = naam+ " woont op "+adres+ " in "+plaats;
        return s;
    }

    //setters
    public void setNaam(String nm) {
        this.naam = naam;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public void setPlaats(String plaats) {
        this.plaats = plaats;
    }
}

