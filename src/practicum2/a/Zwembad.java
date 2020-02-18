package practicum2.a;

public class Zwembad {
    private double breedte;
    private double lengte;
    private double diepte;

    public Zwembad(double br, double len, double dpt) {
        breedte = br;
        lengte = len;
        diepte = dpt;
    }

    public Zwembad() {
    }

    public double inhoud() {
        return breedte*lengte*diepte;
    }
// setters en getters
    public double getBreedte() {
        return breedte;
    }

    public void setBreedte(double breedte) {
        this.breedte = breedte;
    }

    public double getLengte() {
        return lengte;
    }

    public void setLengte(double lengte) {
        this.lengte = lengte;
    }

    public double getDiepte() {
        return diepte;
    }

    public void setDiepte(double diepte) {
        this.diepte = diepte;
    }

    public String toString() {
        String s = "Gegevens zwembad: Dit zwembad is "+breedte+" meter breed, "+lengte+" meter lang, en "+diepte+" meter diep";
        return s;
    }
}
