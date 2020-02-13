package practicum2.b;

public class Voetbalclub {
    private String naam;
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;

    public Voetbalclub(String naam) {
        this.naam = naam;
    }

    public void verwerkResultaat(char ch) {
        if (ch == 'w'){
            aantalGewonnen = aantalGewonnen + 1;
        }
        if (ch == 'g') {
            aantalGelijk = aantalGelijk + 1;
        }
        if (ch == 'v') {
            aantalVerloren = aantalVerloren + 1;
        }
    }

    public int aantalGespeeld() {
        return aantalGewonnen + aantalGelijk + aantalVerloren;
    }

    public int aantalPunten() {
        return (aantalGewonnen * 3)+(aantalGelijk * 1)+(aantalVerloren*0);
    }

    public String toString() {
        return naam+" "+aantalGespeeld()+" "+aantalGewonnen+" "+aantalGelijk+" "+aantalVerloren+" "+aantalPunten();
    }
}
