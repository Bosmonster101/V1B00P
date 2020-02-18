package week2.les4.voorbeeld2;

public class Rekening {
    private int nummer;
    private double saldo;

    public Rekening(int nummer) {
        this.nummer = nummer;
    }

    public void stort(double bedrag){
        saldo += bedrag;
    }

    public void neemOp(double bedrag){
        saldo -= bedrag;
    }


    public String toString() {
        String s ="Op rekening "+nummer+" staat "+saldo;
        return s;
    }
}
