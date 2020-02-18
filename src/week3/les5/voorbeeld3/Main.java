package week3.les5.voorbeeld3;

import java.util.ArrayList;

//opdracht 5.3 uit werkboek
public class Main {
    public static void main(String[] args) {
        // delaclareren en initialiseren van een huisdierenlijst
        ArrayList<Huisdier> huisdierenlijst=new ArrayList<Huisdier>();

        // twee huisdieren object maken
        Huisdier huisdier1 = new Huisdier("Blondie","Golden ritriever");
        Huisdier huisdier2 = new Huisdier("Chico", "Golden ritriever");

        //huisdieren toevoegen aan lijst
        huisdierenlijst.add(huisdier1);
        huisdierenlijst.add(huisdier2);

        //huisdier toevoegen in een regel code
        huisdierenlijst.add(new Huisdier("Zwartje","Vlaamse reus"));

        // toon het aantal dieren van de lijst
        System.out.println("Het aantal dieren is "+huisdierenlijst.size());

        //dieren uitprinten met een for-each loop
        for (Huisdier huisdier: huisdierenlijst){
            System.out.println(huisdier);
        }
        System.out.println();

        //dier toevoegen aan het begin van de lijst
        huisdierenlijst.add(0,new Huisdier("Witje","Siamees"));

        //huisdier op index 2 vervangen door een ander huisdier
        huisdierenlijst.set(3,new Huisdier("Bruno","Duitse herder"));

        //uitprinten met for-lus
        for (int i = 0; i<huisdierenlijst.size(); i++) {
            System.out.println(huisdierenlijst.get(i));
        }

        //bello verwijderen
        System.out.println(huisdierenlijst.remove(huisdier1));

        //huisdier  met index verwijderen

        huisdierenlijst.remove(0);
        System.out.println(huisdierenlijst);

    }
}
