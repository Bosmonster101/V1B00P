package practicum2.b;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VoetbalclubTestJoost {
    private Voetbalclub voetbalclub;

    @BeforeEach
    public void init() {
        System.out.println("init");
        voetbalclub = new Voetbalclub("");
    }

    @Test
    void verwerkGewonnenWedstrijd() {
        voetbalclub.verwerkResultaat('w');;
        assertEquals(3, voetbalclub.aantalPunten());
        assertEquals(1, voetbalclub.aantalGespeeld());
        assertTrue(voetbalclub.toString().contains("1 1 0 0 3"));
    }

    @Test
    void verwerkWedstrijdGelijk(){
        voetbalclub.verwerkResultaat('g');
        assertEquals(1, voetbalclub.aantalPunten());
        assertEquals(1, voetbalclub.aantalGespeeld());
        assertTrue(voetbalclub.toString().contains("1 0 1 0 1"));
    }

    @Test
    void verwerkWedstrijdVerloren(){
        voetbalclub.verwerkResultaat('v');
        assertEquals(0, voetbalclub.aantalPunten());
        assertEquals(1, voetbalclub.aantalGespeeld());
        assertTrue(voetbalclub.toString().contains("1 0 0 1 0"));
    }

    @Test
    void verwerkCombiWedstrijd(){
        voetbalclub.verwerkResultaat('w');
        voetbalclub.verwerkResultaat('v');
        assertEquals(3, voetbalclub.aantalPunten());
        assertEquals(2, voetbalclub.aantalGespeeld());
        assertTrue(voetbalclub.toString().contains("2 1 0 1 3"));

    }

    @Test
    void verwerkFouteWedstrijd(){
        voetbalclub.verwerkResultaat('R');
        voetbalclub.verwerkResultaat('Q');
        voetbalclub.verwerkResultaat('m');
        voetbalclub.verwerkResultaat('y');

        assertEquals(0, voetbalclub.aantalPunten() );
        assertEquals(0, voetbalclub.aantalGespeeld());
        assertTrue(voetbalclub.toString().contains("0 0 0 0 0"));
    }

    @Test
    void correcteNaam(){
        assertTrue(voetbalclub.getNaam().equals("FC"));
    }



}