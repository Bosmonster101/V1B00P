package week2.les4.voorbeeld2;

public class Main {
    public static void main(String[] args) {
        Klant klant1 = new Klant("Gino","Heidelberglaan","Utrecht");
        Klant klant2 = new Klant("Aussie","Padualaan","Utrecht");
        System.out.println(klant1);
        System.out.println(klant2);
        System.out.println();

        Rekening rekening1 = new Rekening(12345678);
        Rekening rekening2 = new Rekening(87654321);

        klant1.setMijnRekening(rekening1);
        klant2.setMijnRekening(rekening2);

        klant1.getMijnRekening().stort(1000);
        klant2.getMijnRekening().stort(1503.05);

        System.out.println(klant1);
        System.out.println(klant1.getMijnRekening());
        System.out.println();
        System.out.println(klant2);
        System.out.println(klant2.getMijnRekening());
    }
}
