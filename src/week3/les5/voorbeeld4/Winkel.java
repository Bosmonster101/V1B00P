package week3.les5.voorbeeld4;

import java.util.ArrayList;

public class Winkel {
    private String naam;
    //toevoegen van atribuut klant van het type Arraylist<klant>
    private ArrayList<Klant> klanten;

    public Winkel(String naam){
        this.naam=naam;
        //initialiseer de Arraylist
        this.klanten=new ArrayList<Klant>();
    }

    // getter toevoegen voor de klanten lijst
    public ArrayList<Klant> getKlanten() {
        return klanten;
    }

    //voegtoe methode om een klant toe te voegen
    //let op er is geen check op dubbelen klanten
    public void voegKlantToe(Klant klant){
        klanten.add(klant);
    }

    // verwijder methode toevoegen
    // heeft return type boolean!
    public boolean verwijderKlant(Klant klant){
        return klanten.remove(klant);
    }

    //toString methode uitbreiden
    public String toString(){
        String s="De naam van de winkel is "+naam;
        //de winkel heeft geen klanten
        if (klanten.isEmpty()){
            s+= " en de winkel heeft geen klanten";
        } else {
            s+= " en de klanten zijn:\n";
            for (Klant klant: klanten){
                s+= klant+"\n";
            }
        }
        return s;
    }
}
