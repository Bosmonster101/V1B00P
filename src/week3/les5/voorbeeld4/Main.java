package week3.les5.voorbeeld4;

public class Main {
    public static void main(String[] args) {
        Winkel winkel = new Winkel("Jumbo Parkwijk");
        Klant klant1 = new Klant("Jan de Wit","Straatweg 45","Edam");
        Klant klant2 = new Klant("Kees de Bruin","Lindelaan 12", "Abcoude");
        System.out.println(winkel);
        winkel.voegKlantToe(klant1);
        winkel.voegKlantToe(klant2);
        System.out.println(winkel);
    }
}
