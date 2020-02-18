package week1.les2.opdracht1;

public class Rekening {
    private int nummer;
    private double saldo;

    public Rekening(int nr) {
        nummer = nr;
    }
// getter
    public int getNummer() {
        return nummer;
    }

    public double getSaldo() {
        return saldo;
    }
// methode
    public void stort(double bedrag) {
        saldo = saldo + bedrag;
    }
    public void neemOp(double bedrag) {
        saldo = saldo - bedrag;
    }
    //tostring
    public String toString() {
        String s = "Het nummer is " + nummer + " en het saldo bedraagt "+saldo;
        return s;
    }
}
