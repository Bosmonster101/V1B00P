package week2.les4.voorbeeld1;

public class Main {
    public static void main(String[] args) {
        Rekening rekening1 = new Rekening(12345678);
        Rekening rekening2 = new Rekening(87654321);
        rekening1.stort(150);
        rekening2.stort(300);



        Klant klant1 = new Klant("aussie","idk", "verweg");
        Klant klant2 = new Klant("josso", "een graf","bunnick");

        rekening1.setRekeninghouder(klant1);
        System.out.println(rekening1);

        System.out.println(rekening1.getRekeninghouder());

        rekening2.setRekeninghouder(klant2);
        System.out.println(rekening2);
        System.out.println(rekening2.getRekeninghouder());

    }
}
