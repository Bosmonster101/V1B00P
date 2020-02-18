package week2.les4.voorbeeld2;

public class Klant {
    private String naam;
    private String adres;
    private String plaats;
    private Rekening mijnRekening;

    public Klant(String naam, String adres, String plaats) {
        this.naam = naam;
        this.adres = adres;
        this.plaats = plaats;
    }

    public void setMijnRekening(Rekening r){
        mijnRekening = r;
    }

    public Rekening getMijnRekening(){
        return mijnRekening;
    }

    public String toString(){
        String s =naam+" woont op "+adres+" in "+plaats;
        //er is nog geen klant object gekoppeld
        if (mijnRekening == null ){
            s +=" en de rekening is onbekend";
        }
        //er is wel een klantobject gekoppeld
        else {
            s +="\n en "+mijnRekening;
        }
        return s;
    }

}
