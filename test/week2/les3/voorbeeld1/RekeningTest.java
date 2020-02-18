package week2.les3.voorbeeld1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RekeningTest {
    private Rekening rekening;

    @BeforeEach
    public void init() {
        System.out.println("init");
        Rekening rekening = new Rekening(12345678);
    }
    @Test
    public void stortenPositiefBedragWijzigSaldo(){
        System.out.println("positief bedrag");
        Rekening rekening = new Rekening(12345678);
        rekening.stort(1000);
        assertEquals(1000, rekening.getSaldo());
    }

    @Test
    public void stortenNegatiefBedragWijzigtSaldoNiet(){
        System.out.println("negatief bedrag");
        Rekening rekening = new Rekening(12345678);
        rekening.stort(-500);
        assertEquals(0,rekening.getSaldo());
    }

}