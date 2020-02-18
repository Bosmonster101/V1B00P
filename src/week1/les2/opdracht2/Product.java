package week1.les2.opdracht2;

public class Product {
    private String naam;
    private String code;
    private double prijs;
    private double btw;

    public Product(String nm,String cd,double pr) {
        naam = nm;
        code = cd;
        prijs = pr;
        btw = 0.0;
    }

    public Product(String nm,String cd) {
        naam = nm;
        code = cd;
        prijs = 0.0;
        btw = 0.0;
    }
// getters en setters
    public double getPrijs() {
        return prijs;
    }

    public double getBtw() {
        return btw;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    public void setBtw(double btw) {
        this.btw = btw;
    }

    public void verhoogPrijsMet(double extra) {
        prijs = prijs + prijs*extra/100;
    }

    public double btwBedrag() {
        return prijs * btw/ 100;
    }

    public String  toString() {
        String s = naam+" heeft code "+code+" en kost: "+prijs+"; de btw is "+btw+ "%";
        return s;
    }
}
