package week1.les2.opdracht1;

public class Main {
    public static void main(String[] args) {
        Rekening rekening1 = new Rekening(12345678);
        Rekening rekening2 = new Rekening(87654321);
        Rekening rekening3 = new Rekening(13245768);
        rekening1.neemOp(45.88);
        rekening2.stort(250);
        rekening2.neemOp(210);
        rekening2.neemOp(50);
        rekening3.stort(567);
        System.out.println("Saldo van rekening 1: "+rekening1.getSaldo());
        System.out.println("Nummer van rekening 2: "+rekening2.getNummer());
        System.out.println(rekening3);

        Rekening rekening4 = null;
        System.out.println(rekening4);
    }
}
