package week2.les4.voorbeeld1;

public class Rekening {
    private int nummer;
    private double saldo;
//extra atribut van klassen klant met rol naam uit uml
    private Klant rekeninghouder;


    public Rekening(int nummer) {
        this.nummer = nummer;
    }
    // getters en setters


    public int getNummer() {
        return nummer;
    }

    public double getSaldo() {
        return saldo;
    }
    // extra getter om klantobject op te vragen
    public Klant getRekeninghouder(){
        return rekeninghouder;
    }

    public void stort(double bedrag) {
        saldo+= bedrag;
    }

    public void neemOp(double bedrag) {
        saldo-=bedrag;
    }

    // extra setter om klantobject aan rekening object te koppelen
    public void setRekeninghouder(Klant klant){
        rekeninghouder= klant;
    }

    // uitbreiden van tostring methode met check of er een klant object is gekoppeld
    public String toString(){
        String s ="Op rekening "+nummer+" staat "+saldo;
        //er is nog geen klant object gekoppeld
        if (rekeninghouder == null ){
            s +=" en de rekening houder is onbekend";
        }
        //er is wel een klantobject gekoppeld
        else {
            s +="\n en de rekeninghouder is: "+rekeninghouder;
        }
        return s;
    }

}
