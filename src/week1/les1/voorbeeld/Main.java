package week1.les1.voorbeeld;

public class Main {
    public static void main(String[] args) {
        Klant klant1 = new Klant("Jan","Nijenoord 1","Utrecht");
        Klant klant2 = new Klant("Wim","Oudenoord 340","Utrecht");
        //System.out.println(klant1.naam); werkt niet want naam is private
        //System.out.println(klant1); werkt niet goed want klasse klant heeft nog geen tostring methode

        //na getter aan gemaakt
        System.out.println(klant1.toString());

        //klant1.setAdres("Vreeburg 38");
        //klant2.setPlaats("Amsterdam");
        System.out.println(klant1);
        System.out.println(klant2);
    }
}
